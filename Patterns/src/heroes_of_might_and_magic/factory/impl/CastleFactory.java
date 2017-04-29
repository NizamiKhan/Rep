package heroes_of_might_and_magic.factory.impl;

import heroes_of_might_and_magic.factory.interfaces.UnitFactory;
import heroes_of_might_and_magic.unit.impl.first_level.Spearman;
import heroes_of_might_and_magic.unit.impl.second_level.Archer;
import heroes_of_might_and_magic.unit.interfaces.FirstLevel;
import heroes_of_might_and_magic.unit.interfaces.SecondLevel;

public class CastleFactory implements UnitFactory {
    @Override
    public FirstLevel createFirstLevelUnit() {
        return new Spearman();
    }

    @Override
    public SecondLevel createSecondLevelUnit() {
        return new Archer();
    }
}
