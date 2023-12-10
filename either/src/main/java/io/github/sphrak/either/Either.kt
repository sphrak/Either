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
 * [Either] represents a value of one of two possible types (a disjoint union)
 *
 * Instances of [Either] are either an instance of [Left] or [Right].
 */
public sealed interface Either<out L, out R> {

    /**
     * Represents the left side of [Either] class, typically used for error handling.
     *
     * @param a The value of the left side.
     */
    data class Left<out L>(val a: L) : Either<L, Nothing>

    /**
     * Represents the right side of [Either] class
     * Mnemonically "Right" can be remembered as the "correct" or "right" outcome.
     * @param b The value of the right side.
     */
    data class Right<out R>(val b: R) : Either<Nothing, R>

    /**
     * Checks if the instance is of type [Right].
     *
     * @return `true` if this is a [Right] instance, `false` otherwise.
     */
    val isRight: Boolean get() = this is Right<R>

    /**
     * Checks if the instance is of type [Left].
     *
     * @return `true` if this is a [Left] instance, `false` otherwise.
     */
    val isLeft: Boolean get() = this is Left<L>

    /**
     * Creates a [Left] instance with the given value.
     *
     * @param a The value for the left side.
     * @return An instance of [Left].
     */
    fun <L> left(a: L): Left<L> = Left(a)

    /**
     * Creates a [Right] instance with the given value.
     *
     * @param b The value for the right side.
     * @return An instance of [Right].
     */
    fun <R> right(b: R): Right<R> = Right(b)

    /**
     * Applies one of the given functions based on the type of this [Either].
     *
     * @param fnL Function to apply if this is a [Left].
     * @param fnR Function to apply if this is a [Right].
     *
     * @return Result of applying the function.
     */
    fun <T> either(fnL: (L) -> T, fnR: (R) -> T): T =
        when (this) {
            is Left -> fnL(a)
            is Right -> fnR(b)
        }
}

/**
 * Transforms the value of this [Either] using the given function, preserving the side.
 *
 * @param fnL Function to apply if this is a [Either.Left].
 * @param fnR Function to apply if this is a [Either.Right].
 *
 * @return Transformed [Either] instance.
 */
public inline fun <T, L, R> Either<L, R>.flatMap(
    fnL: ((L) -> Either<L, T>) = ::left,
    fnR: (R) -> Either<L, T>
): Either<L, T> = when (this) {
    is Either.Left -> fnL(a)
    is Either.Right -> fnR(b)
}

/**
 * Transforms the value of this [Either] using the given function, preserving the side.
 *
 * @param fnL Function to apply if this is a [Either.Left].
 * @param fnR Function to apply if this is a [Either.Right].
 * @return Transformed [Either] instance.
 */
public inline fun <T, L, R> Either<L, R>.map(
    fnL: (L) -> (L) = { left -> left },
    fnR: (R) -> (T)
): Either<L, T> = when (this) {
    is Either.Left -> fnL(this.a).asLeft()
    is Either.Right -> fnR(this.b).asRight()
}

/**
 * Wraps a value into a [Either.Left] instance of [Either].
 *
 * @param T The type of the value.
 * @return An instance of [Either.Left] containing the value.
 */
public fun <T> T.asLeft(): Either.Left<T> = Either.Left(this)

/**
 * Wraps a value into a [Either.Right] instance of [Either].
 *
 * @param T The type of the value.
 * @return An instance of [Either.Right] containing the value.
 */
public fun <T> T.asRight(): Either.Right<T> = Either.Right(this)


public val <L, R> Either<L, R>.rightOrNull get() = if (this is Either.Right<R>) this.b else null

public val <L, R> Either<L, R>.leftOrNull get() = if (this is Either.Left<L>) this.a else null