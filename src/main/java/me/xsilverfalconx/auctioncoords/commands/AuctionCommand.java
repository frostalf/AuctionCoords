
package me.xsilverfalconx.auctioncoords.commands;

import me.xsilverfalconx.auctioncoords.AuctionCoords;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Frostalf
 */
public class AuctionCommand implements CommandExecutor {

    private AuctionCoords plugin;
    
    public AuctionCommand (AuctionCoords plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        
        if(sender instanceof Player) {
            Player player = (Player) sender;
            UPl
        }
        return false;
    }
}
