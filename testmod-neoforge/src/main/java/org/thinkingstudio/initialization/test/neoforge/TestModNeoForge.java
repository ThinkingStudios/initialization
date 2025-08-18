package org.thinkingstudio.initialization.test.neoforge;

import com.iafenvoy.integration.entrypoint.EntryPointProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.thinkingstudio.initialization.EntrypointContexts;
import org.thinkingstudio.initialization.api.ModInitializer;

@EntryPointProvider(slug = EntrypointContexts.MAIN_INITIALIZER_KEY)
public class TestModNeoForge implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("TestModNeoForge");
    private static final Marker MARKER = MarkerFactory.getMarker("Main");

    @Override
    public void onInitialize() {
        LOGGER.error(MARKER, "ModInitializer is working!");
    }
}