---
title: either -
---
//[either](../../index.md)/[io.github.sphrak.either](../index.md)/[Either](index.md)/[either](either.md)



# either  
[jvm]  
Content  
inline fun <[T](either.md)> [either](either.md)(fnL: ([L](index.md)) -> [T](either.md), fnR: ([R](index.md)) -> [T](either.md)): [T](either.md)  
More info  


[either](either.md) resolve case [Either.Right](-right/index.md) and case [Either.Left](-left/index.md) by passing lambdas fnL and fnR.



#### Return  


[T](either.md) value of [Either.Left<T>](index.md) or [Either.Right<T>](index.md)



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><receiver>| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>[Either.Right](-right/index.md)<br><br>
| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>fnL| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>lambda to execute when instance is of type Either.Left<br><br>
| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>fnR| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>lambda to execute when instance is of type Either.Right<br><br>
  
  



