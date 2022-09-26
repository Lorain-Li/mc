package top.ilorain.felltrees;

import org.bukkit.plugin.java.JavaPlugin;

public class iFellTrees extends JavaPlugin {
    public iftBlockListener block_listener;

    public void info(String msg){
        getLogger().info(msg);
    }

    @Override
    public  void onLoad(){
        getLogger().info("plugin load");
    }

    @Override
    public void onEnable(){
        getLogger().info("iFellTrees Enabled");
        this.block_listener = new iftBlockListener(this);
        getServer().getPluginManager().registerEvents(block_listener,this);
    }

}
