package me.moozyl.justmorecraftingplugin.Crafting;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class NameTagCrafting {

    public static void registerRecipe() {
        ItemStack customItem = new ItemStack(Material.NAME_TAG);
        ShapedRecipe recipe = new ShapedRecipe(customItem);

        recipe.shape("LSI", "SCS", "PSL");

        recipe.setIngredient('S', Material.STRING);
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('C', Material.OAK_SIGN);
        recipe.setIngredient('P', Material.PAPER);
        recipe.setIngredient('L', Material.AIR);
    }
}
