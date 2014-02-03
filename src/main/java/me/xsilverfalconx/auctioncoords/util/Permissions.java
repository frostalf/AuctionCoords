
package me.xsilverfalconx.auctioncoords.util;

import java.util.ArrayList;
import java.util.Arrays;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Frostalf
 */
public enum Permissions {

    AUCTION("auctioncoords.sell", "auctioncoords.*"),
    BID("auctioncoords.bid", "auctioncoords.*"),
    BANNED_ITEM("auctioncoords.%itemname%", "auctioncoords.%itemid%");
    
    String perm;
    ArrayList<String> hierarchy = new ArrayList<String>();

    private Permissions(String perm, String... hierarchy) {
        this.perm = perm;
        this.hierarchy.addAll(Arrays.asList(hierarchy));
    }
    
    public boolean hasPerm(CommandSender sender){
        if(sender instanceof Player){
        return hasPerm((Player) sender);
        } else {
            sender.sendMessage("Commands can only be done in game!");
            return false;
        }
    }
    
    public boolean hasPerm(Player player){
        if(!(player.hasPermission(this.perm))) {
            for(String s : this.hierarchy){
                if(player.hasPermission(s)){
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }    
    
}
