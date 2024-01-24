import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.java.JavaPlugin;

public class DoggyRelics extends JavaPlugin {

    @Override
    public void onEnable() {
        // Save default config if not already present
        saveDefaultConfig();

        // Reload the config to ensure we are using the latest changes
        reloadConfig();

        // Get the configuration section named "relics" from your config
        ConfigurationSection relicsConfig = getConfig().getConfigurationSection("relics");

        // Check if the "relics" section exists in the config
        if (relicsConfig != null) {
            // Register your relic classes with the loaded config
            getServer().getPluginManager().registerEvents(new RelicClickListener(relicsConfig), this);
        } else {
            getLogger().warning("The 'relics' section is missing in the config. Ensure your config.yml is set up correctly.");
        }
    }

    // Other methods remain the same...
}
