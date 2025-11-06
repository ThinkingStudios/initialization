package org.thinkingstudio.initialization.utils;

import org.thinkingstudio.initialization.ModPlatform;

import java.util.Optional;
import java.util.function.Supplier;

public final class ModEnvExecutor {
    public static void runInEnv(ModEnv type, Supplier<Runnable> runnableSupplier) {
        if (ModPlatform.INSTANCE.getEnvironment() == type) {
            runnableSupplier.get().run();
        }
    }

    public static <T> Optional<T> getInEnv(ModEnv type, Supplier<Supplier<T>> runnableSupplier) {
        if (ModPlatform.INSTANCE.getEnvironment() == type) {
            return Optional.ofNullable(runnableSupplier.get().get());
        }

        return Optional.empty();
    }

    public static <T> T getEnvSpecific(Supplier<Supplier<T>> client, Supplier<Supplier<T>> server) {
        if (ModPlatform.INSTANCE.getEnvironment() == ModEnv.CLIENT) {
            return client.get().get();
        } else {
            return server.get().get();
        }
    }
}
