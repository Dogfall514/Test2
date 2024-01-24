import org.bukkit.entity.Player;

public class LegendaryRelic extends Relic {
    public LegendaryRelic(double rewardChance) {
        super(createRelicItem("Legendary Relic", Collections.singletonList("Click to get rewards")), rewardChance);
    }

    @Override
    public void activateEffect(Player player, List<String> customRewards) {
        // Implement legendary relic effect with custom rewards
    }
}
