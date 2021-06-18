[libui.ktx.draw](../README.md) / [StretchAttribute](README.md)

# StretchAttribute

`class StretchAttribute(stretch: `[`uiTextStretch`](../../libui/ui-text-stretch.md)`) : `[`Attribute`](../-attribute/README.md)

Changes the stretch of the text it is applied to.

### Constructors

| | |
|---|---|
| [StretchAttribute](-stretch-attribute.md) | `fun StretchAttribute(stretch: `[`uiTextStretch`](../../libui/ui-text-stretch.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `val value: `[`uiTextStretch`](../../libui/ui-text-stretch.md)<br>Returns the font stretch stored in [Attribute](../-attribute/README.md). |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [type](../-attribute/type.md) | `val type: `[`uiAttributeType`](../../libui/ui-attribute-type.md)<br>Returns the type of Attribute. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
