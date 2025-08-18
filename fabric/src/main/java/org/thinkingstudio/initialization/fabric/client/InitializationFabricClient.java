package org.thinkingstudio.initialization.fabric.client;

import com.iafenvoy.integration.entrypoint.EntryPointManager;
import net.fabricmc.api.ClientModInitializer;
import org.thinkingstudio.initialization.EntrypointContexts;

public final class InitializationFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntryPointManager.getEntryPoints(EntrypointContexts.CLIENT_INITIALIZER_KEY, org.thinkingstudio.initialization.api.ClientModInitializer.class);
    }
}
