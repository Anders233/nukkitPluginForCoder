package net.noyark.www.nukkit.decoder;

import cn.nukkit.plugin.PluginBase;

public class RunMain extends PluginBase {

    private static RunMain main;

    @Override
    public void onLoad() {

        super.onLoad();
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static RunMain getMain() {
        return main;
    }
}
