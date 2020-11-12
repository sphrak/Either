---
title: onResult -
---
//[either](../index.md)/[io.github.sphrak.either.extension](index.md)/[onResult](on-result.md)



# onResult  
[jvm]  
Content  
inline fun <[T](on-result.md), [L](on-result.md), [R](on-result.md)> [Either](../io.github.sphrak.either/-either/index.md)<[L](on-result.md), [R](on-result.md)>.[onResult](on-result.md)(onError: ([L](on-result.md)) -> [T](on-result.md), onSuccess: ([R](on-result.md)) -> [T](on-result.md)): [T](on-result.md)  
More info  


[onResult](on-result.md) Resolve either case [Either.Right](../io.github.sphrak.either/-either/-right/index.md) or case [Either.Left](../io.github.sphrak.either/-either/-left/index.md). This is analogues to [Either.either](../io.github.sphrak.either/-either/either.md).



#### Return  


[T](on-result.md) value [T](on-result.md) of [Either.Left](../io.github.sphrak.either/-either/-left/index.md) or [Either.Right](../io.github.sphrak.either/-either/-right/index.md)



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either.extension//onResult/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><receiver>| <a name="io.github.sphrak.either.extension//onResult/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>[Either.Left](../io.github.sphrak.either/-either/-left/index.md)<br><br>
| <a name="io.github.sphrak.either.extension//onResult/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>onError| <a name="io.github.sphrak.either.extension//onResult/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>function to execute when instance is Either.Left<br><br>
| <a name="io.github.sphrak.either.extension//onResult/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>onSuccess| <a name="io.github.sphrak.either.extension//onResult/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>function to execute when instance is Either.Right<br><br>
  
  



