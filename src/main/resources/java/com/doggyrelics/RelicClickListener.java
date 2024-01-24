import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.configuration.ConfigurationSection;

public class RelicClickListener implements Listener {
    private final ConfigurationSection relicsConfig;

    public RelicClickListener(ConfigurationSection relicsConfig) {
        this.relicsConfig = relicsConfig;
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        // Check if the clicked item is a relic and handle the event.
        if (isRelic(event.getItem())) {
            handleRelicClick(event.getPlayer(), event.getItem());
        }
    }

    private boolean isRelic(ItemStack item) {
        // Implement logic to check if the item is a relic.
        // You can use metadata, lore, or any other criteria.
        return true; // Placeholder, replace with actual implementation.
    }

    private void handleRelicClick(Player player, ItemStack relicItem) {
        // Get the relic type from the loaded config
        String relicType = getRelicType(relicItem);

        // Create an instance of the respective relic class using the config
        Relic relic = createRelic(relicType, relicsConfig.getConfigurationSection(relicType));

        // Activate the relic's effect
        relic.activateEffect(player);
    }

    private String getRelicType(ItemStack relicItem) {
        // Implement logic to determine the relic type based on the item.
        // You can use metadata, lore, or any other criteria.
        return "common"; // Placeholder, replace with actual implementation.
    }

    private Relic createRelic(String relicType, ConfigurationSection config) {
        switch (relicType.toLowerCase()) {
            case "common":
                return new CommonRelic(config);
            case "rare":
                return new RareRelic(config);
            case "epic":
                return new EpicRelic(config);
            case "legendary":
                return new LegendaryRelic(config);
            default:
                // Handle unknown relic type
                return null;
        }
    }
}
