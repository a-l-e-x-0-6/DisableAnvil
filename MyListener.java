package com.github.a_l_e_x_0_6.NoAnvil;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;

public class MyListener implements Listener {
	@EventHandler
	public void onInventoryOpenEvent(InventoryOpenEvent event) {
		if (event.getInventory().getType() == InventoryType.ANVIL){
			event.setCancelled(true);
        }
	}
}
