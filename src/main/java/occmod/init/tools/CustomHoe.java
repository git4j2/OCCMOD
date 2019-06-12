package occmod.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

//MAKING YOUR GARDENING HOE EXTEND MINECRAFT'S GARDENING HOE CLASS

public class CustomHoe extends ItemHoe {

    public CustomHoe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

}
