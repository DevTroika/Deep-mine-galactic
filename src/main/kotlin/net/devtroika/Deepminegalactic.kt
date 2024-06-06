package net.devtroika

import net.devtroika.block.ModBlocks
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Deepminegalactic : ModInitializer {
	public final val MOD_ID: String = "deep-mine-galactic"
    private val logger = LoggerFactory.getLogger("deep-mine-galactic")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		ModBlocks.ModBlocks.registerModBlocks()
		logger.info("Hello Fabric world!")
	}
}