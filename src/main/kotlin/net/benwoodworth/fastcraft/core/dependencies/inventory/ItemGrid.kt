package net.benwoodworth.fastcraft.core.dependencies.inventory

/**
 * A grid of items.
 *
 * @param T the type of item in the grid
 */
interface ItemGrid<out T> {

    /** The width of the item grid. */
    val width: Int

    /** The height of the item grid. */
    val height: Int

    /**
     * Get an item from the item grid.
     *
     * @param x the x-coordinate within the grid, where 0 is the left column
     * @param y the y-coordinate within the grid, where 0 is the top row
     * @return the item at the specified coordinates
     */
    fun getItem(x: Int, y: Int): T
}
