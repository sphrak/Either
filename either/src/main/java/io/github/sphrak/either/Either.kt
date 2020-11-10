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

/**
 *  [Either] is a monad or result type used to indicate two possible outcomes of a computation
 *
 *  [Either.Right] and [Either.Left] can be used interchangeably to indicate a left or a right outcome
 *  of a computation.
 *
 *  By convention [Either.Left] is often used to indicate an fault or an erroneous computation result.
 *  Because of this methods like `onError`, `onSuccess`, `onResult` exists to allow for more human readable code
 *
 *  @property [isRight] boolean value indicating whether instance is of type [Either.Right]
 *  @property [isLeft] boolean value indicating whether instance is of type [Either.Left]
 */
public sealed class Either<out L, out R> {

    /**
     *  [Left] wrap a value [a] in [Either.Left]
     *
     *  By convention is [Left] used for erroneous states
     *
     *  @param [a] of type [L] the left-hand side value
     *  @return [Either<L, Nothing>]
     */
    data class Left<out L>(val a: L) : Either<L, Nothing>()

    /**
     *  [Right] wrap a value [b] in [Either.Right]
     *
     *  By convention is [Right] used for successful states
     *
     *  @param [b] of type [R] the right-hand side value
     *  @return [Either<Nothing, R>]
     */
    data class Right<out R>(val b: R) : Either<Nothing, R>()

    /**
     *  [isRight] A boolean value indicating whether [Either] is of type [Either.Right]
     *
     *  @return `true` or `false`
     */
    val isRight: Boolean get() = this is Right<R>

    /**
     *  [isLeft] A boolean value indicating whether [Either] is of type [Either.Left]
     *
     *  @return `true` or `false`
     */
    val isLeft: Boolean get() = this is Left<L>

    fun <L> left(a: L): Left<L> = Left(a)
    fun <R> right(b: R): Right<R> = Right(b)

    /**
     *  [either] resolve case [Either.Right] and case [Either.Left] by passing lambdas [fnL] and [fnR].
     *
     *  @receiver [Either.Left]
     *  @receiver [Either.Right]
     *  @param [fnL] lambda to execute when instance is of type Either.Left
     *  @param [fnR] lambda to execute when instance is of type Either.Right
     *
     *  @return [T] value of [Either.Left<T>] or [Either.Right<T>]
     */
    public inline fun <T> either(fnL: (L) -> T, fnR: (R) -> T): T =
        when (this) {
            is Left -> fnL(a)
            is Right -> fnR(b)
        }
}

internal fun <A, B, C> ((A) -> B).c(fn: (B) -> C): (A) -> C = {
    fn(this(it))
}

internal suspend fun <A, B, C> (suspend (A) -> B).cSuspend(fn: suspend (B) -> C): suspend (A) -> C = {
    fn(this(it))
}

/**
 *  [Either.flatMap] Gives access to value [R] in a lambda if the instance is of [Either.Right] and wraps
 *  and returns the resulting computation in the lambda in Either<L, R>
 *
 *  If the instance is [Either.Left] that is returned and lambda [fn] will not be executed.
 *
 *  @receiver [Either.Right]
 *  @param [fn] lambda to be executed in case of [Either.Right<R>]
 *  @return Either<L, R>
 */
public inline fun <T, L, R> Either<L, R>.flatMap(fn: (R) -> Either<L, T>): Either<L, T> =
    when (this) {
        is Either.Left -> this
        is Either.Right -> fn(b)
    }

/**
 *  [Either.flatMapSuspend] Suspending version of [flatMap]
 *
 *  Gives access to value [R] in a lambda if the instance is of [Either.Right] and wraps
 *  and returns the resulting computation in the lambda in Either<L, R>
 *
 *  If the instance is [Either.Left] that is returned and lambda [fn] will not be executed.
 *
 *  @receiver [Either.Right]
 *  @param [fn] lambda to be executed in case of [Either.Right<R>]
 *  @return Either<L, R>
 */
public suspend inline fun <T, L, R> Either<L, R>.flatMapSuspend(fn: (R) -> Either<L, T>): Either<L, T> =
    when (this) {
        is Either.Left -> this
        is Either.Right -> fn(b)
    }

/**
 *  [Either.map] Gives access to value [R] in a lambda if the instance is of [Either.Right] and wraps
 *  and returns the resulting computation in the lambda in Either<L, R>
 *
 *  If the instance is [Either.Left] that is returned and lambda [fn] will not be executed.
 *
 *  @receiver [Either.Right]
 *  @param [fn] lambda to be executed in case of [Either.Right<R>]
 *  @return Either<L, R>
 */
public fun <T, L, R> Either<L, R>.map(fn: (R) -> (T)): Either<L, T> = this.flatMap(fn.c(::right))