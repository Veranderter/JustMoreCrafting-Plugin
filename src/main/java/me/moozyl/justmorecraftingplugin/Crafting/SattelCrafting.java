package me.moozyl.justmorecraftingplugin.Crafting;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class SattelCrafting {

    public static void registerRecipe() {
        ItemStack customItem = new ItemStack(Material.SADDLE);
        ShapedRecipe recipe = new ShapedRecipe(customItem);

        recipe.shape("ABA", "DAD", "AAA");

        recipe.setIngredient('A', Material.AIR);
        recipe.setIngredient('B', Material.LEATHER);
        recipe.setIngredient('D', Material.STICK);
    }
}
