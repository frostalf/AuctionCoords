
package me.xsilverfalconx.auctioncoords.util;

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 *
 * @author Frostalf
 */
public class PlayerUtil {
    
    private String playerName;
    private Player player;
    
    public PlayerUtil (Player player) {
        this.player = player;
        this.playerName = player.getName();
    }
    
    public String getPlayerName() {
        return this.playerName;
    }
    
    public Player getPlayer() {
        return this.player;
    }

}
