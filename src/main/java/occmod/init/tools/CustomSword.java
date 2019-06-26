package occmod.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

//MAKING YOUR SWORD EXTEND MINECRAFT'S SWORD CLASS

public class CustomSword extends ItemSword {

        public CustomSword(String name, ToolMaterial material) {
            super(material);
            setUnlocalizedName(name);
            setRegistryName(name);
        }

    
}
