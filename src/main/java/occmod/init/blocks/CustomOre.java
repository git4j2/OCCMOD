package occmod.init.blocks;

import net.minecraft.block.Block;

//MAKING YOUR BLOCK ACT LIKE A BLOCK

public class CustomOre extends CustomBlock {

    public CustomOre(String name, float hardness, float resistance, int harvestLevel) {
        super(name, hardness, resistance);
        setHarvestLevel("pickaxe", harvestLevel);
    }

}
