
package me.xsilverfalconx.auctioncoords;

import com.massivecraft.factions.entity.Board;
import com.massivecraft.factions.entity.BoardColls;
import com.massivecraft.factions.entity.Faction;
import com.massivecraft.factions.entity.FactionColl;
import com.massivecraft.factions.entity.FactionColls;
import com.massivecraft.factions.entity.UPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import me.xsilverfalconx.auctioncoords.util.PlayerUtil;
import org.bukkit.entity.Player;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Frostalf
 */
public class AuctionCoords extends JavaPlugin {
     
        ArrayList m = new ArrayList();
        Set<String> playersenabled = new HashSet<String>();
        
        private HashMap<String, PlayerUtil> playerMap = new HashMap<String, PlayerUtil>();
        
        public void addPlayer(Player player) {
            String playerName = player.getName();
            PlayerUtil playerUtil = new PlayerUtil(player);
            this.playerMap.put(playerName, playerUtil);
        }
        
        public void removePlayer(Player player) {
            String playerName = player.getName();            
            this.playerMap.remove(playerName);
        }
        
        public String getPlayerName(Player player) {
            return this.playerMap.get(player.getName()).getPlayerName();
        }
        
        public Player getPlayer(Player player) {
            return this.playerMap.get(player.getName()).getPlayer();
        }
        
        public Player getPlayer(String player) {
            return this.playerMap.get(player).getPlayer();
        }
     
        /*public boolean checkConfig(Faction a) {
            boolean argh;
            if (x.contains(a.getName())) {
                argh = true;
            } else {
                argh = false;
            }
            return argh;
        }*/
     
        @Override
        public void onDisable() {
        }
     
        @Override
        public void onEnable() {
        }
}
