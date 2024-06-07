package net.devtroika.item.custom



import net.devtroika.Deepminegalactic
import net.devtroika.utils.DimensionUtil
import net.minecraft.block.Block
import net.minecraft.entity.LivingEntity
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemStack
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World


class BeerItem(block: Block, settings: Settings) : BlockItem(block, settings) {
    override fun finishUsing(stack: ItemStack?, world: World?, user: LivingEntity?): ItemStack? {
        if (!world?.isClient!!) {
            if (user is ServerPlayerEntity) {
                val targetDimension = RegistryKey.of(RegistryKeys.WORLD, Identifier(Deepminegalactic.MOD_ID, "hub"))
                DimensionUtil.teleportPlayerToDimension(user, targetDimension, BlockPos(0, 200, 0))
            }
        }
        return super.finishUsing(stack, world, user)
    }
}