import org.bukkit.entity.Player;

public class CommonRelic extends Relic {
    public CommonRelic(double rewardChance) {
        super(createRelicItem("Common Relic", Collections.singletonList("Click to get rewards")), rewardChance);
    }

    @Override
    public void activateEffect(Player player, List<String> customRewards) {
        // Implement common relic effect with custom rewards
        // You can use customRewards to customize the rewards for this relic
    }
}
