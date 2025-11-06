package org.thinkingstudio.initialization.neoforge;

import com.iafenvoy.integration.entrypoint.EntryPointManager;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import org.thinkingstudio.initialization.Initialization;
import net.neoforged.fml.common.Mod;
import org.thinkingstudio.initialization.api.ClientModInitializer;
import org.thinkingstudio.initialization.api.DedicatedServerModInitializer;
import org.thinkingstudio.initialization.EntrypointContexts;
import org.thinkingstudio.initialization.api.ModInitializer;
import org.thinkingstudio.initialization.utils.ModEnv;
import org.thinkingstudio.initialization.utils.ModEnvExecutor;

@Mod(Initialization.MOD_ID)
public final class InitializationNeoForge {
    public InitializationNeoForge(IEventBus modEventBus) {
        EntryPointManager.getEntryPoints(EntrypointContexts.MAIN_INITIALIZER_KEY, ModInitializer.class).forEach(modInitializer -> {
            modEventBus.addListener(FMLCommonSetupEvent.class, event -> event.enqueueWork(modInitializer::onInitialize));
        });
        ModEnvExecutor.runInEnv(ModEnv.CLIENT, () -> () -> {
            EntryPointManager.getEntryPoints(EntrypointContexts.CLIENT_INITIALIZER_KEY, ClientModInitializer.class).forEach(clientModInitializer -> {
                modEventBus.addListener(FMLClientSetupEvent.class, event -> event.enqueueWork(clientModInitializer::onInitializeClient));
            });
        });
        ModEnvExecutor.runInEnv(ModEnv.SERVER, () -> () -> {
            EntryPointManager.getEntryPoints(EntrypointContexts.SERVER_INITIALIZER_KEY, DedicatedServerModInitializer.class).forEach(dedicatedServerModInitializer -> {
                modEventBus.addListener(FMLDedicatedServerSetupEvent.class, event -> event.enqueueWork(dedicatedServerModInitializer::onInitializeServer));
            });
        });
    }
}
