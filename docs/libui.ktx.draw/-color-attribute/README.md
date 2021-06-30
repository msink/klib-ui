[libui.ktx.draw](../README.md) / [ColorAttribute](README.md)

# ColorAttribute

`class ColorAttribute(color: `[`Color`](../-color/README.md)`) : `[`Attribute`](../-attribute/README.md)

Changes the color of the text it is applied to.

### Constructors

| Name | Summary |
|---|---|
| [ColorAttribute](-color-attribute.md) | `fun ColorAttribute(color: `[`Color`](../-color/README.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `val value: `[`Color`](../-color/README.md)<br>Returns the text color stored. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [type](../-attribute/type.md) | `val type: `[`uiAttributeType`](../../libui/ui-attribute-type.md)<br>Returns the type of Attribute. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
