package net.devtroika.item.custom



import net.devtroika.item.ModItems
import net.minecraft.block.Block
import net.minecraft.entity.LivingEntity
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.world.World


class BeerItem(settings: Settings) : BlockItem(ModItems.ModBlocks.BEER, settings) {
    override fun finishUsing(stack: ItemStack?, world: World?, user: LivingEntity?): ItemStack? {
        if (!world?.isClient!!) {
            if (user != null) {
                user.sendMessage(Text.literal("test"))
            }
        }
        return super.finishUsing(stack, world, user)
    }
}
