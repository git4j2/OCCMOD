package occmod.proxies;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import occmod.handlers.RegistryHandler;

public class ClientProxy extends CommonProxy {

    @Override
	public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }
    @Override
	public void init(FMLInitializationEvent event) {
        super.init(event);
        RegistryHandler.Client();
    }
    
    @Override
	public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
