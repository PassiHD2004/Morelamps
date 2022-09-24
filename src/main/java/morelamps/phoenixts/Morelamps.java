package morelamps.phoenixts;

import morelamps.phoenixts.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Morelamps implements ModInitializer {

    public static final String MOD_ID = "morelamps";
    public static Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
