/*
 * Copyright (c) 2019 Niclas Kron.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.sphrak.either

import io.github.sphrak.either.extension.asLeft
import io.github.sphrak.either.extension.asRight
import io.github.sphrak.either.extension.getLeftOrNull
import io.github.sphrak.either.extension.getRightOrNull
import io.github.sphrak.either.extension.mapSuspend
import io.github.sphrak.either.extension.onError
import io.github.sphrak.either.extension.onResult
import io.github.sphrak.either.extension.onResultSuspend
import io.github.sphrak.either.extension.onSuccess
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertTrue

class EitherTest {

    @Test
    fun `test either right return correct type of instance`() {
        val result: Either.Right<String> = Either.Right("asdf")

        assertIs<Either.Right<String>>(result)
        assertTrue { result.isRight }
        assertFalse { result.isLeft }

        result.either(
            {
            },
            { right ->
                assertTrue { right == "asdf" }
            }
        )
    }

    @Test
    fun `test right should return correct type`() {
        val result: Either.Right<String> = Either.Right("asdf")

        assertIs<Either.Right<String>>(result)
        assertTrue { result.isRight }
        assertFalse { result.isLeft }

        result.either(
            {
            },
            { right ->
                assertTrue { right == "asdf" }
            }
        )
    }

    @Test
    fun `test on success when right`() {

        val either: Either.Right<String> = Either.Right("aaaaaaaa")

        either
            .onSuccess {
                assertEquals("aaaaaaaa","aaaaaaaa")
                it.asRight()
            }
    }

    @Test
    fun `test on error when left`() {

        val either: Either.Left<String> = Either.Left("bbbbbbbb")

        either
            .onError {
                assertEquals("bbbbbbbb", it)
                it.asLeft()
            }
    }

    @Test
    fun `test on result when left`() {

        val either: Either.Left<String> = Either.Left("failure")

        either
            .onResult(
                onError = {
                    assertEquals("failure", it)
                },
                onSuccess = {
                    // no op
                }

            )
    }

    @Test
    fun `test on result when right`() {
        val either: Either.Right<String> = Either.Right("success")

        either
            .onResult(
                onError = {
                    // no op
                },
                onSuccess = {
                    assertEquals("success", it)
                }
            )
    }

    @Test
    fun `test get nullable value of Either Right`() {

        val result: Either.Right<String> = "hello its me".asRight()

        val text: String? = result.getRightOrNull
        assertEquals("hello its me", text)
    }

    @Test
    fun `test right value is null when type right is called on instance of left`() {

        val result: Either.Left<String> = "error occurred".asLeft()

        val text: String? = result.getRightOrNull
        val failureText = result.getLeftOrNull

        assertEquals(null, text)
        assertEquals("error occurred", failureText)
    }

    @Test
    fun `test map suspend`(): Unit = runBlocking {

        val result = "asdf".asRight()

        result.mapSuspend {
            assertEquals("asdf", result.b)
        }
    }

    @Test
    fun `test on result suspend`(): Unit = runBlocking {

        val either = "asdf".asRight()

        either.onResultSuspend(
            onError = {
                // no no
            },
            onSuccess = {
                assertEquals("asdf", either.b)
            }
        )
    }
}