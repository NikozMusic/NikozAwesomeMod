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


    //Register the items
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
