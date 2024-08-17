// MV (all of them)
// Chemical reactor recipe for kerosene
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustSulfur') * 6)
        .fluidInputs(fluid('steam') * 500 )
        .fluidInputs(fluid('diesel') * 120 )
        .fluidOutputs(fluid('kerosene') * 240 )
        .duration(400).EUt(120).buildAndRegister()

// Chemical reactor recipe for HBM red copper ingot
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustRedstone') * 8)
        .inputs(ore('ingotCopper') * 16)
        .fluidInputs(fluid('oxygen') * 120 )
        .fluidInputs(fluid('nitrogen') * 120 )
        .outputs(item('hbm:ingot_red_copper') * 4)
        .duration(400).EUt(120).buildAndRegister()

// Chemical reactor recipe for HBM advanced alloy ingot
recipemap('chemical_reactor').recipeBuilder()
        .inputs(item('hbm:ingot_red_copper') * 8)
        .inputs(ore('ingotSteel') * 16)
        .fluidInputs(fluid('oxygen') * 120 )
        .fluidInputs(fluid('nitrogen') * 120 )
        .outputs(item('hbm:ingot_advanced_alloy') * 4)
        .duration(600).EUt(120).buildAndRegister()

// Assembler recipe for HBM generic small warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 498) * 2)
        .inputs(ore('plateDenseAluminium') * 2)
        .inputs(ore('plateSteel') * 2)
        .fluidInputs(fluid('steel') * 120)
        .outputs(item('hbm:warhead_generic_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM launch pad
recipemap('assembler').recipeBuilder()
        .inputs(ore('wireFineAluminium') * 2)
        .inputs(ore('frameGtBlackSteel') * 12)
        .inputs(ore('plateSteel') * 24)
        .inputs(ore('circuitMv') * 4)
        .inputs(ore('componentDiode') * 4)
        .fluidInputs(fluid('steel') * 500)
        .outputs(item('hbm:launch_pad'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small thruster
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 12)
        .inputs(item('gregtech:meta_item_1', 81))
        .inputs(ore('componentResistor') * 1)
        .inputs(ore('componentDiode') * 4)
        .fluidInputs(fluid('steel') * 200)
        .outputs(item('hbm:thruster_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM generic missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 2)
        .inputs(ore('componentDiode') * 4)
        .inputs(item('hbm:thruster_small') * 2)
        .inputs(item('hbm:warhead_generic_small'))
        .inputs(item('hbm:circuit_targeting_tier1') * 2)
        .inputs(item('hbm:fuel_tank_small'))
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:missile_generic'))
        .duration(1200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small fuel tank
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 12)
        .inputs(item('gregtech:meta_item_1', 81))
        .fluidInputs(fluid('steel') * 200)
        .outputs(item('hbm:fuel_tank_small') * 2)
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small incendiary warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(ore('plateDenseAluminium') * 2)
        .inputs(ore('dustRedPhosphorus') * 2)
        .fluidInputs(fluid('toluene') * 120)
        .outputs(item('hbm:warhead_incendiary_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small cluster warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:pellet_cluster') * 2)
        .fluidInputs(fluid('steel') * 120)
        .outputs(item('hbm:warhead_cluster_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM cluster pellet
recipemap('assembler').recipeBuilder()
        .inputs(item('minecraft:tnt'))
        .inputs(ore('plateSteel') * 2)
        .fluidInputs(fluid('steel') * 120)
        .outputs(item('hbm:pellet_cluster') * 8)
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM small buster warhead
recipemap('assembler').recipeBuilder()
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:det_cord') * 8)
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:warhead_buster_small'))
        .duration(200).EUt(120).buildAndRegister()

// Assembler recipe for HBM buster missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 2)
        .inputs(ore('componentDiode') * 4)
        .inputs(item('hbm:thruster_small') * 2)
        .inputs(item('hbm:warhead_buster_small'))
        .inputs(item('hbm:circuit_targeting_tier1') * 2)
        .inputs(item('hbm:fuel_tank_small'))
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:missile_buster'))
        .duration(1200).EUt(120).buildAndRegister()

// Assembler recipe for HBM cluster missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 2)
        .inputs(ore('componentDiode') * 4)
        .inputs(item('hbm:thruster_small') * 2)
        .inputs(item('hbm:warhead_cluster_small'))
        .inputs(item('hbm:circuit_targeting_tier1') * 2)
        .inputs(item('hbm:fuel_tank_small'))
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:missile_cluster'))
        .duration(1200).EUt(120).buildAndRegister()

// Assembler recipe for HBM incendiary missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 2)
        .inputs(ore('componentDiode') * 4)
        .inputs(item('hbm:thruster_small') * 2)
        .inputs(item('hbm:warhead_incendiary_small'))
        .inputs(item('hbm:circuit_targeting_tier1') * 2)
        .inputs(item('hbm:fuel_tank_small'))
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:missile_incendiary'))
        .duration(1200).EUt(120).buildAndRegister()

// Cutter recipe for HBM red copper wire
recipemap('cutter').recipeBuilder()
        .inputs(item('hbm:ingot_red_copper'))
        .fluidInputs(fluid('lubricant') * 122 )
        .outputs(item('hbm:wire_red_copper') * 8)
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(450).EUt(120).buildAndRegister()

// Assembler recipe for HBM strong missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateBlackSteel') * 2)
        .inputs(ore('plateStainlessSteel') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 8)
        .inputs(item('hbm:thruster_medium') * 2)
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:circuit_targeting_tier2') * 2)
        .fluidInputs(fluid('stainless_steel') * 120)
        .outputs(item('hbm:missile_strong'))
        .duration(1200).EUt(120).buildAndRegister()

// Assembler recipe for HBM strong incendiary missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateBlackSteel') * 2)
        .inputs(ore('plateStainlessSteel') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 8)
        .inputs(item('hbm:thruster_medium') * 2)
        .inputs(item('hbm:warhead_incendiary_medium'))
        .inputs(item('hbm:circuit_targeting_tier2') * 2)
        .fluidInputs(fluid('stainless_steel') * 120)
        .outputs(item('hbm:missile_incendiary_strong'))
        .duration(1200).EUt(120).buildAndRegister()

// Assembler recipe for HBM aluminum circuit
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateAluminium') * 2)
        .inputs(item('hbm:circuit_raw') * 4)
        .inputs(ore('wireFineAluminium') * 4)
        .inputs(item('gregtech:meta_item_1', 521))
        .fluidInputs(fluid('tin') * 120)
        .outputs(item('hbm:circuit_aluminium') * 2)
        .duration(200).EUt(120).buildAndRegister()

// Centrifuge recipe for extracting mercury from redstone ore, 5% chance increases 10 by tier.
// LV.
recipemap('centrifuge').recipeBuilder()
        .inputs(ore('oreRedstone') * 2)
        .chancedOutput(item('hbm:nugget_mercury'), 500, 1000)
        .duration(200).EUt(32).buildAndRegister()
