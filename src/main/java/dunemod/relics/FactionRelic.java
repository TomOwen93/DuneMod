package dunemod.relics;

import com.megacrit.cardcrawl.actions.watcher.ChooseOneAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import dunemod.cards.AtreidesPower;
import dunemod.cards.BenePower;
import dunemod.cards.EmpPower;
import dunemod.cards.HarkPower;
import dunemod.characters.TheFremen;

import java.util.ArrayList;

import static dunemod.DuneMod.makeID;

public class FactionRelic extends BaseRelic {

    private static final String NAME = "FactionRelic";
    public static final String ID = makeID(NAME);
    private static final RelicTier RARITY = RelicTier.STARTER;
    private static final LandingSound SOUND = LandingSound.MAGICAL;
    private static final int COUNTER = 1;
    private static String FACTION = "";


    public FactionRelic() {super(ID, NAME, TheFremen.Enums.CARD_COLOR, RARITY, SOUND); }

    public String getUpdatedDescription() {
        return DESCRIPTIONS[0];
    }

    public void onEquip() {
        CardCrawlGame.sound.play("GOLD_GAIN");

        ArrayList<AbstractCard> factionChoices = new ArrayList();
        factionChoices.add(new AtreidesPower());
        factionChoices.add(new BenePower());
        factionChoices.add(new EmpPower());
        factionChoices.add(new HarkPower());

        this.addToBot(new ChooseOneAction(factionChoices));
    }
}
