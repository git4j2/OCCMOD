package occmod.init;

import occmod.Main;
import occmod.Reference;
import occmod.init.items.CustomShovel;
import occmod.init.tools.CustomAxe;
import occmod.init.tools.CustomHoe;
import occmod.init.tools.CustomPickaxe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSpade;

public class ToolInit {
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // GIVING YOUR TOOLS SOME RECIPES
    
    public static void Recipitate() {
    
    
        // PICKAXE RECIPE
    
         GameRegistry.addRecipe(new ItemStack(chicken_pickaxe, 1), new Object[]
                {
                        "SSS",
                        " X ",
                        " X ",
                    'S', ItemInit.chicken_ingot,
                    'X', Items.STICK
                    
                    }); 
                    
                    
         // SWORD RECIPE           
                    
         /** GameRegistry.addRecipe(new ItemStack(occ_sword, 1), new Object[]
                {
                        "   ",
                        "   " ,
                        "   ",
                     'S', ItemInit.occitem_ingot,
                     'X', Items.STICK
                     
                    }); **/
                    
          
         // AXE RECIPE 
                        
          GameRegistry.addRecipe(new ItemStack(chicken_axe, 1), new Object[]
                 {
                        "SS ",
                        "SX ",
                        " X ",
                      'S', ItemInit.chicken_ingot,
                      'X', Items.STICK
                      
                     }); 
                     
        
         // SHOVEL RECIPE 
                                
          GameRegistry.addRecipe(new ItemStack(chicken_shovel, 1), new Object[]
                 {
                         " S ",
                         " X ",
                         " X ",
                      'S', ItemInit.chicken_ingot,
                      'X', Items.STICK
                      
                      });
                      
                      
          // HOE RECIPE
                                        
           GameRegistry.addRecipe(new ItemStack(chicken_hoe, 1), new Object[]
                 {
                         "SS ",
                         " X ",
                         " X ",
                      'S', ItemInit.chicken_ingot,
                      'X', Items.STICK
                      
                      }); 
    }
    
    // -----------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // TELLING MINECRAFT ABOUT YOUR TOOLS (SWORD. PICAXE. AXE, HOE, SHOVEL)
    
public static final ToolMaterial chicken = EnumHelper.addToolMaterial("chicken", 2, 1000, 10.0F, 5.0F, 5);
    
    public static Item chicken_axe;
    public static Item chicken_pickaxe;
    public static Item chicken_shovel;
    public static Item chicken_hoe;

    public static void init() {
    
    	chicken_axe = new CustomAxe("chicken_axe", chicken);
    	chicken_pickaxe = new CustomPickaxe("chicken_pickaxe", chicken);
    	chicken_shovel = new CustomShovel("chicken_shovel", chicken);
    	chicken_hoe = new CustomHoe("chicken_hoe", chicken);
        
    }
    
    // ---------------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // PUTTING YOUR TOOLSET INSIDE OF MINECRAFT
    
    public static void register() {
          registerItem(chicken_axe);
          registerItem(chicken_pickaxe);
          registerItem(chicken_shovel);
          registerItem(chicken_hoe);
    }
    
    public static void registerItem(Item item) {
        GameRegistry.register(item);
        item.setCreativeTab(CreativeTabs.TOOLS);
        
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
        new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    
    // ----------------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    
}