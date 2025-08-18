package org.thinkingstudio.initialization.test.fabric.client;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.thinkingstudio.initialization.api.ClientModInitializer;
import org.thinkingstudio.initialization.test.fabric.TestModFabric;

public class TestModFabricClient implements ClientModInitializer {
    private static final Marker MARKER = MarkerFactory.getMarker("Client");

    @Override
    public void onInitializeClient() {
        TestModFabric.LOGGER.error(MARKER, "Client ModInitializer is working!");
    }
}