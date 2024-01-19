package net.gaby.gabytestmod.world;

import net.gaby.gabytestmod.world.gen.ModOreGeneration;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.gaby.gabytestmod.TestMod;
import net.minecraftforge.event.world.BiomeLoadingEvent;
@Mod.EventBusSubscriber(modid = TestMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModOreGeneration.generateOres(event);
    }

}
