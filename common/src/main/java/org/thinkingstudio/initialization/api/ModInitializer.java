package org.thinkingstudio.initialization.api;

import com.iafenvoy.integration.entrypoint.IntegrationEntryPoint;

/**
 * A mod initializer.
 *
 * @see ClientModInitializer
 * @see DedicatedServerModInitializer
 */
@FunctionalInterface
public interface ModInitializer extends IntegrationEntryPoint {
    /**
     * Runs the mod initializer.
     */
    void onInitialize();
}
