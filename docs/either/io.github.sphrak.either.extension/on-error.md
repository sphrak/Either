---
title: onError -
---
//[either](../index.md)/[io.github.sphrak.either.extension](index.md)/[onError](on-error.md)



# onError  
[jvm]  
Content  
fun <[L](on-error.md), [R](on-error.md)> [Either](../io.github.sphrak.either/-either/index.md)<[L](on-error.md), [R](on-error.md)>.[onError](on-error.md)(fn: ([L](on-error.md)) -> [Either](../io.github.sphrak.either/-either/index.md)<[L](on-error.md), [R](on-error.md)>): [Either](../io.github.sphrak.either/-either/index.md)<[L](on-error.md), [R](on-error.md)>  
More info  


[onError](on-error.md) analogues to [Either.map](map.md) but for [Either.Left](../io.github.sphrak.either/-either/-left/index.md)



#### Return  


[Either](../io.github.sphrak.either/-either/index.md)



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either.extension//onError/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a><receiver>| <a name="io.github.sphrak.either.extension//onError/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a><br><br>[Either.Left](../io.github.sphrak.either/-either/-left/index.md)<br><br>
| <a name="io.github.sphrak.either.extension//onError/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>fn| <a name="io.github.sphrak.either.extension//onError/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a><br><br>lambda to execute in case of [Either.Right](../io.github.sphrak.either/-either/-right/index.md)<br><br>
  
  



