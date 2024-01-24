import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Random;

public abstract class Relic {
    private ItemStack item;
    private double rewardChance;
    private List<String> rewards;

    public Relic(ItemStack item, ConfigurationSection config) {
        this.item = item;
        this.rewardChance = config.getDouble("reward-chance");
        this.rewards = config.getStringList("rewards");
    }

    // Other methods remain the same...

    public void activateEffect(Player player) {
        if (shouldReward()) {
            giveRewards(player);
        }
    }

    private void giveRewards(Player player) {
        // Implement logic to give rewards to the player.
        // You can use the 'rewards' list.
    }
}
