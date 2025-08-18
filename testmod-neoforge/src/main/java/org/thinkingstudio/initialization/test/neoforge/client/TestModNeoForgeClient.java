package org.thinkingstudio.initialization.test.neoforge.client;

import com.iafenvoy.integration.entrypoint.EntryPointProvider;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.thinkingstudio.initialization.EntrypointContexts;
import org.thinkingstudio.initialization.api.ClientModInitializer;
import org.thinkingstudio.initialization.test.neoforge.TestModNeoForge;

@EntryPointProvider(slug = EntrypointContexts.CLIENT_INITIALIZER_KEY)
public class TestModNeoForgeClient implements ClientModInitializer {
    private static final Marker MARKER = MarkerFactory.getMarker("Client");

    @Override
    public void onInitializeClient() {
        TestModNeoForge.LOGGER.error(MARKER, "Client ModInitializer is working!");
    }
}
