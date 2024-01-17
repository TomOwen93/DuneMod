package basicmod.cards;

import basicmod.characters.TheFremen;
import basicmod.util.CardStats;
import com.megacrit.cardcrawl.actions.common.GainBlockAction;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;

public class Defend extends BaseCard{

    public static final String ID = makeID(Defend.class.getSimpleName());
    public static final CardStats info = new CardStats(TheFremen.Enums.CARD_COLOR, CardType.SKILL, CardRarity.BASIC, CardTarget.SELF, 1);
    private static final int BLOCK = 3;
    private static final int UPG_BLOCK = 6;

    public Defend() {
        super(ID, info);
        setBlock(BLOCK, UPG_BLOCK);
        setInnate(true);
    }
    @Override
    public void use(AbstractPlayer abstractPlayer, AbstractMonster abstractMonster) {
        addToBot(new GainBlockAction(abstractPlayer, abstractPlayer, BLOCK));

    }
}
