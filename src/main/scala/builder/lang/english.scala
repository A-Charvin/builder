package builder.lang

object english extends Translation {
  override val mapping: Map[String, String] = Map(
    "ui.mastery" → "Mastery",
    "ui.battle" → "Battle",
    "ui.secondary" → "Secondary",
    "ui.characteristics" → "Characteristics",
    "ui.appearance" → "Appearance",
    "ui.gear" → "Gear",
    "ui.skills" → "Skills",
    "ui.spells" → "Spells",
    "ui.item_name" → "Name",
    "ui.item_type" → "Type",
    "ui.item_effects" → "Effects",
    "ui.item_rarity" → "Rarity",
    "ui.item_level" → "Level",
    "ui.search" → "Search",
    "ui.loading" → "Loading",
    "ui.equip" → "Equip",
    "ui.equip_left" → "Equip left",
    "ui.equip_right" → "Equip right",
    "ui.update" → "Update",
    "ui.unequip" → "Unequip",
    "ui.pick_elements" → "Pick elements!",
    "ui.second_relic" → "Can't wear another relic!",
    "ui.second_epic" → "Can't wear another epic!",
    "ui.level_short" -> "Lvl.",
    "ui.any" -> "Any",
    "ui.points_to_distribute" -> "Points to distribute",
    "ui.add" -> "Add",
    "ui.custom_effects" -> "Custom charac.",
    "ui.nation" -> "Nation",
    "ui.hairstyle" -> "Hairstyle",
    "ui.body" -> "Body type",
    "ui.pick_hair_color" -> "Hair",
    "ui.pick_skin_color" -> "Skin",
    "ui.pick_pupil_color" -> "Pupils",
    "ui.search_no_results" → "No results!",
    "ui.undefined_item" -> "Undefined item",
    "ui.undefined_rarity" -> "Undefined rarity",
    "ui.shift_tip" -> "Hold shift to increase by 10",
    "ui.elemental_bonuses_tip" -> "The table includes quest elemental mastery bonus based on level",
    "ui.remove" -> "Remove",
    "ui.generate_link" -> "Generate a link",
    "ui.get_build_from_url" -> "Load build from a link",
    "ui.align_masteries" -> "Align elem. masteries",
    "ui.align_resists" -> "Align elem. resists",
    "ui.intelligence" -> "Intelligence",
    "ui.strength" -> "Strength",
    "ui.agility" -> "Agility",
    "ui.chance" -> "Chance",
    "ui.major" -> "Major",
    "ui.allow_multiple" -> "Allow multiple relics/epics (for mimisymbics)",
    "ui.pick_guild_color1" -> "Guild 1",
    "ui.pick_guild_color2" -> "Guild 2",
    "ui.apply_nation_bonus" -> "Full nation bonus",
    "ui.apply_guild_bonus" -> "Full guild and HW bonus",
    "ui.no_filter" -> "No filter",
    "charac.no_filter" -> "No filter",
    "ui.selected" -> "Selected",
    "ui.options_selected" -> "options selected",
    "ui.clear" -> "Clear",
    "ui.normal" -> "Normal",
    "ui.critical" -> "Critical",
    "ui.conditions" -> "Conditions",
    "ui.base" -> "Base",
    "ui.preview" -> "Preview",
    "ui.preview_settings" -> "Preview settings",
    "ui.distance" -> "Distance",
    "ui.melee" -> "Melee",
    "ui.backstab" -> "Backstab",
    "ui.berserk" -> "Berserk",
    "ui.resist" -> "Resist.",
    "ui.active_skills" -> "Active skills",
    "ui.passive_skills" -> "Passive skills",
    "ui.code_deck" -> "Code deck",
    "ui.actives" -> "Actives",
    "ui.passives" -> "Passives",
    "ui.elemental_spells" -> "Elemental spells",
    "ui.support_spells" -> "Support spells",
    "ui.copied_deck_code" -> "Copied deck code!",
    "ui.invalid_deck_code" -> "Invalid deck code!",
    "ui.applied_deck_code" -> "Applied deck code!",
    "ui.on_equip" -> "On equip",
    "ui.on_use" -> "On use",
    "ui.use_per_turn" -> "use(s) per turn",
    "ui.use_per_target" -> "use(s) per target",
    "ui.nation_bonus.1" -> "40 Elemental Mastery",
    "ui.nation_bonus.2" -> "100 HP",
    "ui.guild_bonus.1" -> "+65 HP",
    "ui.guild_bonus.2" -> "+20 Lock",
    "ui.guild_bonus.3" -> "+20 Dodge",
    "ui.guild_bonus.4" -> "+10 Initiative",
    "ui.guild_bonus.5" -> "+20 Elemental Resist.",
    "ui.guild_bonus.6" -> "+8% Damage inflicted",
    "ui.guild_bonus.7" -> "+8% Heals performed",
    "ui.guild_bonus.8" -> "+20 Wisdom",
    "ui.guild_bonus.9" -> "+20 Prospecting",
    "ui.guild_bonus.10" -> "+3 Kit Skill",
    "ui.effect_warning" -> "The effects of this skill have not yet been fully implemented",
    "ui.include_beta" -> "Include beta items",
    "ui.only_best_craft" -> "Include final upgrades only",
    "ui.back" -> "Back",
    "ui.insert" -> "Insert",
    "ui.pick_a_slot" -> "Pick a slot",
    "ui.use" -> "Use",
    "ui.deck" -> "Deck",
    "ui.none" -> "None",
    "ui.points" -> "points",
    "ui.class" -> "Class",
    "ui.element_priority" -> "Element priority",
    "ui.sex" -> "Sex",
    "ui.share" -> "Share",
    "sex.male" → "Male",
    "sex.female" → "Female",
    "element.fire" → "Fire",
    "element.water" → "Water",
    "element.earth" → "Earth",
    "element.air" → "Air",
    "nation.amakna" → "Amakna",
    "nation.bonta" → "Bonta",
    "nation.brakmar" → "Brakmar",
    "nation.sufokia" → "Sufokia",
    "nation.riktus" → "Riktus",
    "class.feca" → "Feca",
    "class.osa" → "Osamodas",
    "class.enu" → "Enutrof",
    "class.sram" → "Sram",
    "class.xelor" → "Xelor",
    "class.eca" → "Ecaflip",
    "class.eni" → "Eniripsa",
    "class.iop" → "Iop",
    "class.cra" → "Cra",
    "class.sadi" → "Sadida",
    "class.sac" → "Sacrier",
    "class.panda" → "Pandawa",
    "class.rogue" → "Rogue",
    "class.masq" → "Masqueraider",
    "class.fog" → "Foggernaut",
    "class.elio" → "Eliotrope",
    "class.hupper" → "Huppermage",
    "class.ouginak" → "Ouginak",
    "charac_desc.hp" -> "Health Points (HP) represent the state of a character's health. If they fall to 0 during a fight, the person is KO'd and can't fight anymore.",
    "charac_desc.armor" -> "Armor absorbs limited amount of damage inflicted on the player. Each hit taken by the player consumes an adequate portion of the armor.",
    "charac_desc.ap" -> "Action Points (AP) are needed to cast spells and use items or weapons during fights.",
    "charac_desc.mp" -> "Movement Points (MP) allow you to move around during combat.",
    "charac_desc.wp" -> "Wakfu Points (WP) are needed for special spells.",
    "charac_desc.damage_dealt" → "Increases the percentage of Damage that you inflict.",
    "charac_desc.heals_performed" → "Increases all Heals that you perform by a percentage.",
    "charac_desc.range" → "The Range (RA) Bonus increases the range of your distance spells by one cell.",
    "charac_desc.control" → "Control defines the number of summoned creatures and mechanisms you can have in play at one time.",
    "charac_desc.block" → "Each Block point makes you 1% more likely to reduce Damage received by 20%.",
    "charac_desc.crit_chance" → "Each Critical Hit point increases your chances of performing a Critical Hit by 1%. Critical Hits increase damage by 25%.",
    "charac_desc.crit_mastery" → "Critical Mastery is added to Elemental Mastery to increase damage from critical hits.",
    "charac_desc.rear_mastery" → "Rear Mastery is added to Elemental Mastery to increase damage when attacking enemies from behind.",
    "charac_desc.heal_mastery" → "Healing Mastery is added to Elemental Mastery to increase effectiveness of healing spells.",
    "charac_desc.area_mastery" → "Area Mastery is added to Elemental Mastery to increase damage to multiple targets from spells and weapons.",
    "charac_desc.st_mastery" → "Single Target Mastery is added to Elemental Mastery to increase damage to a single target from spells and weapons.",
    "charac_desc.melee_mastery" → "Melee Mastery is added to Elemental Mastery to increase damage to targets within 2 cells from the attacker.",
    "charac_desc.distance_mastery" → "Distance Mastery is added to Elemental Mastery to increase damage to targets more than 3 cells from the attacker.",
    "charac_desc.berserk_mastery" → "Berserk Mastery is added to Elemental Mastery to increase damage when you have less than 50% of your max. HP.",
    "charac_desc.dodge" → "Dodge increases your ability to distance yourself from an adjacent enemy. This characteristic is counterbalanced by your adversary's Lock.",
    "charac_desc.lock" → "Lock increases your ability to keep an adversary in close combat. This characteristic is counterbalanced by your adversary's Dodge.",
    "charac_desc.initiative" → "Improve your Initiative score and that of your team.\nThe first fighter to play is the one from the team with the highest Initiative. Fighers then join in, from one team then the other, in order of Initiative (from highest to lowest).\nSummons activate right after their summoner.",
    "charac_desc.kit_skill" → "Kit Skill reduces the level necessary to equip items.\nKit Skill is limited to 10 points maximum.",
    "charac_desc.prospecting" → "Each Prospecting point increases your chances of finding items after combat by 1%. (Max 150% bonus)",
    "charac_desc.wisdom" → "Each Wisdom point increases the amount of experience gained at the end of a fight by 1%. (Max 150% bonus)",
    "charac_desc.crit_resist" → "Critical Resistance reduces critical attack damage suffered.",
    "charac_desc.rear_resist" → "Rear Resistance reduces damage during attacks from the rear.",
    "charac.hp" → "HP",
    "charac.armor" -> "Armor",
    "charac.%_hp" -> "% HP",
    "charac.ap" → "AP",
    "charac.minus_ap" → "Minus AP",
    "charac.mp" → "MP",
    "charac.minus_mp" → "Minus MP",
    "charac.wp" → "WP",
    "charac.minus_wp" → "Minus WP",
    "charac.damage_dealt" → "Damage inf.",
    "charac.heals_performed" → "Heals perf.",
    "charac.range" → "Range",
    "charac.minus_range" → "Minus Range",
    "charac.control" → "Control",
    "charac.minus_control" → "Minus Control",
    "charac.block" → "Block",
    "charac.minus_block" → "Minus Block",
    "charac.crit_chance" → "Critical Hits",
    "charac.minus_crit_chance" → "Minus Critical Hits",
    "charac.crit_mastery" → "Critical Mastery",
    "charac.rear_mastery" → "Rear Mastery",
    "charac.heal_mastery" → "Healing Mastery",
    "charac.area_mastery" → "Area Mastery",
    "charac.st_mastery" → "ST Mastery",
    "charac.melee_mastery" → "Melee Mastery",
    "charac.distance_mastery" → "Distance Mastery",
    "charac.berserk_mastery" → "Berserk Mastery",
    "charac.damage_for_3" → "Damage for 3 random elements",
    "charac.damage_for_2" → "Damage for 2 random elements",
    "charac.damage_for_1" → "Damage for 1 random element",
    "charac.dodge" → "Dodge",
    "charac.lock" → "Lock",
    "charac.initiative" → "Initiative",
    "charac.kit_skill" → "Kit Skill",
    "charac.prospecting" → "Prospecting",
    "charac.wisdom" → "Wisdom",
    "charac.resist_for_3" → "Resist. for 3 random elements",
    "charac.resist_for_2" → "Resist. for 2 random elements",
    "charac.resist_for_1" → "Resist. for 1 random element",
    "charac.crit_resist" → "Critical Resist.",
    "charac.rear_resist" → "Rear Resist.",
    "charac.elemental_mastery" → "Elemental Mastery",
    "charac.elemental_resist" → "Elemental Resist.",
    "charac.earth_mastery" → "Earth Mastery",
    "charac.earth_resist" → "Earth Resist.",
    "charac.fire_mastery" → "Fire Mastery",
    "charac.fire_resist" → "Fire Resist.",
    "charac.water_mastery" → "Water Mastery",
    "charac.water_resist" → "Water Resist.",
    "charac.air_mastery" → "Air Mastery",
    "charac.air_resist" → "Air Resist.",
    "rarity.common" → "Common",
    "rarity.rare" → "Rare",
    "rarity.mythical" → "Mythical",
    "rarity.legendary" → "Legendary",
    "rarity.relic" → "Relic",
    "rarity.pvp" → "PvP",
    "rarity.epic" → "Epic",
    "rarity.admin" → "Admin",
    "item.ring" → "Ring",
    "item.dagger" → "Dagger",
    "item.boots" → "Boots",
    "item.amulet" → "Amulet",
    "item.cape" → "Cape",
    "item.belt" → "Belt",
    "item.helmet" → "Helmet",
    "item.breastplate" → "Breastplate",
    "item.epaulettes" → "Epaulettes",
    "item.shield" → "Shield",
    "item.pet" → "Pet",
    "item.mount" → "Mount",
    "item.emblem" → "Emblem",
    "item.costume" → "Costume",
    "item.any" -> "Any equipment",
    "item.one_hand_weapon" -> "One-hand weapon",
    "item.two_hand_weapon" -> "Two-hand weapon",
    "rune.damage" -> "Damage Gem",
    "rune.resistance" -> "Resistance Gem",
    "rune.vitality" -> "Vitality Gem",
    "rune.initiative" -> "Initiative Gem",
    "rune.lock" -> "Lock Gem",
    "rune.dodge" -> "Dodge Gem",
    "rune.destruction" -> "Destruction",
    "rune.precision" -> "Precision",
    "rune.distance" -> "Long Range",
    "rune.fury" -> "Fury",
    "rune.melee" -> "Melee",
    "rune.altruism" -> "Altruism",
    "rune.audacity" -> "Audacity",
    "rune.sneakiness" -> "Sneakiness",
    "rune.atrophy" -> "Atrophy",
    "rune.determination" -> "Determination",
    "rune.life" -> "Health",
    "rune.influence" -> "Influence",
    "rune.robustness" -> "Robustness",
    "rune.acuity" -> "Acuity",
    "rune.velocity" -> "Velocity",
    "rune.vivacity" -> "Vivacity",
    "skill.%_health_points" -> "% Health Points",
    "skill.elemental_resist" -> "Elemental Resistance",
    "skill.barrier" -> "Barrier",
    "skill.%_heals_received" -> "% Heals Received",
    "skill.%_armor_health_points" -> "% Armor Health Points",
    "skill.elemental_mastery" -> "Elemental Mastery",
    "skill.st_mastery" -> "Single Target Mastery",
    "skill.area_mastery" -> "Area Mastery",
    "skill.cc_mastery" -> "Close Combat Mastery",
    "skill.distance_mastery" -> "Distance Mastery",
    "skill.health_points" -> "Health Points",
    "skill.lock" -> "Lock",
    "skill.dodge" -> "Dodge",
    "skill.initiative" -> "Initiative",
    "skill.lock_and_dodge" -> "Lock and Dodge",
    "skill.%_ap_mp_removal" -> "% AP and MP removal",
    "skill.%_ap_mp_resist" -> "% AP and MP resistance",
    "skill.%_crit_chance" -> "% Critical Hit",
    "skill.%_block" -> "% Block",
    "skill.crit_mastery" -> "Critical Mastery",
    "skill.rear_mastery" -> "Rear Mastery",
    "skill.berserk_mastery" -> "Berserk Mastery",
    "skill.heal_mastery" -> "Healing Mastery",
    "skill.rear_resist" -> "Rear Resistance",
    "skill.crit_resist" -> "Critical Resistance",
    "skill.ap" -> "Action Points",
    "skill.mp" -> "Mov. Points and Damage",
    "skill.range" -> "Range and Damage",
    "skill.wp" -> "Wakfu Points",
    "skill.control" -> "Control and Damage",
    "skill.%_damage_inflicted" -> "% Damage inflicted",
    "skill.major_resist" -> "Elemental Resistance"
  )
}
