/*
 * Copyright (c) 2020 Niclas Kron.
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

package io.github.sphrak.either.extension

import io.github.sphrak.either.Either
import io.github.sphrak.either.c
import io.github.sphrak.either.flatMap

/**
 *  [asLeft] Convenience function to wrap a value type [T] in [Either.Left]
 *
 *  @receiver [T]
 *  @return Either.Left<T>
 */
public fun <T> T.asLeft(): Either.Left<T> = Either.Left(this)

/**
 *  [asRight] Convenience function to wrap a value type [T] in [Either.Right]
 *
 *  @receiver [T]
 *  @return [Either.Right<T>]
 */
public fun <T> T.asRight(): Either.Right<T> = Either.Right(this)

/**
 *  [onError] analogues to [Either.map] but for [Either.Left]
 *
 *  @param [fn] lambda to execute in case of [Either.Right]
 *  @receiver [Either.Left]
 *  @return [Either]
 */
public fun <L, R> Either<L, R>.onError(fn: (L) -> Either<L, R>): Either<L, R> =
    when (this) {
        is Either.Left -> fn(a)
        is Either.Right -> this
    }

/**
 *  [onSuccess] analogues to [Either.map]
 *
 *  @param [fn] lambda to execute in case of [Either.Right]
 *  @receiver [Either.Right]
 *  @return [Either]
 */
public fun <L, R> Either<L, R>.onSuccess(fn: (R) -> Either<L, R>): Either<L, R> =
    when (this) {
        is Either.Left -> this
        is Either.Right -> fn(b)
    }

/**
 *  [onResult] Resolve either case [Either.Right] or case [Either.Left]. This is analogues to [Either.either].
 *
 *  @receiver [Either.Right]
 *  @receiver [Either.Left]
 *  @param [onError] function to execute when instance is Either.Left
 *  @param [onSuccess] function to execute when instance is Either.Right
 *
 *  @return [T] value [T] of [Either.Left] or [Either.Right]
 */
public inline fun <T, L, R> Either<L, R>.onResult(onError: (L) -> T, onSuccess: (R) -> T): T =
    when (this) {
        is Either.Left -> onError(a)
        is Either.Right -> onSuccess(b)
    }

/**
 *  [onResultSuspend] Resolve either case [Either.Right] or case [Either.Left]. This is analogues to [eitherSuspend].
 *
 *  @receiver [Either.Right]
 *  @receiver [Either.Left]
 *  @param [onError] function to execute when instance is Either.Left
 *  @param [onSuccess] function to execute when instance is Either.Right
 *
 *  @return [T] value [T] of [Either.Left] or [Either.Right]
 */
public suspend inline fun <T, L, R> Either<L, R>.onResultSuspend(onError: (L) -> T, onSuccess: (R) -> T): T =
    either(fnL = onError, fnR = onSuccess)

/**
 *  [eitherSuspend] Resolve either case [Either.Right] or case [Either.Left]. This is analogues to [Either.either].
 *
 *  @receiver [Either.Right]
 *  @receiver [Either.Left]
 *  @param [onError] function to execute when instance is Either.Left
 *  @param [onSuccess] function to execute when instance is Either.Right
 *
 *  @return [T] value [T] of [Either.Left] or [Either.Right]
 */
public suspend inline fun <T, L, R> Either<L, R>.eitherSuspend(onError: (L) -> T, onSuccess: (R) -> T): T =
    either(fnL = onError, fnR = onSuccess)

/**
 *  [Either.mapSuspend] is a suspending version of [Either.map]
 *
 *  Gives access to value [R] in a lambda if the instance is of [Either.Right] and wraps
 *  and returns the resulting computation in the lambda in Either<L, R>.
 *
 *  If the instance is [Either.Left] that is returned and lambda [fn] will not be executed.
 *
 *  @receiver [Either.Right]
 *  @param [fn] lambda to be executed in case of [Either.Right<R>]
 *  @return Either<L, R>
 */
public suspend fun <T, L, R> Either<L, R>.mapSuspend(fn: (R) -> (T)): Either<L, T> = this.flatMap(fn.c(::right))

/**
 *  [getRightOrNull] Access the value of [Either.Right] or `null`
 *
 *  @return value of [R] or `null`
 *  @receiver [Either.Right]
 */
public inline val <L, R> Either<L, R>.getRightOrNull: R?
    get() = (this as? Either.Right<R>)?.b

/**
 *  [successOrNull] Access the value of [Either.Right] or `null`. This is analogues to [getRightOrNull]
 *
 *  @return value of [R] or `null`
 *  @receiver [Either.Right]
 */
public inline val <L, R> Either<L, R>.successOrNull: R?
    get() = this.getRightOrNull

/**
 *  [getLeftOrNull] Access the value of [Either.Left] or `null`
 *
 *  @return value of [L] or `null`
 *  @receiver [Either.Left]
 */
public inline val <L, R> Either<L, R>.getLeftOrNull: L?
    get() = (this as? Either.Left<L>)?.a

/**
 *  [errorOrNull] Access the value of [Either.Left] or `null`. This is analogues to [getLeftOrNull]
 *
 *  @return value of [L] or `null`
 *  @receiver [Either.Left]
 */
public inline val <L, R> Either<L, R>.errorOrNull: L?
    get() = this.getLeftOrNull