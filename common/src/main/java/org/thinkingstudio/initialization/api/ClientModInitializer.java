package org.thinkingstudio.initialization.api;

import com.iafenvoy.integration.entrypoint.IntegrationEntryPoint;

/**
 * A mod initializer ran only on Client.
 *
 * <p>This entrypoint is suitable for setting up client-specific logic, such as rendering
 * or integrated server tweaks.</p>
 *
 * @see ModInitializer
 * @see DedicatedServerModInitializer
 */
@FunctionalInterface
public interface ClientModInitializer extends IntegrationEntryPoint {
    /**
     * Runs the mod initializer on the client environment.
     */
    void onInitializeClient();
}
