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

| Name |
|---|
| [BackgroundAttribute](../-background-attribute/README.md) |
| [ColorAttribute](../-color-attribute/README.md) |
| [FamilyAttribute](../-family-attribute/README.md) |
| [FeaturesAttribute](../-features-attribute/README.md) |
| [ItalicAttribute](../-italic-attribute/README.md) |
| [SizeAttribute](../-size-attribute/README.md) |
| [StretchAttribute](../-stretch-attribute/README.md) |
| [UnderlineAttribute](../-underline-attribute/README.md) |
| [UnderlineColorAttribute](../-underline-color-attribute/README.md) |
| [WeightAttribute](../-weight-attribute/README.md) |
