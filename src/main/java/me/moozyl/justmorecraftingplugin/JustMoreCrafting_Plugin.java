package me.moozyl.justmorecraftingplugin;

import me.moozyl.justmorecraftingplugin.Crafting.ElytraCrafting;
import me.moozyl.justmorecraftingplugin.Crafting.NameTagCrafting;
import me.moozyl.justmorecraftingplugin.Crafting.NotchAppleCrafting;
import me.moozyl.justmorecraftingplugin.Crafting.SattelCrafting;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class JustMoreCrafting_Plugin extends JavaPlugin {

    @Override
    public void onEnable() {

        SattelCrafting.registerRecipe();
        Bukkit.getConsoleSender().sendMessage("§aSattelCrafting Geladen!");
        NotchAppleCrafting.registerRecipe();
        Bukkit.getConsoleSender().sendMessage("§NotchAppleCrafting Geladen!");
        NameTagCrafting.registerRecipe();
        Bukkit.getConsoleSender().sendMessage("§NameTagCrafting Geladen!");
        ElytraCrafting.registerRecipe();
        Bukkit.getConsoleSender().sendMessage("§ElytraCrafting Geladen!");
    }
}
