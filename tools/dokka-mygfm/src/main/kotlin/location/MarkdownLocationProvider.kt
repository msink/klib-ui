package org.jetbrains.dokka.gfm.location

import org.jetbrains.dokka.base.resolvers.local.DokkaLocationProvider
import org.jetbrains.dokka.base.resolvers.local.LocationProviderFactory
import org.jetbrains.dokka.links.DRI
import org.jetbrains.dokka.model.DisplaySourceSet
import org.jetbrains.dokka.pages.*
import org.jetbrains.dokka.plugability.DokkaContext

class MarkdownLocationProvider(
    pageGraphRoot: RootPageNode,
    dokkaContext: DokkaContext
) : DokkaLocationProvider(pageGraphRoot, dokkaContext, ".md") {

    class Factory(private val context: DokkaContext) : LocationProviderFactory {
        override fun getLocationProvider(pageNode: RootPageNode) =
            MarkdownLocationProvider(pageNode, context)
    }

    override val PAGE_WITH_CHILDREN_SUFFIX = "README"

    override fun pathTo(node: PageNode, context: PageNode?): String {
        return super.pathTo(node, context).removePrefix("libui/")
    }

    val inherited = mapOf(
        "Menu/" to "_uiMenu",
        "MenuItem/" to "_uiMenuItem",
        "DrawContext/" to "_uiDrawContext",
        "AreaDrawParams/" to "_uiAreaDrawParams",
        "AreaMouseEvent/" to "_uiAreaMouseEvent",
        "PasswordField/readonly" to "TextField",
        "SearchField/readonly" to "TextField",
        "PasswordField/value" to "TextField",
        "SearchField/value" to "TextField",
        "DatePicker/value" to "DateTimePicker",
        "TimePicker/value" to "DateTimePicker",
        "HBox/padded" to "Box",
        "VBox/padded" to "Box",
        "HBox/stretchy" to "Box",
        "VBox/stretchy" to "Box",
        "*/disposed" to "Disposable",
        "*/type" to "Attribute",
        "*/toplevel" to "Control",
        "*/parent" to "Control",
        "*/enabled" to "Control",
        "*/visible" to "Control",
    )

    val libiuClasses = listOf(
        "kt-area-handler",
        "kt-table-handler",
        "ui-area-draw-params",
        "ui-area-handler",
        "ui-area-key-event",
        "ui-area-mouse-event",
        "ui-control",
        "ui-draw-brush",
        "ui-draw-brush-gradient-stop",
        "ui-draw-matrix",
        "ui-draw-stroke-params",
        "ui-draw-text-layout-params",
        "ui-font-descriptor",
        "ui-init-options",
        "ui-table-model-handler",
        "ui-table-params",
        "ui-table-text-column-optional-params",
    )

    val typeAliases = listOf(
        "AreaDrawParams",
        "AreaMouseEvent",
        "DrawContext",
        "Menu",
        "MenuItem",
    )

    override fun resolve(dri: DRI, sourceSets: Set<DisplaySourceSet>, context: PageNode?): String? {
        val classNames =
            inherited[dri.classNames.orEmpty() + "/" + dri.callable?.name.orEmpty()]
                ?: inherited["*/" + dri.callable?.name.orEmpty()]
                ?: dri.classNames
        val it = super.resolve(dri.copy(classNames = classNames), sourceSets, context)
        if ((context is ClasslikePageNode && it == PAGE_WITH_CHILDREN_SUFFIX + extension) ||
            (context is MemberPageNode && it == identifierToFilename(context.name) + extension)
        ) return null
        if (it == null && (classNames?.startsWith("ui") == true || classNames?.startsWith("kt") == true)) {
            val path = if (context != null) pathToRoot(context).dropLast(4) else ""
            val name = identifierToFilename(classNames)
            return "${path}/libui/${if (name in libiuClasses) "$name/README" else name}${extension}"
        }
        if (it == null && dri.classNames?.let { it in typeAliases } == true) {
            val path = if (context != null) pathToRoot(context).dropLast(3) else ""
            val name = identifierToFilename(dri.classNames!!)
            return if (context?.name.let { it in listOf("libui.ktx", "DrawArea", "ScrollingArea", "draw", "mouseEvent") } == true)
                "${path.dropLast(3)}${name}${extension}"
            else "${path}libui.ktx/${name}${extension}"
        }
        if (it == null && dri.callable?.name.equals("disposed") == true) {
            val path = if (context != null) pathToRoot(context).dropLast(4) else ""
            return "${path}/libui.ktx/-disposable/disposed${extension}"
        }
        return it
    }

    override fun ancestors(node: PageNode): List<PageNode> {
        return generateSequence(node) { it.parent() }
            .filterNot { it is RendererSpecificPage }
            .filterNot { it is ModulePageNode }
            .toList()
    }

    private fun PageNode.parent() = pageGraphRoot.parentMap[this]
}