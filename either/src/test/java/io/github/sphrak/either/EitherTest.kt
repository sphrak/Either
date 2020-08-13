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

import io.github.sphrak.either.extension.onError
import io.github.sphrak.either.extension.onResult
import io.github.sphrak.either.extension.onSuccess
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EitherTest {

    @Test
    fun `Either Right should return correct type`() {
        val result: Either.Right<String> = Either.Right("asdf")

        assertThat(result).isInstanceOf(Either::class.java)
        assertThat(result.isRight).isEqualTo(true)
        assertThat(result.isLeft).isEqualTo(false)

        result.either(
            {
            },
            { right ->
                assertThat(right).isInstanceOf(String::class.java)
                assertThat(right).isEqualTo("asdf")
            }
        )
    }

    @Test
    fun `Either right should return correct type`() {
        val result: Either.Right<String> = Either.Right("asdf")

        assertThat(result).isInstanceOf(Either::class.java)
        assertThat(result.isRight).isEqualTo(true)
        assertThat(result.isLeft).isEqualTo(false)

        result.either(
            {
            },
            { right ->
                assertThat(right).isInstanceOf(String::class.java)
                assertThat(right).isEqualTo("asdf")
            }
        )
    }

    @Test
    fun `test onSuccess extension function`() {

        val either: Either.Right<String> = Either.Right("aaaaaaaa")

        either
            .onSuccess {
                assertThat(it).isEqualTo("aaaaaaaa")
            }
    }

    @Test
    fun `test onError extension function`() {

        val either: Either.Left<String> = Either.Left("bbbbbbbb")

        either
            .onError {
                assertThat(it).isEqualTo("bbbbbbbb")
            }
    }

    @Test
    fun `test onResult extension function`() {

        val either: Either.Left<String> = Either.Left("failure")

        either
            .onResult(
                onError = {
                    assertThat(it).isEqualTo("failure")
                },
                onSuccess = {
                }

            )
    }
}