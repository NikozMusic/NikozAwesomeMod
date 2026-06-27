package net.zmods.awesomemod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zmods.awesomemod.AwesomeMod;

public class ModItems {
    //Define what an item is in the first place
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AwesomeMod.MOD_ID);

    public static final DeferredItem<Item> LITHIUM = ITEMS.register("lithium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(new Item.Properties()));


    //Register the items
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
