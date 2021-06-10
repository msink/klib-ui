// SPDX-License-Identifier: MIT OR Apache-2.0

package libui.ktx.draw

import cnames.structs.uiImage
import kotlinx.cinterop.CValuesRef
import kotlinx.cinterop.UIntVar
import libui.ktx.Disposable
import libui.ktx.Table
import libui.uiFreeImage
import libui.uiImageAppend
import libui.uiNewImage
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

class ImageData(val width: Int, val height: Int, val stride: Int, val pixels: CValuesRef<UIntVar>)

class Image(width: Double, height: Double) : Disposable<uiImage>(
    alloc = uiNewImage(width, height)
) {
    override fun free() = uiFreeImage(ptr)
}

fun Table<*>.image(width: Int, height: Int, block: Image.() -> Unit = {}): Image {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return Image(width.toDouble(), height.toDouble()).also {
        disposables.add(it)
        block.invoke(it)
    }
}

fun Image.bitmap(data: ImageData) =
    uiImageAppend(ptr, data.pixels, data.width, data.height, data.stride)
