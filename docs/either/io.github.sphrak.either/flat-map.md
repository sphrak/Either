---
title: flatMap -
---
//[either](../index.md)/[io.github.sphrak.either](index.md)/[flatMap](flat-map.md)



# flatMap  
[jvm]  
Content  
inline fun <[T](flat-map.md), [L](flat-map.md), [R](flat-map.md)> [Either](-either/index.md)<[L](flat-map.md), [R](flat-map.md)>.[flatMap](flat-map.md)(fn: ([R](flat-map.md)) -> [Either](-either/index.md)<[L](flat-map.md), [T](flat-map.md)>): [Either](-either/index.md)<[L](flat-map.md), [T](flat-map.md)>  
More info  


[Either.flatMap](flat-map.md) Gives access to value [R](flat-map.md) in a lambda if the instance is of [Either.Right](-either/-right/index.md) and wraps and returns the resulting computation in the lambda in Either<L, R>



If the instance is [Either.Left](-either/-left/index.md) that is returned and lambda fn will not be executed.



#### Return  


Either<L, R>



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either//flatMap/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a><receiver>| <a name="io.github.sphrak.either//flatMap/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a><br><br>[Either.Right](-either/-right/index.md)<br><br>
| <a name="io.github.sphrak.either//flatMap/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>fn| <a name="io.github.sphrak.either//flatMap/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a><br><br>lambda to be executed in case of [Either.Right<R>](-either/index.md)<br><br>
  
  



