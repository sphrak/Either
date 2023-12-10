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

import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

private const val s = "original value"

class EitherTest {

    private val standardTestDispatcher = StandardTestDispatcher()

    @Test
    fun `test either right return correct type of instance`() {
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
    fun `test right should return correct type`() {
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
    fun `test suspend call in map`() = runTest {
        val first: () -> Either<String, Unit> = { Unit.asRight() }
        val suspendCall: suspend () -> Unit = { Unit }
        val a = first().map {
            suspendCall()
        }

        assertThat(a.isRight).isTrue()
    }

    @Test
    fun `test suspend call on fnL in map`() = runTest {
        val first: () -> Either<String, Unit> = { "failing fast".asLeft() }
        val suspendCall: suspend () -> String = { "failing" }
        val a = first().map(
            fnL = {
                suspendCall()
            },
            fnR = {
                "nothing important happened on that day"
            }
        )

        assertThat(a.isLeft).isTrue()
    }

    @Test
    fun `test suspend call in flatMap`() = runTest {
        val first: () -> Either<String, Unit> = { Unit.asRight() }
        val suspendCall: suspend () -> Either<String, String> = { "failing".asRight() }
        val a = first().flatMap(
            fnL = {
                "err".asLeft()
            },
            fnR = {
                suspendCall()
            }
        )

        assertThat(a.isRight).isTrue()
    }

    @Test
    fun `test suspend call on fnL in flatMap`() = runTest {
        val first: () -> Either<String, Unit> = { Unit.asRight() }
        val suspendCall: suspend () -> Either<String, String> = { "failing".asRight() }
        val a = first().flatMap(
            fnL = {
                suspendCall()
            },
            fnR = {
                suspendCall()
            }
        )

        assertThat(a.isRight).isTrue()
    }

    @Test
    fun `test nested flatMap calls with transformed return type`() = runTest {

        data class ValueA(val value: String)
        data class ValueB(val value: Int)
        data class ValueC(val value: Long)

        val firstCall: () -> Either<String, ValueA> = { ValueA("1337").asRight() }
        val secondCall: (ValueA) -> Either<String, ValueB> = { ValueB(it.value.toInt()).asRight() }
        val thirdCall: (ValueB) -> Either<String, ValueC> = { ValueC(it.value.toLong()).asRight() }

        val result = firstCall()
            .flatMap {
                secondCall(it)
            }
            .flatMap {
                thirdCall(it)
            }

        assertThat(result.rightOrNull).isEqualTo(ValueC(1337L))
    }

    @Test
    fun `test nested flatMap calls that change the error type along the way`() = runTest {

    }

}