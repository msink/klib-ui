[libui.ktx](../README.md) / [Disposable](README.md)

# Disposable

`abstract class Disposable<T : CPointed>(alloc: CPointer<T>?)`

Base class for all objects that have a holder reference to the native C resource(s).

* Allocates one resource during construction,
  and may allocate some additional resources during operation.
* Must free all its resource once [dispose](dispose.md) is invoked.
* [disposed](disposed.md) is a final state of the class, it is not supposed
  to be used after being disposed.

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
| [Attribute](../../libui.ktx.draw/-attribute/README.md) |
| [AttributedString](../../libui.ktx.draw/-attributed-string/README.md) |
| [Brush](../../libui.ktx.draw/-brush/README.md) |
| [Control](../-control/README.md) |
| [Font](../../libui.ktx.draw/-font/README.md) |
| [Image](../../libui.ktx.draw/-image/README.md) |
| [Matrix](../../libui.ktx.draw/-matrix/README.md) |
| [OpenTypeFeatures](../../libui.ktx.draw/-open-type-features/README.md) |
| [Path](../../libui.ktx.draw/-path/README.md) |
| [Stroke](../../libui.ktx.draw/-stroke/README.md) |
| [Table](../-table/README.md) |
| [TextLayout](../../libui.ktx.draw/-text-layout/README.md) |
