package org.thinkingstudio.initialization.neoforge;

import net.neoforged.fml.loading.FMLLoader;
import org.thinkingstudio.initialization.ModPlatform;
import org.thinkingstudio.initialization.utils.ModEnv;

public class ModPlatformImpl implements ModPlatform {
    @Override
    public ModEnv getEnvironment() {
        return ModEnv.fromPlatform(FMLLoader.getDist());
    }
}
