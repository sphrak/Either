---
title: mapSuspend -
---
//[either](../index.md)/[io.github.sphrak.either.extension](index.md)/[mapSuspend](map-suspend.md)



# mapSuspend  
[jvm]  
Content  
suspend fun <[T](map-suspend.md), [L](map-suspend.md), [R](map-suspend.md)> [Either](../io.github.sphrak.either/-either/index.md)<[L](map-suspend.md), [R](map-suspend.md)>.[mapSuspend](map-suspend.md)(fn: ([R](map-suspend.md)) -> [T](map-suspend.md)): [Either](../io.github.sphrak.either/-either/index.md)<[L](map-suspend.md), [T](map-suspend.md)>  
More info  


[Either.mapSuspend](map-suspend.md) is a suspending version of Either.map



Gives access to value [R](map-suspend.md) in a lambda if the instance is of [Either.Right](../io.github.sphrak.either/-either/-right/index.md) and wraps and returns the resulting computation in the lambda in Either<L, R>.



If the instance is [Either.Left](../io.github.sphrak.either/-either/-left/index.md) that is returned and lambda fn will not be executed.



#### Return  


Either<L, R>



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either.extension//mapSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><receiver>| <a name="io.github.sphrak.either.extension//mapSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>[Either.Right](../io.github.sphrak.either/-either/-right/index.md)<br><br>
| <a name="io.github.sphrak.either.extension//mapSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>fn| <a name="io.github.sphrak.either.extension//mapSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>lambda to be executed in case of [Either.Right<R>](../io.github.sphrak.either/-either/index.md)<br><br>
  
  



