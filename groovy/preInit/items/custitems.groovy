

import net.minecraft.item.ItemFood
import net.minecraft.potion.PotionEffect
import net.minecraft.potion.Potion
import net.minecraft.item.ItemStack
import net.minecraft.world.World
import net.minecraft.entity.player.EntityPlayer


content.createItem('botathaumamanic_glass_board').register()
content.createItem('quantum_credit').register()
content.createItem('racism').register()
content.createItem('starmetal_cobalt_processing_module_component').register()
content.createItem('schrabidium_neutronium_processing_module_component').register()
content.createItem('hume_field_regulation_component').register()
content.createItem('circuit.exotic_mainframe').register()
content.createItem('circuit.exotic_assemblyanim').register()
content.createItem('circuit.exotic_capsule').register()
content.createItem('data.neutrino').register()
content.createItem('data.elementary').register()
content.createItem('data.subatomic').register()
content.createItem('data.nuclear').register()
content.createItem('circuit.optical_mainframe').register()
content.createItem('circuit.optical_assembly').register()
content.createItem('circuit.optical_processor').register()
content.createItem('circuit.optical_array').register()
content.createItem('circuit_board.optical').register()
content.createBlock('superschrabidiccasing').register()

// blocks
content.createBlock('deco_computer').register()
content.createBlock('machine_casing_ampridge').register()

// juicey beans

content.registerItem('juicey_beans', (new ItemFood(999, 999, false) {
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation('minecraft:regeneration'), 240000, 3, false, false))
            player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation('minecraft:resistance'), 240000, 3, false, false))
        }
    }
}).setAlwaysEdible())
