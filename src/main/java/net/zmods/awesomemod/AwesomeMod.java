package net.zmods.awesomemod;

import net.minecraft.world.item.CreativeModeTabs;
import net.zmods.awesomemod.block.ModBlocks;
import net.zmods.awesomemod.item.ModCreativeModeTabs;
import net.zmods.awesomemod.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(AwesomeMod.MOD_ID)
public class AwesomeMod {
    public static final String MOD_ID = "nikozawesomemod";
    public static final Logger LOGGER = LogUtils.getLogger();

    // Main class of the mod, this is run when the mod loads use it to register all the content
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public AwesomeMod(IEventBus modEventBus, ModContainer modContainer) {
        // Register common setup
        modEventBus.addListener(this::commonSetup);

        ModCreativeModeTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Create and load config file automatically
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
