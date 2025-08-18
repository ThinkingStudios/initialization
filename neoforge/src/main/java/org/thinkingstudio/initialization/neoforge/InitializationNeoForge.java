package org.thinkingstudio.initialization.neoforge;

import com.iafenvoy.integration.entrypoint.EntryPointManager;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.neoforge.common.NeoForge;
import org.thinkingstudio.initialization.Initialization;
import net.neoforged.fml.common.Mod;
import org.thinkingstudio.initialization.api.ClientModInitializer;
import org.thinkingstudio.initialization.api.DedicatedServerModInitializer;
import org.thinkingstudio.initialization.EntrypointContexts;
import org.thinkingstudio.initialization.api.ModInitializer;

@Mod(Initialization.MOD_ID)
public final class InitializationNeoForge {
    public InitializationNeoForge() {
        NeoForge.EVENT_BUS.addListener(FMLCommonSetupEvent.class, event -> {
            event.enqueueWork(() -> {
                EntryPointManager.getEntryPoints(EntrypointContexts.MAIN_INITIALIZER_KEY, ModInitializer.class);
            });
        });

        if (FMLLoader.getDist().isClient()) {
            NeoForge.EVENT_BUS.addListener(FMLClientSetupEvent.class, event -> {
                event.enqueueWork(() -> {
                    EntryPointManager.getEntryPoints(EntrypointContexts.CLIENT_INITIALIZER_KEY, ClientModInitializer.class);
                });
            });
        } else if (FMLLoader.getDist().isDedicatedServer()) {
            NeoForge.EVENT_BUS.addListener(FMLDedicatedServerSetupEvent.class, event -> {
                event.enqueueWork(() -> {
                    EntryPointManager.getEntryPoints(EntrypointContexts.SERVER_INITIALIZER_KEY, DedicatedServerModInitializer.class);
                });
            });
        }
    }
}
