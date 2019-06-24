package pw.landon.extraslot;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ExtraSlot extends JavaPlugin {
    private static ExtraSlot instance;

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getPluginManager().registerEvents(new SlotModifier(this), this);
    }

    public static ExtraSlot getInstance() {return instance;}
}
