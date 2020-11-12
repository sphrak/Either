---
title: Right -
---
//[either](../../../index.md)/[io.github.sphrak.either](../../index.md)/[Either](../index.md)/[Right](index.md)



# Right  
 [jvm] data class [Right](index.md)<out [R](index.md)>(**b**: [R](index.md)) : [Either](../index.md)<[Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html), [R](index.md)> 

[Right](index.md) wrap a value [b](b.md) in [Either.Right](index.md)



By convention is [Right](index.md) used for successful states



#### Return  


Either<Nothing, R>

   


## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either.Right///PointingToDeclaration/"></a>b| <a name="io.github.sphrak.either/Either.Right///PointingToDeclaration/"></a><br><br>of type [R](index.md) the right-hand side value<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either.Right/Right/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[Right](-right.md)| <a name="io.github.sphrak.either/Either.Right/Right/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a> [jvm] fun <out [R](index.md)> [Right](-right.md)(b: [R](index.md))of type [R](index.md) the right-hand side value   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either.Right/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="io.github.sphrak.either/Either.Right/component1/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>operator fun [component1](component1.md)(): [R](index.md)  <br><br><br>
| <a name="io.github.sphrak.either/Either.Right/copy/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[copy](copy.md)| <a name="io.github.sphrak.either/Either.Right/copy/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [copy](copy.md)(b: [R](index.md)): [Either.Right](index.md)<[R](index.md)>  <br><br><br>
| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[kotlin.Nothing,TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[either](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[kotlin.Nothing,TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>inline fun <[T](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)> [either](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)(fnL: ([Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)) -> [T](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384), fnR: ([R](index.md)) -> [T](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)): [T](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)  <br>More info  <br>[either](../either.md) resolve case [Either.Right](index.md) and case [Either.Left](../-left/index.md) by passing lambdas fnL and fnR.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [equals](index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [hashCode](index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="io.github.sphrak.either/Either/left/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[left](../left.md)| <a name="io.github.sphrak.either/Either/left/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[L](../left.md)> [left](../left.md)(a: [L](../left.md)): [Either.Left](../-left/index.md)<[L](../left.md)>  <br><br><br>
| <a name="io.github.sphrak.either/Either/right/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[right](../right.md)| <a name="io.github.sphrak.either/Either/right/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[R](../right.md)> [right](../right.md)(b: [R](../right.md)): [Either.Right](index.md)<[R](../right.md)>  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toString](index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either.Right/b/#/PointingToDeclaration/"></a>[b](b.md)| <a name="io.github.sphrak.either/Either.Right/b/#/PointingToDeclaration/"></a> [jvm] val [b](b.md): [R](index.md)of type [R](index.md) the right-hand side value   <br>
| <a name="io.github.sphrak.either/Either.Right/isLeft/#/PointingToDeclaration/"></a>[isLeft](is-left.md)| <a name="io.github.sphrak.either/Either.Right/isLeft/#/PointingToDeclaration/"></a> [jvm] val [isLeft](is-left.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)[isLeft](../is-left.md) A boolean value indicating whether [Either](../index.md) is of type [Either.Left](../-left/index.md)   <br>
| <a name="io.github.sphrak.either/Either.Right/isRight/#/PointingToDeclaration/"></a>[isRight](is-right.md)| <a name="io.github.sphrak.either/Either.Right/isRight/#/PointingToDeclaration/"></a> [jvm] val [isRight](is-right.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)[isRight](../is-right.md) A boolean value indicating whether [Either](../index.md) is of type [Either.Right](index.md)   <br>

