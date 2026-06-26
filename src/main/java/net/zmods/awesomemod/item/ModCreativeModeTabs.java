package net.zmods.awesomemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zmods.awesomemod.AwesomeMod;
import net.zmods.awesomemod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = // define what a creative tab is
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AwesomeMod.MOD_ID);


    public static final Supplier<CreativeModeTab> AWESOME_MOD_TAB = CREATIVE_MODE_TAB.register("nikoz_awesome_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LITHIUM.get()))
                    .title(Component.translatable("creativetab.nikozawesomemod.awesome_mod_tab"))
                    .displayItems((ItemDisplayParameters, output) -> {

                        // Add all the items from the tab here

                        output.accept(ModItems.LITHIUM);
                        output.accept(ModBlocks.LITHIUM_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_LITHIUM_ORE);
                        output.accept(ModBlocks.LITHIUM_ORE);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
