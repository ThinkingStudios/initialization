package org.thinkingstudio.initialization.fabric;

import com.iafenvoy.integration.entrypoint.EntryPointManager;
import net.fabricmc.api.ModInitializer;
import org.thinkingstudio.initialization.EntrypointContexts;

public final class InitializationFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        EntryPointManager.getEntryPoints(EntrypointContexts.MAIN_INITIALIZER_KEY, org.thinkingstudio.initialization.api.ModInitializer.class);
    }
}
