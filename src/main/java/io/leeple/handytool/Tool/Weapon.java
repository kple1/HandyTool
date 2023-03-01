package io.leeple.handytool.Tool;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Weapon {
    public ItemStack S10(Player player) {
        ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = sword.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 30, true);
        sword.setItemMeta(meta);
        player.getInventory().addItem(sword);
        return sword;
    }
}
