package xyz.mglolenstine.creativechestblocker;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;

public class InventoryListener implements Listener {
    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e){
        if(e.getInventory().getType() != InventoryType.PLAYER){
            if(e.getPlayer().getGameMode() == GameMode.CREATIVE){
                e.setCancelled(true);
            }
        }
    }
}
