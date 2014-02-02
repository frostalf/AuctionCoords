
package me.xsilverfalconx.auctioncoords.commands;

import com.google.common.collect.Maps;
import java.util.Map;
import me.xsilverfalconx.auctioncoords.AuctionCoords;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

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
        return false;
    }
}
