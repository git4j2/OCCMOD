package occmod.init;

import occmod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import occmod.init.items.CustomIngot;

public class ItemInit {
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
        
    //TELLING MINECRAFT ABOUT YOUR ITEM
    
    public static Item chicken_ingot;

    public static void init() {
    	chicken_ingot = new CustomIngot("chicken_ingot");
    }
    
    //----------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    

    //PUT YOUR ITEM IN MINECRAFT WITH ICONS AND REGISTER
    
    public static void register() {
        registerItem(chicken_ingot);
    }
    
    public static void registerItem(Item item) {
        GameRegistry.register(item);
        
        //------------------------
        
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
        new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    //MAKING A CRAFTING RECIPE

        public static void Recipitate() {
            GameRegistry.addRecipe(new ItemStack(chicken_ingot, 1), new Object[]
                    {
                            "SSS",
                            "S S",
                            "SSS",
                        'S', Items.FEATHER,
                    });
            

        }
        
        //----------------------
        
/** ------------------------------------------------------------------------------------------------------------------------------- **/

}
