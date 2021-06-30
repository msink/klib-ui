[libui.ktx.draw](../README.md) / [FeaturesAttribute](README.md)

# FeaturesAttribute

`class FeaturesAttribute : `[`Attribute`](../-attribute/README.md)

Creates a new Attribute that changes the font family of the text it is applied to.
otf is copied you may free it.

### Constructors

| Name | Summary |
|---|---|
| [FeaturesAttribute](-features-attribute.md) | `fun FeaturesAttribute(otf: `[`OpenTypeFeatures`](../-open-type-features/README.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `val value: `[`OpenTypeFeatures`](../-open-type-features/README.md)<br>Returns the OpenType features stored. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [type](../-attribute/type.md) | `val type: `[`uiAttributeType`](../../libui/ui-attribute-type.md)<br>Returns the type of Attribute. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
