package occmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import occmod.Main;
import occmod.Reference;
import occmod.init.armour.CustomArmour;
import occmod.init.items.CustomIngot;

public class ArmourInit {
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // GIVING YOUR ARMOR A CRAFTING RECIPE
    
    
    //HELMET RECIPE
    
    public static void Recipitate() {
        GameRegistry.addRecipe(new ItemStack(chicken_helmet, 1), new Object[]
                {
                        "SSS",
                        "S S",
                        "   ",
                    'S', ItemInit.chicken_ingot,
                });
                
        
        //BOOTS RECIPE
                
        GameRegistry.addRecipe(new ItemStack(chicken_boots, 1), new Object[]
                {
                        "   ",
                        "S S",
                        "S S",
                    'S', ItemInit.chicken_ingot,
                });
                
        
        //LEGGINGS RECIPE
                
        GameRegistry.addRecipe(new ItemStack(chicken_leggings, 1), new Object[]
                {
                        "SSS",
                        "S S",
                        "S S",
                    'S', ItemInit.chicken_ingot,
                });
                
               
        //CHESTPLATE RECIPE        
                
        GameRegistry.addRecipe(new ItemStack(chicken_chestplate, 1), new Object[]
                {
                        "S S",
                        "SSS",
                        "SSS",
                    'S', ItemInit.chicken_ingot,
                });
    }
    
    // -------------------------------
    
    
    // TELLING MINECRAFT ABOUT YOUR ARMOUR
    
    public static final ArmorMaterial chicken_armour = EnumHelper.addArmorMaterial("chicken_armor", Reference.MOD_ID + ":chicken", 
                                                                                                                        35,                
                                                                                                                        new int[]{25, 25, 25, 25},
                                                                                                                        10,
                                                                                                                        SoundEvents.ENTITY_CHICKEN_HURT,
                                                                                                                        2.5F);
    
    public static Item chicken_helmet;
    public static Item chicken_chestplate;
    public static Item chicken_leggings;
    public static Item chicken_boots;

    public static void init() {
        chicken_helmet = new CustomArmour("chicken_helmet", chicken_armour, 1, EntityEquipmentSlot.HEAD);
        chicken_chestplate = new CustomArmour("chicken_chestplate", chicken_armour, 1, EntityEquipmentSlot.CHEST);
        chicken_leggings = new CustomArmour("chicken_leggings", chicken_armour, 2, EntityEquipmentSlot.LEGS);
        chicken_boots = new CustomArmour("chicken_boots", chicken_armour, 1, EntityEquipmentSlot.FEET);
        
    }
    
    // ---------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    
    // PUTTING YOUR ARMOR IN MINECRAFT
    
    public static void register() {
        registerItem(chicken_helmet);
        registerItem(chicken_chestplate);
        registerItem(chicken_leggings);
        registerItem(chicken_boots);
    }
    
    public static void registerItem(Item item) {
        GameRegistry.register(item);
        item.setCreativeTab(Main.chickentab);
        
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
        new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    
    // -------------------------------
    
/** ------------------------------------------------------------------------------------------------------------------------------- **/
    

}
    