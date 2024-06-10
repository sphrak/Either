package io.github.sphrak.either.coroutines

import io.github.sphrak.either.Either
import io.github.sphrak.either.extension.asRight
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

public fun <L, R> Flow<Either<L, R>>.map(): Flow<R> {
    return flow {
        this@map.collect {
            when (it) {
                is Either.Left -> Unit
                is Either.Right -> {
                    emit(it.b)
                }
            }
        }
    }
}

public suspend fun <L, R> Either<L, List<R>>.filter(predicate: suspend (R) -> Boolean): Either<L, List<R>>
    = when (this) {
    is Either.Left -> this
    is Either.Right -> this.b.filter { predicate(it) }.asRight()
}

public suspend fun <L, R> Either<L, R>.onEach(fn: suspend (R) -> Unit): Either<L, R> {
    return when (this) {
        is Either.Left -> this
        is Either.Right -> {
            fn(this.b)
            this
        }
    }
}