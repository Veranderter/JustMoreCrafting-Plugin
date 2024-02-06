package me.moozyl.justmorecraftingplugin.Crafting;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class ElytraCrafting {

    public static void registerRecipe() {
        ItemStack customItem = new ItemStack(Material.ELYTRA);
        ShapedRecipe recipe = new ShapedRecipe(customItem);

        recipe.shape("PDP", "PLP", "FLF");

        recipe.setIngredient('F', Material.FEATHER);
        recipe.setIngredient('P', Material.PHANTOM_MEMBRANE);
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('E', Material.NETHERITE_INGOT, 2);
        recipe.setIngredient('L', Material.AIR);
    }
}
