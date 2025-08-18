package org.thinkingstudio.initialization.neoforge;

import com.iafenvoy.integration.entrypoint.EntryPointManager;
import net.neoforged.fml.loading.FMLLoader;
import org.thinkingstudio.initialization.Initialization;
import net.neoforged.fml.common.Mod;
import org.thinkingstudio.initialization.api.ClientModInitializer;
import org.thinkingstudio.initialization.api.DedicatedServerModInitializer;
import org.thinkingstudio.initialization.EntrypointContexts;
import org.thinkingstudio.initialization.api.ModInitializer;

@Mod(Initialization.MOD_ID)
public final class InitializationNeoForge {
    public InitializationNeoForge() {
        EntryPointManager.getEntryPoints(EntrypointContexts.MAIN_INITIALIZER_KEY, ModInitializer.class).forEach(ModInitializer::onInitialize);
        if (FMLLoader.getDist().isClient()) {
            EntryPointManager.getEntryPoints(EntrypointContexts.CLIENT_INITIALIZER_KEY, ClientModInitializer.class).forEach(ClientModInitializer::onInitializeClient);
        } else if (FMLLoader.getDist().isDedicatedServer()) {
            EntryPointManager.getEntryPoints(EntrypointContexts.SERVER_INITIALIZER_KEY, DedicatedServerModInitializer.class).forEach(DedicatedServerModInitializer::onInitializeServer);
        }
    }
}
