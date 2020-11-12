---
title: onResultSuspend -
---
//[either](../index.md)/[io.github.sphrak.either.extension](index.md)/[onResultSuspend](on-result-suspend.md)



# onResultSuspend  
[jvm]  
Content  
suspend fun <[T](on-result-suspend.md), [L](on-result-suspend.md), [R](on-result-suspend.md)> [Either](../io.github.sphrak.either/-either/index.md)<[L](on-result-suspend.md), [R](on-result-suspend.md)>.[onResultSuspend](on-result-suspend.md)(onError: suspend ([L](on-result-suspend.md)) -> [T](on-result-suspend.md), onSuccess: suspend ([R](on-result-suspend.md)) -> [T](on-result-suspend.md)): [T](on-result-suspend.md)  
More info  


[onResultSuspend](on-result-suspend.md) Resolve either case [Either.Right](../io.github.sphrak.either/-either/-right/index.md) or case [Either.Left](../io.github.sphrak.either/-either/-left/index.md). This is analogues to [eitherSuspend](either-suspend.md).



#### Return  


[T](on-result-suspend.md) value [T](on-result-suspend.md) of [Either.Left](../io.github.sphrak.either/-either/-left/index.md) or [Either.Right](../io.github.sphrak.either/-either/-right/index.md)



## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either.extension//onResultSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><receiver>| <a name="io.github.sphrak.either.extension//onResultSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>[Either.Left](../io.github.sphrak.either/-either/-left/index.md)<br><br>
| <a name="io.github.sphrak.either.extension//onResultSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>onError| <a name="io.github.sphrak.either.extension//onResultSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>function to execute when instance is Either.Left<br><br>
| <a name="io.github.sphrak.either.extension//onResultSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>onSuccess| <a name="io.github.sphrak.either.extension//onResultSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.coroutines.SuspendFunction1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a><br><br>function to execute when instance is Either.Right<br><br>
  
  



