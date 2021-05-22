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

    override fun resolve(dri: DRI, sourceSets: Set<DisplaySourceSet>, context: PageNode?): String? {
        val it = super.resolve(dri, sourceSets, context)
        if ((context is ClasslikePageNode && it == PAGE_WITH_CHILDREN_SUFFIX + extension) ||
            (context is MemberPageNode && it == identifierToFilename(context.name) + extension)
        ) {
            return null
        } else {
            return it
        }
    }

    override fun ancestors(node: PageNode): List<PageNode> {
        return generateSequence(node) { it.parent() }
            .filterNot { it is RendererSpecificPage }
            .filterNot { it is ModulePageNode }
            .toList()
    }

    private fun PageNode.parent() = pageGraphRoot.parentMap[this]
}