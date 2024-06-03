package net.devtroika.items

import net.minecraft.item.FoodComponent

object ModFoodComponents {
    val BEER: FoodComponent = FoodComponent.Builder().hunger(3).saturationModifier(0.25f).alwaysEdible().build()
        // на будущее
}
