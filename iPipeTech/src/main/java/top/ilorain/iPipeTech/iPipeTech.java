package top.ilorain.iPipeTech;

import org.bukkit.plugin.java.JavaPlugin;

public class iPipeTech extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("iPipeTech Enabled!");
    }

    @Override
    public void onDisable(){
        getLogger().info("iPipeTech Disabled");
    }
}
