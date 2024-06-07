package net.devtroika.utils

import net.minecraft.registry.RegistryKey
import net.minecraft.server.MinecraftServer
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

object DimensionUtil {
    fun teleportPlayerToDimension(player: ServerPlayerEntity, targetDimension: RegistryKey<World>, targetPos: BlockPos) {
        val server: MinecraftServer = player.server
        val targetWorld = server.getWorld(targetDimension) ?: return

        player.teleport(targetWorld, targetPos.x.toDouble(), targetPos.y.toDouble(), targetPos.z.toDouble(), player.yaw, player.pitch)
    }
}