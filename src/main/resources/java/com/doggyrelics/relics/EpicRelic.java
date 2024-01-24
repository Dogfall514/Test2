import org.bukkit.entity.Player;

public class EpicRelic extends Relic {
    public EpicRelic(double rewardChance) {
        super(createRelicItem("Epic Relic", Collections.singletonList("Click to get rewards")), rewardChance);
    }

    @Override
    public void activateEffect(Player player, List<String> customRewards) {
        // Implement epic relic effect with custom rewards
    }
}
