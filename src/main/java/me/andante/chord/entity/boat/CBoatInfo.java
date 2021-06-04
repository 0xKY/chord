package me.andante.chord.entity.boat;

import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public record CBoatInfo(Item item, Item planks, Identifier texture, BoatEntity.Type vanilla) {
    public Item asItem() {
        return this.item;
    }

    public Item asPlanks() {
        return this.planks;
    }

    public Identifier getTexture() {
        return this.texture;
    }

    public BoatEntity.Type getVanillaType() {
        return this.vanilla;
    }
}
