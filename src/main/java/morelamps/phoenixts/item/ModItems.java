package morelamps.phoenixts.item;

import morelamps.phoenixts.Morelamps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MODIFIED_REDSTONE = registerItem("modified_redstone",
            new Item(new FabricItemSettings().group(ModItemGroup.MORELAMPS)));
//    public static final Item MODIFIED_REDSTONE = registerItem("modified_redstone",
//            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Morelamps.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Morelamps.LOGGER.debug("Registering Mod Items for " + Morelamps.MOD_ID);
    }
}
