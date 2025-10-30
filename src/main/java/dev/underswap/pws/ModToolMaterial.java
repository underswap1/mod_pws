package dev.underswap.pws;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;

public class ModToolMaterial {
    public static final ToolMaterial BONE = new ToolMaterial() {

        @Override
        public int getDurability() {
            return 150;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 3.0F;
        }

        @Override
        public float getAttackDamage() {
            return 1.0F;
        }

        @Override
        public int getMiningLevel() {
            return 1;
        }

        @Override
        public int getEnchantability() {
            return 17;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.BONE);
        }
    };

    public static final ToolMaterial FLINT = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 20;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 8.0F;
        }

        @Override
        public float getAttackDamage() {
            return -0.5F;
        }

        @Override
        public int getMiningLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 10;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.FLINT);
        }
    };

    public static final ToolMaterial OBSIDIAN = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 100;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 9.0F;
        }

        @Override
        public float getAttackDamage() {
            return 4.0F;
        }

        @Override
        public int getMiningLevel() {
            return 2;
        }

        @Override
        public int getEnchantability() {
            return 5;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.OBSIDIAN);
        }
    };

    public static final ToolMaterial SANDSTONE = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 40;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 3.0F;
        }

        @Override
        public float getAttackDamage() {
            return 0.5F;
        }

        @Override
        public int getMiningLevel() {
            return 1;
        }

        @Override
        public int getEnchantability() {
            return 5;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.SANDSTONE);
        }
    };
}