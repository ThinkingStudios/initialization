package org.thinkingstudio.initialization.fabric;

import com.google.auto.service.AutoService;
import net.fabricmc.loader.api.FabricLoader;
import org.thinkingstudio.initialization.ModPlatform;
import org.thinkingstudio.initialization.utils.ModEnv;

@AutoService(ModPlatform.class)
public class ModPlatformImpl implements ModPlatform {
    @Override
    public ModEnv getEnvironment() {
        return ModEnv.fromPlatform(FabricLoader.getInstance().getEnvironmentType());
    }
}
