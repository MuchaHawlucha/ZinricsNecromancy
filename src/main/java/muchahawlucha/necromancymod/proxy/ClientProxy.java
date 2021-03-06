package muchahawlucha.necromancymod.proxy;

import muchahawlucha.necromancymod.client.NecromancyTab;
import muchahawlucha.necromancymod.common.CommonProxy;
import muchahawlucha.necromancymod.common.block.ModBlocks;
import muchahawlucha.necromancymod.common.item.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    // custom tab
    public static final NecromancyTab creativeTab = new NecromancyTab();


    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent e) {
        ModBlocks.initModels();
        ModItems.initModels();
    }
}
