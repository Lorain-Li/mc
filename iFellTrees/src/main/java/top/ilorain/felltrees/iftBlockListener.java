package top.ilorain.felltrees;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class iftBlockListener implements Listener {
    public iFellTrees plugin;

    public iftBlockListener(iFellTrees instance){
        this.plugin = instance;
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onBlockBreak(BlockBreakEvent event){
        Player iplayer = event.getPlayer();
        Block iblock = event.getBlock();
        this.plugin.info(iplayer.getName()+" break "+iblock.getType().name());
        if(iblock.getType().name().endsWith("_LOG"))
        {
            for(int i = 1;;i++){
                Block next = iplayer.getWorld().getBlockAt(iblock.getX(),iblock.getY()+i,iblock.getZ());
                if(next.getType().name() == iblock.getType().name()){
                    next.breakNaturally();
                }else {
                    break;
                }
            }
        }

    }
}
