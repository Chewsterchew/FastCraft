package net.benwoodworth.fastcraft.core.dependencies.event

import java.util.*

/**
 * Listens to events, and notifies event handlers when events occur.
 *
 * @param TEvent the type of event being listened for
 */
class EventListener<TEvent> {

    /** This listener's event handlers. */
    private val handlers = HashSet<(event: TEvent) -> Unit>()

    /**
     * Raise an event.
     *
     * @param event the event to handle
     */
    fun notifyHandlers(event: TEvent) {
        handlers.forEach { it(event) }
    }

    /**
     * Add an event handler to this listener.
     *
     * @param handler the event handler to add to this event
     */
    fun addHandler(handler: (event: TEvent) -> Unit) {
        handlers += handler
    }

    /**
     * Remove an event handler from this listener.
     *
     * @param handler the event handler to remove from this listener
     */
    fun removeHandler(handler: (event: TEvent) -> Unit) {
        handlers -= handler
    }
}
