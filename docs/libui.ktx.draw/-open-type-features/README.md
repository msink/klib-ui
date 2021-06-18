[libui.ktx.draw](../README.md) / [OpenTypeFeatures](README.md)

# OpenTypeFeatures

`class OpenTypeFeatures(copy: CPointer<`[`uiOpenTypeFeatures`](../../libui/ui-open-type-features.md)`>?) : `[`Disposable`](../../libui.ktx/-disposable/README.md)`<`[`uiOpenTypeFeatures`](../../libui/ui-open-type-features.md)`> `

Represents a set of OpenType feature tag-value pairs, for applying OpenType features to text.

### Constructors

| | |
|---|---|
| [OpenTypeFeatures](-open-type-features.md) | `fun OpenTypeFeatures(copy: CPointer<`[`uiOpenTypeFeatures`](../../libui/ui-open-type-features.md)`>? = null)` |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Functions

| Name | Summary |
|---|---|
| [add](add.md) | `fun add(tag: String, value: UInt)`<br>Adds the given feature tag and value to OpenTypeFeatures. |
| [copy](copy.md) | `fun copy(): OpenTypeFeatures`<br>Makes a copy of otf and returns it. |
| [get](get.md) | `fun get(tag: String): UInt`<br>Determines whether the given feature tag is present in OpenTypeFeatures. |
| [remove](remove.md) | `fun remove(tag: String)`<br>Removes the given feature tag and value from OpenTypeFeatures. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
