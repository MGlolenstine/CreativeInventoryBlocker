package xyz.mglolenstine.creativechestblocker;

import org.bukkit.plugin.java.JavaPlugin;

public final class Creativechestblocker extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new InventoryListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
