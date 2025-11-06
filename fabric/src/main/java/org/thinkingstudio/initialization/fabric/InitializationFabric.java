package org.thinkingstudio.initialization.fabric;

import com.iafenvoy.integration.entrypoint.EntryPointManager;
import org.thinkingstudio.initialization.EntrypointContexts;
import org.thinkingstudio.initialization.api.ClientModInitializer;
import org.thinkingstudio.initialization.api.DedicatedServerModInitializer;
import org.thinkingstudio.initialization.api.ModInitializer;
import org.thinkingstudio.initialization.utils.ModEnv;
import org.thinkingstudio.initialization.utils.ModEnvExecutor;

public class InitializationFabric implements net.fabricmc.api.ModInitializer {

    @Override
    public void onInitialize() {
        EntryPointManager.getEntryPoints(EntrypointContexts.MAIN_INITIALIZER_KEY, ModInitializer.class).forEach(ModInitializer::onInitialize);

        ModEnvExecutor.runInEnv(ModEnv.CLIENT, () -> () -> {
            EntryPointManager.getEntryPoints(EntrypointContexts.CLIENT_INITIALIZER_KEY, ClientModInitializer.class).forEach(ClientModInitializer::onInitializeClient);
        });
        ModEnvExecutor.runInEnv(ModEnv.SERVER, () -> () -> {
            EntryPointManager.getEntryPoints(EntrypointContexts.SERVER_INITIALIZER_KEY, DedicatedServerModInitializer.class).forEach(DedicatedServerModInitializer::onInitializeServer);
        });
    }
}
