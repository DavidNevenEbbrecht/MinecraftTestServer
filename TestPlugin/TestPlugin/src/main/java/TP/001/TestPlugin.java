package TP.001;

import org.bukkit.plugin.java.JavaPlugin;
import TP.001.managers.PluginManager;
import TP.001.listeners.PlayerListener;

public class TestPlugin extends JavaPlugin {
    
    @Override
    public void onEnable() {
        
        // Initialize managers
        PluginManager.getInstance().initialize();
        
        // Register listeners
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        
        getLogger().info("TestPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("TestPlugin has been disabled!");
    }
    
}