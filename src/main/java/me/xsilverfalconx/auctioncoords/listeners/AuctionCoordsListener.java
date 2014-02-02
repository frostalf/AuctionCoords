
package me.xsilverfalconx.auctioncoords.listeners;

import java.util.HashMap;
import me.xsilverfalconx.auctioncoords.AuctionCoords;
import me.xsilverfalconx.auctioncoords.util.PlayerUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 *
 * @author Frostalf
 */
public class AuctionCoordsListener implements Listener {
    
    private AuctionCoords plugin;
    public AuctionCoordsListener (AuctionCoords plugin) {
        this.plugin = plugin;
    }
    
    
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        plugin.addPlayer(player);
    }
    
    public void onLeave(PlayerQuitEvent event) {
        Player playerQuiting = event.getPlayer();
        plugin.removePlayer(playerQuiting);
    }
    
    public void onKick(PlayerKickEvent event) {
        Player playerKicked = event.getPlayer();
        plugin.removePlayer(playerKicked);
    }

}
