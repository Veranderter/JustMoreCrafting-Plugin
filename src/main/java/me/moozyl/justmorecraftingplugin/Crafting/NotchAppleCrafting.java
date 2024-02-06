package me.moozyl.justmorecraftingplugin.Crafting;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class NotchAppleCrafting {

    public static void registerRecipe() {
        ItemStack customItem = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
        ShapedRecipe recipe = new ShapedRecipe(customItem);

        recipe.shape("GGG", "GAG", "GGG");

        recipe.setIngredient('G', Material.GOLD_BLOCK, 2);
        recipe.setIngredient('B', Material.GOLDEN_APPLE);
    }
}
