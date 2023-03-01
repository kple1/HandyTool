package io.leeple.handytool;

import io.leeple.handytool.Command.GiveWeapon;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginCommand("Weapon").setExecutor(new GiveWeapon());
    }

    @Override
    public void onDisable() {

    }
}
