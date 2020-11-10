---
title: Either -
---
//[either](../../index.md)/[io.github.sphrak.either](../index.md)/[Either](index.md)



# Either  
 [jvm] sealed class [Either](index.md)<out [L](index.md), out [R](index.md)>

[Either](index.md) is a monad or result type used to indicate two possible outcomes of a computation



[Either.Right](-right/index.md) and [Either.Left](-left/index.md) can be used interchangeably to indicate a left or a right outcome of a computation.



By convention [Either.Left](-left/index.md) is often used to indicate an fault or an erroneous computation result. Because of this methods like onError, onSuccess, onResult exists to allow for more human readable code

   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either.Left///PointingToDeclaration/"></a>[Left](-left/index.md)| <a name="io.github.sphrak.either/Either.Left///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [Left](-left/index.md)<out [L](-left/index.md)>(**a**: [L](-left/index.md)) : [Either](index.md)<[L](-left/index.md), [Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)>   <br>More info  <br>[Left](-left/index.md) wrap a value [a](-left/a.md) in [Either.Left](-left/index.md)By convention is [Left](-left/index.md) used for erroneous states  <br><br><br>
| <a name="io.github.sphrak.either/Either.Right///PointingToDeclaration/"></a>[Right](-right/index.md)| <a name="io.github.sphrak.either/Either.Right///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>data class [Right](-right/index.md)<out [R](-right/index.md)>(**b**: [R](-right/index.md)) : [Either](index.md)<[Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html), [R](-right/index.md)>   <br>More info  <br>[Right](-right/index.md) wrap a value [b](-right/b.md) in [Either.Right](-right/index.md)By convention is [Right](-right/index.md) used for successful states  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[either](either.md)| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>inline fun <[T](either.md)> [either](either.md)(fnL: ([L](index.md)) -> [T](either.md), fnR: ([R](index.md)) -> [T](either.md)): [T](either.md)  <br>More info  <br>[either](either.md) resolve case [Either.Right](-right/index.md) and case [Either.Left](-left/index.md) by passing lambdas fnL and fnR.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](-right/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1498975095)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](-right/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1498975095)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](-right/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1498975095)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](-right/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1498975095)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="io.github.sphrak.either/Either/left/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[left](left.md)| <a name="io.github.sphrak.either/Either/left/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[L](left.md)> [left](left.md)(a: [L](left.md)): [Either.Left](-left/index.md)<[L](left.md)>  <br><br><br>
| <a name="io.github.sphrak.either/Either/right/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[right](right.md)| <a name="io.github.sphrak.either/Either/right/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[R](right.md)> [right](right.md)(b: [R](right.md)): [Either.Right](-right/index.md)<[R](right.md)>  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](-right/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1498975095)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](-right/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1498975095)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either/isLeft/#/PointingToDeclaration/"></a>[isLeft](is-left.md)| <a name="io.github.sphrak.either/Either/isLeft/#/PointingToDeclaration/"></a> [jvm] val [isLeft](is-left.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)[isLeft](is-left.md) A boolean value indicating whether [Either](index.md) is of type [Either.Left](-left/index.md)   <br>
| <a name="io.github.sphrak.either/Either/isRight/#/PointingToDeclaration/"></a>[isRight](is-right.md)| <a name="io.github.sphrak.either/Either/isRight/#/PointingToDeclaration/"></a> [jvm] val [isRight](is-right.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)[isRight](is-right.md) A boolean value indicating whether [Either](index.md) is of type [Either.Right](-right/index.md)   <br>


## Inheritors  
  
|  Name| 
|---|
| <a name="io.github.sphrak.either/Either.Left///PointingToDeclaration/"></a>[Either](-left/index.md)
| <a name="io.github.sphrak.either/Either.Right///PointingToDeclaration/"></a>[Either](-right/index.md)


