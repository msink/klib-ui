[libui.ktx](../README.md) / [Disposable](README.md)

# Disposable

`abstract class Disposable<T : CPointed>`

Base class for all objects that have a holder reference to the native C resource(s).

* Allocates one resource during construction,
  and may allocate some additional resources during operation.
* Must free all its resource once [dispose](dispose.md) is invoked.
* [disposed](disposed.md) is a final state of the class, it is not supposed
  to be used after being disposed.

### Constructors

| Name | Summary |
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

| Name | Summary |
|---|---|
| [Attribute](../../libui.ktx.draw/-attribute/README.md) | `abstract class Attribute : Disposable<`[`uiAttribute`](../../libui/ui-attribute.md)`>`<br>Stores information about an attribute in a [AttributedString](../../libui.ktx.draw/-attributed-string/README.md). |
| [AttributedString](../../libui.ktx.draw/-attributed-string/README.md) | `class AttributedString : Disposable<`[`uiAttributedString`](../../libui/ui-attributed-string.md)`>`<br>Represents a string of UTF-8 text that can be embellished with formatting attributes. |
| [Brush](../../libui.ktx.draw/-brush/README.md) | `class Brush : Disposable<`[`uiDrawBrush`](../../libui/ui-draw-brush/README.md)`>`<br>Defines the color(s) to draw a path with. |
| [Control](../-control/README.md) | `abstract class Control<T : CPointed> : Disposable<T>`<br>Base class for all GUI controls (widgets). |
| [Font](../../libui.ktx.draw/-font/README.md) | `class Font : Disposable<`[`uiFontDescriptor`](../../libui/ui-font-descriptor/README.md)`>`<br>Provides a complete description of a font where one is needed. |
| [Image](../../libui.ktx.draw/-image/README.md) | `class Image : Disposable<`[`uiImage`](../../libui/ui-image.md)`>` |
| [Matrix](../../libui.ktx.draw/-matrix/README.md) | `class Matrix : Disposable<`[`uiDrawMatrix`](../../libui/ui-draw-matrix/README.md)`>`<br>Defines a transformation (e.g. rotation, translation) |
| [OpenTypeFeatures](../../libui.ktx.draw/-open-type-features/README.md) | `class OpenTypeFeatures : Disposable<`[`uiOpenTypeFeatures`](../../libui/ui-open-type-features.md)`>`<br>Represents a set of OpenType feature tag-value pairs, for applying OpenType features to text. |
| [Path](../../libui.ktx.draw/-path/README.md) | `class Path : Disposable<`[`uiDrawPath`](../../libui/ui-draw-path.md)`>`<br>Represent a path that could be drawed on a [DrawContext](../-draw-context.md) |
| [Stroke](../../libui.ktx.draw/-stroke/README.md) | `class Stroke : Disposable<`[`uiDrawStrokeParams`](../../libui/ui-draw-stroke-params/README.md)`>`<br>Describes the stroke to draw with. |
| [Table](../-table/README.md) | `class Table<T> : Disposable<`[`uiTableModel`](../../libui/ui-table-model.md)`>`<br>Wrapper class for [uiTableModel](../../libui/ui-table-model.md) |
| [TextLayout](../../libui.ktx.draw/-text-layout/README.md) | `class TextLayout : Disposable<`[`uiDrawTextLayout`](../../libui/ui-draw-text-layout.md)`>`<br>Representation of a [AttributedString](../../libui.ktx.draw/-attributed-string/README.md) that can be displayed in a [DrawContext](../-draw-context.md). |
