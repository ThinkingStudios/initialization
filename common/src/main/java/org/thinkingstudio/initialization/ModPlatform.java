package org.thinkingstudio.initialization;

import org.thinkingstudio.initialization.utils.ModEnv;
import org.thinkingstudio.initialization.utils.ServiceHelper;

public interface ModPlatform {
    ModPlatform INSTANCE = ServiceHelper.loadService(ModPlatform.class);

    ModEnv getEnvironment();
}
