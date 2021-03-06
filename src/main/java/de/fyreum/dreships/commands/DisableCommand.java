package de.fyreum.dreships.commands;

import de.fyreum.dreships.DREShips;
import de.fyreum.dreships.config.ShipMessage;
import de.fyreum.dreships.sign.TravelSign;
import org.bukkit.entity.Player;

public class DisableCommand extends TravelSignCommand {

    DREShips plugin = DREShips.getInstance();

    public DisableCommand() {
        setCommand("disable");
        setAliases("dis");
        setMaxArgs(0);
        setHelp("/ds disable");
        setPermission("dreships.cmd.disable");
    }

    @Override
    public void onExecute(TravelSign travelSign, String[] args, Player player) {
        plugin.getSignManager().disable(travelSign);
        ShipMessage.CMD_DISABLE_SUCCESS.sendMessage(player);
    }
}
