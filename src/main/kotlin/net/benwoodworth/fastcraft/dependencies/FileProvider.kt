package net.benwoodworth.fastcraft.dependencies

import java.nio.file.Path

/**
 * Provides files for the server.
 */
interface FileProvider {

    /** The directory in which this plugin's files are stored */
    val pluginDirectory: Path

    /** The FastCraft configuration file */
    val configFile: Path
}