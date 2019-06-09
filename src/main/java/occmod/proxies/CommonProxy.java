package occmod.proxies;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import occmod.handlers.RegistryHandler;

public class CommonProxy {
    
    public void registerRenderers() {
    }

    public void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.Common();
    }
    public void init(FMLInitializationEvent event) {
        
    }
    
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
