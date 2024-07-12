package de.cristelknight.tt.neoforge;

import net.neoforged.fml.common.Mod;

import de.cristelknight.tt.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
