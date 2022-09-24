package morelamps.phoenixts.item;

import morelamps.phoenixts.Morelamps;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MORELAMPS = FabricItemGroupBuilder.build(
            new Identifier(Morelamps.MOD_ID, "morelamps"), () -> new ItemStack(ModItems.MODIFIED_REDSTONE));
}
