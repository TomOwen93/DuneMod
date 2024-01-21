package dunemod.relics;

import dunemod.characters.TheFremen;

import static dunemod.DuneMod.makeID;

public class GholaEyes extends BaseRelic {

    private static final String NAME = "GholaEyes";
    public static final String ID = makeID(NAME);
    private static final RelicTier RARITY = RelicTier.STARTER;
    private static final LandingSound SOUND = LandingSound.MAGICAL;
    private static final int COUNTER = 1;

    public GholaEyes() {
        super(ID, NAME, TheFremen.Enums.CARD_COLOR, RARITY, SOUND);
    }

    @Override
    public String getUpdatedDescription() {
        return DESCRIPTIONS[0];
    }
}
