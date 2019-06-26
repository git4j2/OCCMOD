package occmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import occmod.init.BlockInit;
import occmod.init.ItemInit;
import occmod.init.ToolInit;

//MAKING YOUR CREATIVETAB WORK LIKE A CREATIVETAB

public class ChickenTab extends CreativeTabs {

    public ChickenTab(String label) { super("chickentab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ToolInit.chicken_sword);
    }
    
}