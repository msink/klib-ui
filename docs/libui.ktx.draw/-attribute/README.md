[libui.ktx.draw](../README.md) / [Attribute](README.md)

# Attribute

`abstract class Attribute(alloc: CPointer<`[`uiAttribute`](../../libui/ui-attribute.md)`>?) : `[`Disposable`](../../libui.ktx/-disposable/README.md)`<`[`uiAttribute`](../../libui/ui-attribute.md)`> `

Stores information about an attribute in a [AttributedString](../-attributed-string/README.md).

### Constructors

| | |
|---|---|
| [Attribute](-attribute.md) | `fun Attribute(alloc: CPointer<`[`uiAttribute`](../../libui/ui-attribute.md)`>?)` |

### Properties

| Name | Summary |
|---|---|
| [type](type.md) | `val type: `[`uiAttributeType`](../../libui/ui-attribute-type.md)<br>Returns the type of Attribute. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |

### Inheritors

| Name | Summary |
|---|---|
| [BackgroundAttribute](../-background-attribute/README.md) | `class BackgroundAttribute : Attribute`<br>Changes the background color of the text it is applied to. |
| [ColorAttribute](../-color-attribute/README.md) | `class ColorAttribute : Attribute`<br>Changes the color of the text it is applied to. |
| [FamilyAttribute](../-family-attribute/README.md) | `class FamilyAttribute : Attribute`<br>Changes the font family of the text it is applied to. |
| [FeaturesAttribute](../-features-attribute/README.md) | `class FeaturesAttribute : Attribute`<br>Creates a new Attribute that changes the font family of the text it is applied to. otf is copied you may free it. |
| [ItalicAttribute](../-italic-attribute/README.md) | `class ItalicAttribute : Attribute`<br>Changes the italic mode of the text it is applied to. |
| [SizeAttribute](../-size-attribute/README.md) | `class SizeAttribute : Attribute`<br>Changes the size of the text it is applied to, in typographical points. |
| [StretchAttribute](../-stretch-attribute/README.md) | `class StretchAttribute : Attribute`<br>Changes the stretch of the text it is applied to. |
| [UnderlineAttribute](../-underline-attribute/README.md) | `class UnderlineAttribute : Attribute`<br>Changes the type of underline on the text it is applied to. |
| [UnderlineColorAttribute](../-underline-color-attribute/README.md) | `class UnderlineColorAttribute : Attribute`<br>Changes the color of the underline on the text it is applied to. |
| [WeightAttribute](../-weight-attribute/README.md) | `class WeightAttribute : Attribute`<br>Changes the weight of the text it is applied to. |
