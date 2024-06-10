package io.github.sphrak.either.coroutines

import io.github.sphrak.either.Either
import io.github.sphrak.either.cSuspend

public suspend fun <T, L, R> Either<L, R>.flatMap(fn: suspend (R) -> Either<L, T>): Either<L, T> =
    when (this) {
        is Either.Left -> this
        is Either.Right -> fn(b)
    }

public suspend fun <T, L, R> Either<L, R>.map(fn: suspend (R) -> (T)): Either<L, T> =
    this.flatMap(fn.cSuspend(::right))