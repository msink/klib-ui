// SPDX-License-Identifier: MIT OR Apache-2.0

package libui.ktx.draw

import cnames.structs.uiDrawPath
import kotlinx.cinterop.*
import libui.*
import libui.ktx.Disposable
import libui.ktx.DrawArea
import libui.ktx.DrawContext
import platform.posix.memset
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Draw a path filled with a color. */
fun DrawContext.fill(
    mode: uiDrawFillMode,
    brush: Brush,
    block: Path.() -> Unit
) {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    val path = Path(mode)
    path.block()
    uiDrawPathEnd(path.ptr)
    uiDrawFill(ptr, path.ptr, brush.ptr)
    path.dispose()
}

/** Draw a path filled with a color. */
fun DrawContext.fill(brush: Brush, block: Path.() -> Unit) {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return fill(uiDrawFillModeWinding, brush, block)
}

/** Draw a path in the context. */
fun DrawContext.stroke(
    mode: uiDrawFillMode,
    brush: Brush,
    stroke: Stroke,
    block: Path.() -> Unit
) {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    val path = Path(mode)
    path.block()
    uiDrawPathEnd(path.ptr)
    uiDrawStroke(ptr, path.ptr, brush.ptr, stroke.ptr)
    path.dispose()
}

/** Draw a path in the context. */
fun DrawContext.stroke(brush: Brush, stroke: Stroke, block: Path.() -> Unit) {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return stroke(uiDrawFillModeWinding, brush, stroke, block)
}

/** Apply a different transform matrix to the context. */
fun DrawContext.transform(block: Matrix.() -> Unit) {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    val matrix = Matrix()
    uiDrawMatrixSetIdentity(matrix.ptr)
    matrix.block()
    uiDrawTransform(ptr, matrix.ptr)
    matrix.dispose()
}

//TODO fun DrawContext.clip(path: Path) = uiDrawClip(this, path)

//TODO fun DrawContext.save() = uiDrawSave(this)

//TODO fun DrawContext.restore() = uiDrawRestore(this)

///////////////////////////////////////////////////////////////////////////////

/** Creates a new [Brush] with lifecycle delegated to [DrawArea]. */
fun DrawArea.brush(): Brush = Brush().also { disposables.add(it) }

/** Defines the color(s) to draw a path with. */
class Brush : Disposable<uiDrawBrush>(
    alloc = nativeHeap.alloc<uiDrawBrush>().ptr
) {
    override fun clear() {
        ptr.pointed.Stops?.let { nativeHeap.free(it) }
        memset(ptr, 0, sizeOf<uiDrawBrush>().convert())
    }

    override fun free() {
        clear()
        nativeHeap.free(ptr)
    }

    /** Helper to quickly set a brush color */
    fun solid(color: Color, opacity: Double = 1.0): Brush {
        clear()
        with(ptr.pointed) {
            Type = uiDrawBrushTypeSolid
            R = color.r
            G = color.g
            B = color.b
            A = color.a * opacity
        }
        return this
    }

    /** Helper to quickly set a brush color */
    fun solid(rgb: Int, alpha: Double = 1.0): Brush {
        clear()
        val color = Color(rgb, alpha)
        with(ptr.pointed) {
            Type = uiDrawBrushTypeSolid
            R = color.r
            G = color.g
            B = color.b
            A = alpha
        }
        return this
    }

    /** Helper to quickly create linear brush */
    fun linear(start: Point, end: Point, vararg stops: Pair<Double, Color>): Brush {
        clear()
        with(ptr.pointed) {
            Type = uiDrawBrushTypeLinearGradient
            X0 = start.x
            Y0 = start.y
            X1 = end.x
            Y1 = end.y
            NumStops = stops.size.convert()
            Stops = nativeHeap.allocArray<uiDrawBrushGradientStop>(stops.size)
            stops.forEachIndexed { i, (pos, color) ->
                with(Stops!![i]) {
                    Pos = pos
                    R = color.r
                    G = color.g
                    B = color.b
                    A = color.a
                }
            }
        }
        return this
    }

    /** Helper to quickly create radial brush */
    fun radial(start: Point, center: Point, radius: Double, vararg stops: Pair<Double, Color>): Brush {
        clear()
        with(ptr.pointed) {
            Type = uiDrawBrushTypeRadialGradient
            X0 = start.x
            Y0 = start.y
            X1 = center.x
            Y1 = center.y
            OuterRadius = radius
            NumStops = stops.size.convert()
            Stops = nativeHeap.allocArray<uiDrawBrushGradientStop>(stops.size)
            stops.forEachIndexed { i, (pos, color) ->
                with(Stops!![i]) {
                    Pos = pos
                    R = color.r
                    G = color.g
                    B = color.b
                    A = color.a
                }
            }
        }
        return this
    }
}

///////////////////////////////////////////////////////////////////////////////

/** Creates a new [Stroke] with lifecycle delegated to [DrawArea]. */
fun DrawArea.stroke(block: uiDrawStrokeParams.() -> Unit = {}): Stroke {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return Stroke().also {
        disposables.add(it)
        block.invoke(it.ptr.pointed)
    }
}

