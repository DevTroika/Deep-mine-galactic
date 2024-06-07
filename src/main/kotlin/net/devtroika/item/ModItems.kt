package net.devtroika.item

import net.devtroika.Deepminegalactic
import net.devtroika.item.custom.BeerItem
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier

class ModItems {
    object ModBlocks {
        val BEER: Block = registerBlock("beer",
            Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD).sounds(BlockSoundGroup.WOOD)))

        private fun registerBlock(name: String, block: Block): Block {
            registerBlockItem(name, block)
            return Registry.register(Registries.BLOCK, Identifier(Deepminegalactic.MOD_ID, name), block)
        }

        private fun registerBlockItem(name: String, block: Block): Item {
            return Registry.register(Registries.ITEM, Identifier(Deepminegalactic.MOD_ID, name),
                BeerItem(FabricItemSettings().food(ModFoodComponents.BEER))
            )
        }

        fun registerModBlocks() {
        }
    }
}