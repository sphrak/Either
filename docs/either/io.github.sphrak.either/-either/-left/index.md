---
title: Left -
---
//[either](../../../index.md)/[io.github.sphrak.either](../../index.md)/[Either](../index.md)/[Left](index.md)



# Left  
 [jvm] data class [Left](index.md)<out [L](index.md)>(**a**: [L](index.md)) : [Either](../index.md)<[L](index.md), [Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)> 

[Left](index.md) wrap a value [a](a.md) in [Either.Left](index.md)



By convention is [Left](index.md) used for erroneous states



#### Return  


Either<L, Nothing>

   


## Parameters  
  
jvm  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either.Left///PointingToDeclaration/"></a>a| <a name="io.github.sphrak.either/Either.Left///PointingToDeclaration/"></a><br><br>of type [L](index.md) the left-hand side value<br><br>
  


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either.Left/Left/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[Left](-left.md)| <a name="io.github.sphrak.either/Either.Left/Left/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a> [jvm] fun <out [L](index.md)> [Left](-left.md)(a: [L](index.md))of type [L](index.md) the left-hand side value   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either.Left/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="io.github.sphrak.either/Either.Left/component1/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>operator fun [component1](component1.md)(): [L](index.md)  <br><br><br>
| <a name="io.github.sphrak.either/Either.Left/copy/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[copy](copy.md)| <a name="io.github.sphrak.either/Either.Left/copy/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [copy](copy.md)(a: [L](index.md)): [Either.Left](index.md)<[L](index.md)>  <br><br><br>
| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[kotlin.Nothing,TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[either](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)| <a name="io.github.sphrak.either/Either/either/#kotlin.Function1[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#kotlin.Function1[kotlin.Nothing,TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>inline fun <[T](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)> [either](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)(fnL: ([L](index.md)) -> [T](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384), fnR: ([Nothing](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)) -> [T](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)): [T](index.md#%5Bio.github.sphrak.either%2FEither%2Feither%2F%23kotlin.Function1%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%23kotlin.Function1%5Bkotlin.Nothing%2CTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)  <br>More info  <br>[either](../either.md) resolve case [Either.Right](../-right/index.md) and case [Either.Left](index.md) by passing lambdas fnL and fnR.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-right/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [equals](../-right/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-right/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [hashCode](../-right/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="io.github.sphrak.either/Either/left/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[left](../left.md)| <a name="io.github.sphrak.either/Either/left/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[L](../left.md)> [left](../left.md)(a: [L](../left.md)): [Either.Left](index.md)<[L](../left.md)>  <br><br><br>
| <a name="io.github.sphrak.either/Either/right/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[right](../right.md)| <a name="io.github.sphrak.either/Either/right/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun <[R](../right.md)> [right](../right.md)(b: [R](../right.md)): [Either.Right](../-right/index.md)<[R](../right.md)>  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../-right/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toString](../-right/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F1766055384)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="io.github.sphrak.either/Either.Left/a/#/PointingToDeclaration/"></a>[a](a.md)| <a name="io.github.sphrak.either/Either.Left/a/#/PointingToDeclaration/"></a> [jvm] val [a](a.md): [L](index.md)of type [L](index.md) the left-hand side value   <br>
| <a name="io.github.sphrak.either/Either.Left/isLeft/#/PointingToDeclaration/"></a>[isLeft](is-left.md)| <a name="io.github.sphrak.either/Either.Left/isLeft/#/PointingToDeclaration/"></a> [jvm] val [isLeft](is-left.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)[isLeft](../is-left.md) A boolean value indicating whether [Either](../index.md) is of type [Either.Left](index.md)   <br>
| <a name="io.github.sphrak.either/Either.Left/isRight/#/PointingToDeclaration/"></a>[isRight](is-right.md)| <a name="io.github.sphrak.either/Either.Left/isRight/#/PointingToDeclaration/"></a> [jvm] val [isRight](is-right.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)[isRight](../is-right.md) A boolean value indicating whether [Either](../index.md) is of type [Either.Right](../-right/index.md)   <br>

