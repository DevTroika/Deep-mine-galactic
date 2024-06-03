package net.devtroika.items

import net.devtroika.Deepminegalactic
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {
    val BEER: Item = registerItem("beer", Item(FabricItemSettings().food(ModFoodComponents.BEER)))


    private fun registerItem(name: String, item: Item): Item {
        return Registry.register(Registries.ITEM, Identifier(Deepminegalactic.MOD_ID, name), item)
    }

    fun registerModItems() {
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup)
    }
}