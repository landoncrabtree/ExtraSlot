package pw.landon.extraslot;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class SlotModifier implements Listener {
    private ExtraSlot main = ExtraSlot.getInstance();
    public SlotModifier(ExtraSlot main) {this.main = main;}

    @EventHandler
    public void onServerListPingEvent(ServerListPingEvent event) {
        event.setMaxPlayers(event.getNumPlayers() + 1);
    }
}
