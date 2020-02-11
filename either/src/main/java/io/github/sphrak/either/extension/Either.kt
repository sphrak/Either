package io.github.sphrak.either.extension

import io.github.sphrak.either.Either

fun <T> T.asLeft(): Either.Left<T> = Either.Left(this)
fun <T> T.asRight(): Either.Right<T> = Either.Right(this)