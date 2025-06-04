package com.creepy.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = CreepyMod.MODID, name = CreepyMod.NAME, version = CreepyMod.VERSION)
public class CreepyMod {
    public static final String MODID = "creepy";
    public static final String NAME = "Creepy Pasts Mod";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Entity registration will go here
    }
}
