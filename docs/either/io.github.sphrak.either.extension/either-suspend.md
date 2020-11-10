---
title: eitherSuspend -
---
//[either](../index.md)/[io.github.sphrak.either.extension](index.md)/[eitherSuspend](either-suspend.md)



# eitherSuspend  
[jvm]  
Content  
inline suspend fun <[T](either-suspend.md), [L](either-suspend.md), [R](either-suspend.md)> [Either](../io.github.sphrak.either/-either/index.md)<[L](either-suspend.md), [R](either-suspend.md)>.[eitherSuspend](either-suspend.md)(onError: ([L](either-suspend.md)) -> [T](either-suspend.md), onSuccess: ([R](either-suspend.md)) -> [T](either-suspend.md)): [T](either-suspend.md)  
More info  


[eitherSuspend](either-suspend.md) Resolve either case [Either.Right](../io.github.sphrak.either/-either/-right/index.md) or case [Either.Left](../io.github.sphrak.either/-either/-left/index.md). This is analogues to [Either.either](../io.github.sphrak.either/-either/either.md).



#### Return  


[T](either-suspend.md) value [T](either-suspend.md) of [Either.Left](../io.github.sphrak.either/-either/-left/index.md) or [Either.Right](../io.github.sphrak.either/-either/-right/index.md)



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either.extension//eitherSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><receiver>| <a name="io.github.sphrak.either.extension//eitherSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>[Either.Left](../io.github.sphrak.either/-either/-left/index.md)<br><br>
| <a name="io.github.sphrak.either.extension//eitherSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>onError| <a name="io.github.sphrak.either.extension//eitherSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>function to execute when instance is Either.Left<br><br>
| <a name="io.github.sphrak.either.extension//eitherSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>onSuccess| <a name="io.github.sphrak.either.extension//eitherSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>function to execute when instance is Either.Right<br><br>
  
  



