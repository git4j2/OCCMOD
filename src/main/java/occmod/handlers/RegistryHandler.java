package occmod.handlers;

import occmod.init.BlockInit;
import occmod.init.ItemInit;
import occmod.init.ToolInit;

public class RegistryHandler {
    
    public static void Client() {
    	ItemInit.register();
    	ToolInit.register();
    	BlockInit.registerRenders();
    	
    }
    
    public static void Common() {
    	ItemInit.init();
    	BlockInit.init();
    	ToolInit.init();
    	BlockInit.register();
    	ItemInit.Recipitate();
    	BlockInit.Recipitate();
    	ToolInit.Recipitate();
    	
    }
}
