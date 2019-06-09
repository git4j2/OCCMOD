package occmod.handlers;

import occmod.init.ItemInit;

public class RegistryHandler {
    
    public static void Client() {
    	ItemInit.register();
    }
    
    public static void Common() {
    	ItemInit.init();
    	ItemInit.Recipitate();
    }
}
