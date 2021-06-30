[libui.ktx.draw](../README.md) / [BackgroundAttribute](README.md)

# BackgroundAttribute

`class BackgroundAttribute : `[`Attribute`](../-attribute/README.md)

Changes the background color of the text it is applied to.

### Constructors

| Name | Summary |
|---|---|
| [BackgroundAttribute](-background-attribute.md) | `fun BackgroundAttribute(color: `[`Color`](../-color/README.md)`)` |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [type](../-attribute/type.md) | `val type: `[`uiAttributeType`](../../libui/ui-attribute-type.md)<br>Returns the type of Attribute. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
