package org.thinkingstudio.initialization.test.fabric.server;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.thinkingstudio.initialization.api.DedicatedServerModInitializer;
import org.thinkingstudio.initialization.test.fabric.TestModFabric;

public class TestModFabricServer implements DedicatedServerModInitializer {
    private static final Marker MARKER = MarkerFactory.getMarker("DedicatedServer");

    @Override
    public void onInitializeServer() {
        TestModFabric.LOGGER.error(MARKER, "DedicatedServer ModInitializer is working!");
    }
}