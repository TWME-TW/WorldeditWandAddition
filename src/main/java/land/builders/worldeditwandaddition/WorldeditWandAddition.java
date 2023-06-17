package land.builders.worldeditwandaddition;

import land.builders.worldeditwandaddition.listeners.LeftClickListener;
import land.builders.worldeditwandaddition.listeners.RightClickListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldeditWandAddition extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new LeftClickListener(),this);
        Bukkit.getServer().getPluginManager().registerEvents(new RightClickListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
