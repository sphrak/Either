---
title: io.github.sphrak.either -
---
//[either](../index.md)/[io.github.sphrak.either](index.md)



# Package io.github.sphrak.either  


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either///PointingToDeclaration/"></a>[Either](-either/index.md)| <a name="io.github.sphrak.either/Either///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>sealed class [Either](-either/index.md)<out [L](-either/index.md), out [R](-either/index.md)>  <br>More info  <br>[Either](-either/index.md) is a monad or result type used to indicate two possible outcomes of a computation[Either.Right](-either/-right/index.md) and [Either.Left](-either/-left/index.md) can be used interchangeably to indicate a left or a right outcome of a computation.  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either//flatMap/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[flatMap](flat-map.md)| <a name="io.github.sphrak.either//flatMap/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>inline fun <[T](flat-map.md), [L](flat-map.md), [R](flat-map.md)> [Either](-either/index.md)<[L](flat-map.md), [R](flat-map.md)>.[flatMap](flat-map.md)(fn: ([R](flat-map.md)) -> [Either](-either/index.md)<[L](flat-map.md), [T](flat-map.md)>): [Either](-either/index.md)<[L](flat-map.md), [T](flat-map.md)>  <br>More info  <br>[Either.flatMap](flat-map.md) Gives access to value [R](flat-map.md) in a lambda if the instance is of [Either.Right](-either/-right/index.md) and wraps and returns the resulting computation in the lambda in Either<L, R>If the instance is [Either.Left](-either/-left/index.md) that is returned and lambda fn will not be executed.  <br><br><br>
| <a name="io.github.sphrak.either//flatMapSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[flatMapSuspend](flat-map-suspend.md)| <a name="io.github.sphrak.either//flatMapSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>inline suspend fun <[T](flat-map-suspend.md), [L](flat-map-suspend.md), [R](flat-map-suspend.md)> [Either](-either/index.md)<[L](flat-map-suspend.md), [R](flat-map-suspend.md)>.[flatMapSuspend](flat-map-suspend.md)(fn: ([R](flat-map-suspend.md)) -> [Either](-either/index.md)<[L](flat-map-suspend.md), [T](flat-map-suspend.md)>): [Either](-either/index.md)<[L](flat-map-suspend.md), [T](flat-map-suspend.md)>  <br>More info  <br>[Either.flatMapSuspend](flat-map-suspend.md) Suspending version of [flatMap](flat-map.md)Gives access to value [R](flat-map-suspend.md) in a lambda if the instance is of [Either.Right](-either/-right/index.md) and wraps and returns the resulting computation in the lambda in Either<L, R>If the instance is [Either.Left](-either/-left/index.md) that is returned and lambda fn will not be executed.  <br><br><br>
| <a name="io.github.sphrak.either//map/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[map](map.md)| <a name="io.github.sphrak.either//map/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[T](map.md), [L](map.md), [R](map.md)> [Either](-either/index.md)<[L](map.md), [R](map.md)>.[map](map.md)(fn: ([R](map.md)) -> [T](map.md)): [Either](-either/index.md)<[L](map.md), [T](map.md)>  <br>More info  <br>[Either.map](map.md) Gives access to value [R](map.md) in a lambda if the instance is of [Either.Right](-either/-right/index.md) and wraps and returns the resulting computation in the lambda in Either<L, R>If the instance is [Either.Left](-either/-left/index.md) that is returned and lambda fn will not be executed.  <br><br><br>