/** Describes the stroke to draw with. */
class Stroke : Disposable<uiDrawStrokeParams>(
    alloc = nativeHeap.alloc<uiDrawStrokeParams>().ptr
) {
    override fun free() = nativeHeap.free(ptr)
}

///////////////////////////////////////////////////////////////////////////////

/** Represent a path that could be drawed on a [DrawContext] */
class Path(mode: uiDrawFillMode) : Disposable<uiDrawPath>(
    alloc = uiDrawNewPath(mode)
) {
    override fun free() = uiDrawFreePath(ptr)

    /** Starts a new figure at the specified point. Call this method when you want to create a new path. */
    fun figure(x: Double, y: Double) = uiDrawPathNewFigure(ptr, x, y)

    /** Starts a new figure and adds an arc to the path which is centered at (`xCenter`, `yCenter`) position
     *  with radius `radius` starting at `startAngle` and with sweep angle `sweep` going in the given direction
     *  by anticlockwise (defaulting to clockwise) as specified by `negative`. */
    fun figureWithArc(
        xCenter: Double,
        yCenter: Double,
        radius: Double,
        startAngle: Double,
        sweep: Double,
        negative: Boolean = false
    ) =
        uiDrawPathNewFigureWithArc(ptr, xCenter, yCenter, radius, startAngle, sweep, if (negative) 1 else 0)

    /** Connects the last point in the subpath to the `x`, `y` coordinates with a straight line. */
    fun lineTo(x: Double, y: Double) = uiDrawPathLineTo(ptr, x, y)

    /** Adds an arc to the path which is centered at (`xCenter`, `yCenter`) position with radius `radius`
     *  starting at `startAngle` and with sweep angle `sweep` going in the given direction by
     *  anticlockwise (defaulting to clockwise) as specified by `negative`. */
    fun arcTo(
        xCenter: Double,
        yCenter: Double,
        radius: Double,
        startAngle: Double,
        sweep: Double,
        negative: Boolean = false
    ) =
        uiDrawPathArcTo(ptr, xCenter, yCenter, radius, startAngle, sweep, if (negative) 1 else 0)

    /** Adds a cubic Bézier curve to the path. It requires three points. The first two points are control
     *  points and the third one is the end point. The starting point is the last point in the current path. */
    fun bezierTo(c1x: Double, c1y: Double, c2x: Double, c2y: Double, endX: Double, endY: Double) =
        uiDrawPathBezierTo(ptr, c1x, c1y, c2x, c2y, endX, endY)

    /** Creates a path for a rectangle at position (`x`, `y`) with a size that is determined by `width` and `height`. */
    fun rectangle(x: Double, y: Double, width: Double, height: Double) =
        uiDrawPathAddRectangle(ptr, x, y, width, height)

    /** Causes the point of the pen to move back to the start of the current sub-path. It tries to draw
     *  a straight line from the current point to the start. If the shape has already been closed or has
     *  only one point, this function does nothing.
     *  It end the path. */
    fun closeFigure() = uiDrawPathCloseFigure(ptr)
}

///////////////////////////////////////////////////////////////////////////////

/** Defines a transformation (e.g. rotation, translation) */
class Matrix : Disposable<uiDrawMatrix>(
    alloc = nativeHeap.alloc<uiDrawMatrix>().ptr
) {
    override fun free() = nativeHeap.free(ptr)

    /** Moves paths over by `x` to the right and `y` down. */
    fun translate(x: Double, y: Double) =
        uiDrawMatrixTranslate(ptr, x, y)

    /** Scales pathes by a factor of `x` and `y` with (`xCenter`, `yCenter`) as the scale center. */
    fun scale(xCenter: Double, yCenter: Double, x: Double, y: Double) =
        uiDrawMatrixScale(ptr, xCenter, yCenter, x, y)

    /** Rotates paths by `amount` **radians** around (`x`, `y`). */
    fun rotate(x: Double, y: Double, amount: Double) =
        uiDrawMatrixRotate(ptr, x, y, amount)

    /** Skews path by `xamount` **radians** horizontally and by `yamount` **radians** vertically around (`x`, `y`) */
    fun skew(x: Double, y: Double, xamount: Double, yamount: Double) =
        uiDrawMatrixSkew(ptr, x, y, xamount, yamount)

    /** Sets the matrix to the product of itself with `other` matrix. */
    fun multiply(other: Matrix) = uiDrawMatrixMultiply(ptr, other.ptr)

    /** Returns `true` if the matrix is invertible. */
    val invertible: Boolean get() = uiDrawMatrixInvertible(ptr) != 0

    /** Inverts the matrix. */
    fun invert() = uiDrawMatrixInvert(ptr)

    /** Returns the transformed point. */
    val point: Point
        get() = memScoped {
            val x = alloc<DoubleVar>()
            val y = alloc<DoubleVar>()
            uiDrawMatrixTransformPoint(ptr, x.ptr, y.ptr)
            Point(x.value, y.value)
        }

    /** Returns the transformed size. */
    val size: Size
        get() = memScoped {
            val width = alloc<DoubleVar>()
            val height = alloc<DoubleVar>()
            uiDrawMatrixTransformSize(ptr, width.ptr, height.ptr)
            Size(width.value, height.value)
        }
}
