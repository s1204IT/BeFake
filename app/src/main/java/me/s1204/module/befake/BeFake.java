package me.s1204.module.befake;

import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;

public class BeFake extends XposedModule {
    private static final String BEREAL = "com.bereal.ft";

    private static XposedModule module;

    public BeFake(XposedInterface base, ModuleLoadedParam param) {
        super(base, param);
        module = this;
    }

    @Override
    public void onPackageLoaded(PackageLoadedParam param) {
        if (!param.isFirstPackage()) return;
    }
}