## Extensions  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either.extension//eitherSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[eitherSuspend](../../io.github.sphrak.either.extension/either-suspend.md)| <a name="io.github.sphrak.either.extension//eitherSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>inline suspend fun <[T](../../io.github.sphrak.either.extension/either-suspend.md), [L](../../io.github.sphrak.either.extension/either-suspend.md), [R](../../io.github.sphrak.either.extension/either-suspend.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/either-suspend.md), [R](../../io.github.sphrak.either.extension/either-suspend.md)>.[eitherSuspend](../../io.github.sphrak.either.extension/either-suspend.md)(onError: ([L](../../io.github.sphrak.either.extension/either-suspend.md)) -> [T](../../io.github.sphrak.either.extension/either-suspend.md), onSuccess: ([R](../../io.github.sphrak.either.extension/either-suspend.md)) -> [T](../../io.github.sphrak.either.extension/either-suspend.md)): [T](../../io.github.sphrak.either.extension/either-suspend.md)  <br>More info  <br>[eitherSuspend](../../io.github.sphrak.either.extension/either-suspend.md) Resolve either case [Either.Right](-right/index.md) or case [Either.Left](-left/index.md).  <br><br><br>
| <a name="io.github.sphrak.either.extension//errorOrNull/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[errorOrNull](../../io.github.sphrak.either.extension/error-or-null.md)| <a name="io.github.sphrak.either.extension//errorOrNull/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>val <[L](../../io.github.sphrak.either.extension/error-or-null.md), [R](../../io.github.sphrak.either.extension/error-or-null.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/error-or-null.md), [R](../../io.github.sphrak.either.extension/error-or-null.md)>.[errorOrNull](../../io.github.sphrak.either.extension/error-or-null.md): [L](../../io.github.sphrak.either.extension/error-or-null.md)?  <br>More info  <br>[errorOrNull](../../io.github.sphrak.either.extension/error-or-null.md) Access the value of [Either.Left](-left/index.md) or null.  <br><br><br>
| <a name="io.github.sphrak.either//flatMap/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[flatMap](../flat-map.md)| <a name="io.github.sphrak.either//flatMap/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>inline fun <[T](../flat-map.md), [L](../flat-map.md), [R](../flat-map.md)> [Either](index.md)<[L](../flat-map.md), [R](../flat-map.md)>.[flatMap](../flat-map.md)(fn: ([R](../flat-map.md)) -> [Either](index.md)<[L](../flat-map.md), [T](../flat-map.md)>): [Either](index.md)<[L](../flat-map.md), [T](../flat-map.md)>  <br>More info  <br>[Either.flatMap](../flat-map.md) Gives access to value [R](../flat-map.md) in a lambda if the instance is of [Either.Right](-right/index.md) and wraps and returns the resulting computation in the lambda in Either<L, R>If the instance is [Either.Left](-left/index.md) that is returned and lambda fn will not be executed.  <br><br><br>
| <a name="io.github.sphrak.either.extension//getLeftOrNull/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[getLeftOrNull](../../io.github.sphrak.either.extension/get-left-or-null.md)| <a name="io.github.sphrak.either.extension//getLeftOrNull/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>val <[L](../../io.github.sphrak.either.extension/get-left-or-null.md), [R](../../io.github.sphrak.either.extension/get-left-or-null.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/get-left-or-null.md), [R](../../io.github.sphrak.either.extension/get-left-or-null.md)>.[getLeftOrNull](../../io.github.sphrak.either.extension/get-left-or-null.md): [L](../../io.github.sphrak.either.extension/get-left-or-null.md)?  <br>More info  <br>[getLeftOrNull](../../io.github.sphrak.either.extension/get-left-or-null.md) Access the value of [Either.Left](-left/index.md) or null  <br><br><br>
| <a name="io.github.sphrak.either.extension//getRightOrNull/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[getRightOrNull](../../io.github.sphrak.either.extension/get-right-or-null.md)| <a name="io.github.sphrak.either.extension//getRightOrNull/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>val <[L](../../io.github.sphrak.either.extension/get-right-or-null.md), [R](../../io.github.sphrak.either.extension/get-right-or-null.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/get-right-or-null.md), [R](../../io.github.sphrak.either.extension/get-right-or-null.md)>.[getRightOrNull](../../io.github.sphrak.either.extension/get-right-or-null.md): [R](../../io.github.sphrak.either.extension/get-right-or-null.md)?  <br>More info  <br>[getRightOrNull](../../io.github.sphrak.either.extension/get-right-or-null.md) Access the value of [Either.Right](-right/index.md) or null  <br><br><br>
| <a name="io.github.sphrak.either//map/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[map](../map.md)| <a name="io.github.sphrak.either//map/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[T](../map.md), [L](../map.md), [R](../map.md)> [Either](index.md)<[L](../map.md), [R](../map.md)>.[map](../map.md)(fn: ([R](../map.md)) -> [T](../map.md)): [Either](index.md)<[L](../map.md), [T](../map.md)>  <br>More info  <br>[Either.map](../map.md) Gives access to value [R](../map.md) in a lambda if the instance is of [Either.Right](-right/index.md) and wraps and returns the resulting computation in the lambda in Either<L, R>If the instance is [Either.Left](-left/index.md) that is returned and lambda fn will not be executed.  <br><br><br>
| <a name="io.github.sphrak.either.extension//mapSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[mapSuspend](../../io.github.sphrak.either.extension/map-suspend.md)| <a name="io.github.sphrak.either.extension//mapSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>suspend fun <[T](../../io.github.sphrak.either.extension/map-suspend.md), [L](../../io.github.sphrak.either.extension/map-suspend.md), [R](../../io.github.sphrak.either.extension/map-suspend.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/map-suspend.md), [R](../../io.github.sphrak.either.extension/map-suspend.md)>.[mapSuspend](../../io.github.sphrak.either.extension/map-suspend.md)(fn: ([R](../../io.github.sphrak.either.extension/map-suspend.md)) -> [T](../../io.github.sphrak.either.extension/map-suspend.md)): [Either](index.md)<[L](../../io.github.sphrak.either.extension/map-suspend.md), [T](../../io.github.sphrak.either.extension/map-suspend.md)>  <br>More info  <br>[Either.mapSuspend](../../io.github.sphrak.either.extension/map-suspend.md) is a suspending version of Either.  <br><br><br>
| <a name="io.github.sphrak.either.extension//onError/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[onError](../../io.github.sphrak.either.extension/on-error.md)| <a name="io.github.sphrak.either.extension//onError/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[L](../../io.github.sphrak.either.extension/on-error.md), [R](../../io.github.sphrak.either.extension/on-error.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/on-error.md), [R](../../io.github.sphrak.either.extension/on-error.md)>.[onError](../../io.github.sphrak.either.extension/on-error.md)(fn: ([L](../../io.github.sphrak.either.extension/on-error.md)) -> [Either](index.md)<[L](../../io.github.sphrak.either.extension/on-error.md), [R](../../io.github.sphrak.either.extension/on-error.md)>): [Either](index.md)<[L](../../io.github.sphrak.either.extension/on-error.md), [R](../../io.github.sphrak.either.extension/on-error.md)>  <br>More info  <br>[onError](../../io.github.sphrak.either.extension/on-error.md) analogues to Either.  <br><br><br>
| <a name="io.github.sphrak.either.extension//onResult/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[onResult](../../io.github.sphrak.either.extension/on-result.md)| <a name="io.github.sphrak.either.extension//onResult/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>inline fun <[T](../../io.github.sphrak.either.extension/on-result.md), [L](../../io.github.sphrak.either.extension/on-result.md), [R](../../io.github.sphrak.either.extension/on-result.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/on-result.md), [R](../../io.github.sphrak.either.extension/on-result.md)>.[onResult](../../io.github.sphrak.either.extension/on-result.md)(onError: ([L](../../io.github.sphrak.either.extension/on-result.md)) -> [T](../../io.github.sphrak.either.extension/on-result.md), onSuccess: ([R](../../io.github.sphrak.either.extension/on-result.md)) -> [T](../../io.github.sphrak.either.extension/on-result.md)): [T](../../io.github.sphrak.either.extension/on-result.md)  <br>More info  <br>[onResult](../../io.github.sphrak.either.extension/on-result.md) Resolve either case [Either.Right](-right/index.md) or case [Either.Left](-left/index.md).  <br><br><br>
| <a name="io.github.sphrak.either.extension//onResultSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[onResultSuspend](../../io.github.sphrak.either.extension/on-result-suspend.md)| <a name="io.github.sphrak.either.extension//onResultSuspend/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>inline suspend fun <[T](../../io.github.sphrak.either.extension/on-result-suspend.md), [L](../../io.github.sphrak.either.extension/on-result-suspend.md), [R](../../io.github.sphrak.either.extension/on-result-suspend.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/on-result-suspend.md), [R](../../io.github.sphrak.either.extension/on-result-suspend.md)>.[onResultSuspend](../../io.github.sphrak.either.extension/on-result-suspend.md)(onError: ([L](../../io.github.sphrak.either.extension/on-result-suspend.md)) -> [T](../../io.github.sphrak.either.extension/on-result-suspend.md), onSuccess: ([R](../../io.github.sphrak.either.extension/on-result-suspend.md)) -> [T](../../io.github.sphrak.either.extension/on-result-suspend.md)): [T](../../io.github.sphrak.either.extension/on-result-suspend.md)  <br>More info  <br>[onResultSuspend](../../io.github.sphrak.either.extension/on-result-suspend.md) Resolve either case [Either.Right](-right/index.md) or case [Either.Left](-left/index.md).  <br><br><br>
| <a name="io.github.sphrak.either.extension//onSuccess/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[onSuccess](../../io.github.sphrak.either.extension/on-success.md)| <a name="io.github.sphrak.either.extension//onSuccess/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[L](../../io.github.sphrak.either.extension/on-success.md), [R](../../io.github.sphrak.either.extension/on-success.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/on-success.md), [R](../../io.github.sphrak.either.extension/on-success.md)>.[onSuccess](../../io.github.sphrak.either.extension/on-success.md)(fn: ([R](../../io.github.sphrak.either.extension/on-success.md)) -> [Either](index.md)<[L](../../io.github.sphrak.either.extension/on-success.md), [R](../../io.github.sphrak.either.extension/on-success.md)>): [Either](index.md)<[L](../../io.github.sphrak.either.extension/on-success.md), [R](../../io.github.sphrak.either.extension/on-success.md)>  <br>More info  <br>[onSuccess](../../io.github.sphrak.either.extension/on-success.md) analogues to Either.  <br><br><br>
| <a name="io.github.sphrak.either.extension//successOrNull/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[successOrNull](../../io.github.sphrak.either.extension/success-or-null.md)| <a name="io.github.sphrak.either.extension//successOrNull/io.github.sphrak.either.Either[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>val <[L](../../io.github.sphrak.either.extension/success-or-null.md), [R](../../io.github.sphrak.either.extension/success-or-null.md)> [Either](index.md)<[L](../../io.github.sphrak.either.extension/success-or-null.md), [R](../../io.github.sphrak.either.extension/success-or-null.md)>.[successOrNull](../../io.github.sphrak.either.extension/success-or-null.md): [R](../../io.github.sphrak.either.extension/success-or-null.md)?  <br>More info  <br>[successOrNull](../../io.github.sphrak.either.extension/success-or-null.md) Access the value of [Either.Right](-right/index.md) or null.  <br><br><br>
