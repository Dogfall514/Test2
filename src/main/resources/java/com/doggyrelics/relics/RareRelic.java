import org.bukkit.entity.Player;

public class RareRelic extends Relic {
    public RareRelic(double rewardChance) {
        super(createRelicItem("Rare Relic", Collections.singletonList("Click to get rewards")), rewardChance);
    }

    @Override
    public void activateEffect(Player player, List<String> customRewards) {
        // Implement rare relic effect with custom rewards
    }
}
