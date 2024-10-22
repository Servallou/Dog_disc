package io.github.servmod.dogDisc.items;

import io.github.servmod.dogDisc.DogDisc;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DOG_DISC = registerItem("dog_disc", new Item(new Item.Settings().jukeboxPlayable()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DogDisc.MOD_ID, name), item);
    }
}
