package land.builders.worldeditwandaddition.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.InventoryHolder;

public class RightClickListener implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void onLeftClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (playerOpenContainer(event)) return;
        if (!event.getAction().equals(Action.RIGHT_CLICK_AIR)) return;
        if (event.getItem() == null || !event.getItem().getType().equals(Material.WOODEN_AXE)) return;
        if (!player.hasPermission("worldedit.selection.pos")) return;

        event.setCancelled(true);
        player.performCommand("/pos2");

    }
    private static boolean playerOpenContainer(PlayerInteractEvent event) {
        return event.getClickedBlock() != null && event.getClickedBlock() instanceof InventoryHolder;
    }
}
