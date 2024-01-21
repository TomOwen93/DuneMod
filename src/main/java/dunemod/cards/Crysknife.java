package dunemod.cards;

import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.DamageAction;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import dunemod.characters.TheFremen;
import dunemod.util.CardStats;

public class Crysknife extends BaseCard {

    public static final String ID = makeID(Crysknife.class.getSimpleName());
    public static final CardStats info = new CardStats(TheFremen.Enums.CARD_COLOR, CardType.ATTACK, CardRarity.BASIC, CardTarget.ENEMY, 1);
    public static final int DAMAGE = 5;
    public static final int UPG_DAMAGE = 7;


    public Crysknife() {
        super(ID, info);
        setDamage(DAMAGE, UPG_DAMAGE);
    }

    @Override
    public void use(AbstractPlayer abstractPlayer, AbstractMonster abstractMonster) {
        addToBot(new DamageAction(abstractMonster, new DamageInfo(abstractPlayer, damage, DamageInfo.DamageType.NORMAL), AbstractGameAction.AttackEffect.SLASH_HEAVY));
    }
}
