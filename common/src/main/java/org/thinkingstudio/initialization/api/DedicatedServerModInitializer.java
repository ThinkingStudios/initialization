package org.thinkingstudio.initialization.api;

import com.iafenvoy.integration.entrypoint.IntegrationEntryPoint;

/**
 * A mod initializer ran only on Dedicated Server.
 *
 * @see ModInitializer
 * @see ClientModInitializer
 */
@FunctionalInterface
public interface DedicatedServerModInitializer extends IntegrationEntryPoint {
    /**
     * Runs the mod initializer on the server environment.
     */
    void onInitializeServer();
}
