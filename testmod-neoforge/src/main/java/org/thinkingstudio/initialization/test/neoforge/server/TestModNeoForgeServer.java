package org.thinkingstudio.initialization.test.neoforge.server;

import com.iafenvoy.integration.entrypoint.EntryPointProvider;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.thinkingstudio.initialization.EntrypointContexts;
import org.thinkingstudio.initialization.api.DedicatedServerModInitializer;
import org.thinkingstudio.initialization.test.neoforge.TestModNeoForge;

@EntryPointProvider(slug = EntrypointContexts.SERVER_INITIALIZER_KEY)
public class TestModNeoForgeServer implements DedicatedServerModInitializer {
    private static final Marker MARKER = MarkerFactory.getMarker("DedicatedServer");

    @Override
    public void onInitializeServer() {
        TestModNeoForge.LOGGER.error(MARKER, "DedicatedServer ModInitializer is working!");
    }
}
