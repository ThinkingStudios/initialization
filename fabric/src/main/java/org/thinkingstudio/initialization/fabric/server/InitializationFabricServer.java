package org.thinkingstudio.initialization.fabric.server;

import com.iafenvoy.integration.entrypoint.EntryPointManager;
import net.fabricmc.api.DedicatedServerModInitializer;
import org.thinkingstudio.initialization.EntrypointContexts;

public class InitializationFabricServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        EntryPointManager.getEntryPoints(EntrypointContexts.SERVER_INITIALIZER_KEY, org.thinkingstudio.initialization.api.DedicatedServerModInitializer.class);
    }
}
