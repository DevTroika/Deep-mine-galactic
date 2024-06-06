package net.devtroika.item

import net.devtroika.Deepminegalactic
import net.devtroika.block.ModBlocks
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ModItemGroups {
    val DMG_GROUP: ItemGroup = Registry.register(
        Registries.ITEM_GROUP,
        Identifier(Deepminegalactic.MOD_ID, "ruby"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.DMG"))
            .icon { ItemStack(ModBlocks.ModBlocks.BEER) }
            .entries { displayContext, entries ->
                entries.add(ModBlocks.ModBlocks.BEER)
                entries.add(Items.DIRT)
            }
            .build()
    )

    fun registerItemGroups() {
    }
}
