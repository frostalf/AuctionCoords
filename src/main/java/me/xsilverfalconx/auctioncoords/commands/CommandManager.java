
package me.xsilverfalconx.auctioncoords.commands;

import com.google.common.collect.Maps;
import com.massivecraft.factions.entity.BoardColls;
import com.massivecraft.factions.entity.Faction;
import com.massivecraft.factions.entity.UPlayer;
import com.massivecraft.mcore.ps.PS;
import java.util.Map;
import me.xsilverfalconx.auctioncoords.AuctionCoords;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Frostalf
 */
public class CommandManager implements CommandExecutor {

    private AuctionCoords plugin;
    private Map<String, CommandExecutor> subCommandMap = Maps.newHashMap();
    
    public CommandManager (AuctionCoords plugin) {
        this.plugin = plugin;
        subCommandMap.put("auction", new AuctionCommand(plugin));
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        CommandExecutor subCommandAuction = subCommandMap.get("auction");
        
        if(cmd.getName().equalsIgnoreCase("auction")) {
            if(args.length == 0) {
                return subCommandAuction.onCommand(sender, cmd, commandLabel, args);
            }
        }
               /*if (sender instanceof Player) {
                Player player = (Player) sender;
                UPlayer uplayer = UPlayer.get(player);
                World w = player.getWorld();
                if (cmd.getName().equalsIgnoreCase("aucc") && args.length == 2 && args[0] != null) {
                    Location l = player.getLocation();
                    Faction faction = BoardColls.get().getFactionAt(PS.valueOf(l));
                    if (faction.getName().equals("Wilderness") || faction.getName().equals("Safe Zone")) {
                        //server owned faction, cannot be sold
                        player.sendMessage("You need to be on a players' faction land to sell coords.");
                    } else {
                        //printing out that this is a player owned factions
                        player.sendMessage("Player owned");
                        if (!(playersenabled.contains(player.getName()))) {
                           // if they arent selling a faction
                          if (m.size() <= 9) {
                              // if theres room on the array
                            if (checkConfig(faction) == false) {
                                //if the faction hasnt been sold, once sold or being sold the faction gets added to config
                                playersenabled.add(player.getName());
                                //add that you are selling
                                x.set(faction.getName(), args[0]);
                                //set the price and the faction in the config
                                m.add(player.getName() + " : " + x.getInt(faction.getName()));
                                //add it to the array with the price from the config
                            } else {
                                //this faction is already sold as listed in the config
                                player.sendMessage("You can't sell a faction that has already been sold or is being sold.");
                            }
                          } else {
                              //array is maxed out.
                              player.sendMessage("There are too many factions Co-ords being sold, please try again when there is more sold.");
                          }
                        } else {
                            //you cant sell 2 at once.
                            player.sendMessage("You're already selling a faction Co-ord.");
                        }
                    }
                } else if
                    (cmd.getName().equalsIgnoreCase("aucc") && args.length == 3 && args[0].equalsIgnoreCase("buy") && args[1] !=null ) {
                    if (m.contains(args[1])) {
                        //the array contains the facton being sold
                        m.remove(args[1] + " : " + x.getInt(args[1]));
                        //remove the entry from the array so that no one else can buy...
                        double payment = x.getInt(args[1]);
                        //pay the player... somehow
                        Bukkit.dispatchCommand(Sender, commandLabel);
                    } else {
                        //invalid fac
                        player.sendMessage("That faction doesn't exist!");
                    }
                }
            }*/
        
        
        return false;
    }
}
