package me.andante.chord.util;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;


public class CTagUtil {

    public static Boolean tagContainsItem(TagKey<Item> tag, Item item) {
        return Registries.ITEM.getOrCreateEntryList(tag).contains(Registries.ITEM.entryOf(item.getRegistryEntry().registryKey()));
    }
}
