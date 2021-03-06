package net.benwoodworth.fastcraft.core.dependencies.inventory

import net.benwoodworth.fastcraft.core.dependencies.recipes.FcRecipe

/**
 * A Minecraft crafting inventory.
 *
 * @param TItem the native item type
 */
interface FcCraftingInventory<TItem> {

    /** The crafting inventory's crafting matrix */
    val matrix: ItemGrid<FcItem<TItem>>

    /** The item in the result slot of the crafting inventory */
    val result: FcItem<TItem>

    /** The current recipe in the crafting inventory */
    val recipe: FcRecipe<TItem>
}
