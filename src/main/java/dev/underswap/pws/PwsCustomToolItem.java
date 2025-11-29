package dev.underswap.pws;

import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

import java.util.UUID;
public class PwsCustomToolItem{

}
     class KnifeItem extends ToolItem {
        private static final UUID ATTACK_DAMAGE_MODIFIER_ID = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
        private static final UUID ATTACK_SPEED_MODIFIER_ID = UUID.fromString("22653B89-116E-49DC-9B6B-9971489B5BE5");

        private final float attackDamage;
        private final float attackSpeed;
        private final Multimap<EntityAttribute, EntityAttributeModifier> modifiers;

        KnifeItem(ToolMaterial material, float attackDamage, float attackSpeed, FabricItemSettings settings) {
            super(material, settings);
            this.attackDamage = attackDamage;
            this.attackSpeed = attackSpeed;

            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
            builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE,
                    new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
            builder.put(EntityAttributes.GENERIC_ATTACK_SPEED,
                    new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", this.attackSpeed, EntityAttributeModifier.Operation.ADDITION));
            this.modifiers = builder.build();
        }

        @Override
        public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
            return slot == EquipmentSlot.MAINHAND ? this.modifiers : super.getAttributeModifiers(slot);
        }
    }