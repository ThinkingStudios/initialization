package org.thinkingstudio.initialization.test.fabric;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.thinkingstudio.initialization.api.ModInitializer;

public class TestModFabric implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("TestModFabric");
    private static final Marker MARKER = MarkerFactory.getMarker("Main");

    @Override
    public void onInitialize() {
        LOGGER.error(MARKER, "ModInitializer is working!");
    }
}