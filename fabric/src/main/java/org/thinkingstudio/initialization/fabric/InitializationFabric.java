package org.thinkingstudio.initialization.fabric;

import com.iafenvoy.integration.entrypoint.EntryPointManager;
import org.thinkingstudio.initialization.EntrypointContexts;
import org.thinkingstudio.initialization.api.ClientModInitializer;
import org.thinkingstudio.initialization.api.DedicatedServerModInitializer;
import org.thinkingstudio.initialization.api.ModInitializer;

public class InitializationFabric {
    public void onInitialize() {
        EntryPointManager.getEntryPoints(EntrypointContexts.MAIN_INITIALIZER_KEY, ModInitializer.class).forEach(ModInitializer::onInitialize);
    }

    public void onInitializeClient() {
        EntryPointManager.getEntryPoints(EntrypointContexts.CLIENT_INITIALIZER_KEY, ClientModInitializer.class).forEach(ClientModInitializer::onInitializeClient);
    }

    public void onInitializeServer() {
        EntryPointManager.getEntryPoints(EntrypointContexts.SERVER_INITIALIZER_KEY, DedicatedServerModInitializer.class).forEach(DedicatedServerModInitializer::onInitializeServer);
    }
}
