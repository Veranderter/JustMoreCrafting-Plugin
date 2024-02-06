package me.moozyl.justmorecraftingplugin.Crafting;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class ElytraCrafting {

    public static void registerRecipe() {
        ItemStack customItem = new ItemStack(Material.ELYTRA);
        ShapedRecipe recipe = new ShapedRecipe(customItem);

        recipe.shape("FLF", "PCP", "LEL");

        recipe.setIngredient('F', Material.FEATHER);
        recipe.setIngredient('P', Material.PHANTOM_MEMBRANE);
        recipe.setIngredient('C', Material.NETHERITE_CHESTPLATE);
        recipe.setIngredient('E', Material.NETHERITE_INGOT, 2);
        recipe.setIngredient('L', Material.AIR);
    }
}
