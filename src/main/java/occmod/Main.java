package occmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import occmod.proxies.CommonProxy;
import occmod.tabs.ChickenTab;

/*  MOD INFO */
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)  
//***

public class Main {
    
    // CREATIVE TAB INSTANTIATION
	
    public static Main instance;
    public static final CreativeTabs chickentab = new ChickenTab("chickentab");
    public static CreativeTabs chickentab_1;

    
    
//PROXY INFO
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;
//***
    

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
    proxy.preInit(event);
    
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        
    }
}
