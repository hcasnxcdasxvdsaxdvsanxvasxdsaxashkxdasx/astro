package me.procedures.astro.utils;

import me.procedures.astro.kit.KitInventory;
import org.bukkit.entity.Player;

public class InventoryUtil {

    public static KitInventory inventoryFromPlayer(Player player) {
        KitInventory kitInventory = new KitInventory();

        kitInventory.setContents(player.getInventory().getContents());
        kitInventory.setArmor(player.getInventory().getArmorContents());

        return kitInventory;
    }
}
