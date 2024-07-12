package de.cristelknight.tt.neoforge;

import de.cristelknight.tt.TT;
import net.neoforged.fml.common.Mod;

@Mod(TT.MODID)
public final class TTNeoForge {
    public TTNeoForge() {
        // Run our common setup.
        TT.init();
    }
}
