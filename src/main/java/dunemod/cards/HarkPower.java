package dunemod.cards;

import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import dunemod.characters.TheFremen;
import dunemod.util.CardStats;

public class HarkPower extends BaseCard{

    public static final String ID = makeID(HarkPower.class.getSimpleName());
    public static final CardStats info = new CardStats(TheFremen.Enums.CARD_COLOR, CardType.POWER, CardRarity.RARE, CardTarget.NONE, 0);


    public HarkPower() {
        super(ID, info);
    }

    @Override
    public void use(AbstractPlayer abstractPlayer, AbstractMonster abstractMonster) {

    }
}
