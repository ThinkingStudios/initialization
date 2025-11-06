package org.thinkingstudio.initialization.utils;

import net.fabricmc.api.EnvType;

public enum ModEnv {
    CLIENT,
    SERVER;

    public static ModEnv fromPlatform(Object type) {
        return type == EnvType.CLIENT ? CLIENT : type == EnvType.SERVER ? SERVER : null;
    }

    public EnvType toPlatform() {
        return this == CLIENT ? EnvType.CLIENT : EnvType.SERVER;
    }
}
