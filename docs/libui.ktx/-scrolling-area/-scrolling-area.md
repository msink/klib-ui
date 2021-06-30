[libui.ktx](../README.md) / [ScrollingArea](README.md) / [ScrollingArea](-scrolling-area.md)

# ScrollingArea

`fun ScrollingArea(width: Int, height: Int, handler: CPointer<`[`ktAreaHandler`](../../libui/kt-area-handler/README.md)`> = nativeHeap.alloc<ktAreaHandler>().ptr, alloc: CPointer<`[`uiArea`](../../libui/ui-area.md)`>? = uiNewScrollingArea(handler.pointed.ui.ptr, width, height))`

Wrapper class for [uiArea](../../libui/ui-area.md) - a canvas with horziontal and vertical scrollbars.
