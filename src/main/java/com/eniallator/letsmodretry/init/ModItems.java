package com.eniallator.letsmodretry.init;

import com.eniallator.letsmodretry.item.ItemLMR;
import com.eniallator.letsmodretry.item.ItemOakLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMR oakLeaf = new ItemOakLeaf();

    public static void init() {

        GameRegistry.registerItem(oakLeaf,"oakLeaf");
    }
}
