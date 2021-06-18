[libui.ktx.draw](../README.md) / [Path](README.md) / [closeFigure](close-figure.md)

# closeFigure

`fun closeFigure()`

Causes the point of the pen to move back to the start of the current sub-path. It tries to draw a straight line from the current point to the start. If the shape has already been closed or has only one point, this function does nothing. It end the path.
