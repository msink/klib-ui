[libui.ktx](../README.md) / [Disposable](README.md)

# Disposable

`abstract class Disposable<T : CPointed>(alloc: CPointer<T>?)`

Base class for all objects that have a holder reference to the native C resource(s).

<ul><li>Allocates one resource during construction,     and may allocate some additional resources during operation.</li><li>Must free all its resource once [dispose](dispose.md) is invoked.</li><li>[disposed](disposed.md) is a final state of the class, it is not supposed     to be used after being disposed.</li></ul>

### Constructors

| | |
|---|---|
| [Disposable](-disposable.md) | `fun <T : CPointed> Disposable(alloc: CPointer<T>?)` |

### Properties

| Name | Summary |
|---|---|
| [disposed](disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Functions

| Name | Summary |
|---|---|
| [dispose](dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |

### Inheritors

| Name |
|---|
| [Control](../-control/README.md) |
| [Table](../-table/README.md) |
| [Image](../../libui.ktx.draw/-image/README.md) |
| [Brush](../../libui.ktx.draw/-brush/README.md) |
| [Stroke](../../libui.ktx.draw/-stroke/README.md) |
| [Path](../../libui.ktx.draw/-path/README.md) |
| [Matrix](../../libui.ktx.draw/-matrix/README.md) |
| [TextLayout](../../libui.ktx.draw/-text-layout/README.md) |
| [Font](../../libui.ktx.draw/-font/README.md) |
| [Attribute](../../libui.ktx.draw/-attribute/README.md) |
| [OpenTypeFeatures](../../libui.ktx.draw/-open-type-features/README.md) |
| [AttributedString](../../libui.ktx.draw/-attributed-string/README.md) |
