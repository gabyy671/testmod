package net.gaby.gabytestmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.HeightmapPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> BITTERGEM_ORE_PLACED = PlacementUtils.register(
            "bittergem_ore_placed", ModConfiguredFeatures.BITTERGEM_ORE,
            ModeOrePlacement.commonOrePlacement(16,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80),
                            VerticalAnchor.aboveBottom(80))));

}
