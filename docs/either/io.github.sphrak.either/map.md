---
title: map -
---
//[either](../index.md)/[io.github.sphrak.either](index.md)/[map](map.md)



# map  
[jvm]  
Content  
fun <[T](map.md), [L](map.md), [R](map.md)> [Either](-either/index.md)<[L](map.md), [R](map.md)>.[map](map.md)(fn: ([R](map.md)) -> [T](map.md)): [Either](-either/index.md)<[L](map.md), [T](map.md)>  
More info  


[Either.map](map.md) Gives access to value [R](map.md) in a lambda if the instance is of [Either.Right](-either/-right/index.md) and wraps and returns the resulting computation in the lambda in Either<L, R>



If the instance is [Either.Left](-either/-left/index.md) that is returned and lambda fn will not be executed.



#### Return  


Either<L, R>



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either//map/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><receiver>| <a name="io.github.sphrak.either//map/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>[Either.Right](-either/-right/index.md)<br><br>
| <a name="io.github.sphrak.either//map/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>fn| <a name="io.github.sphrak.either//map/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>lambda to be executed in case of [Either.Right<R>](-either/index.md)<br><br>
  
  



