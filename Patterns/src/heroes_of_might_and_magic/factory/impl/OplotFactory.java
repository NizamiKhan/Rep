package heroes_of_might_and_magic.factory.impl;

import heroes_of_might_and_magic.factory.interfaces.UnitFactory;
import heroes_of_might_and_magic.unit.impl.first_level.Centaur;
import heroes_of_might_and_magic.unit.impl.second_level.Dwarf;
import heroes_of_might_and_magic.unit.interfaces.FirstLevel;
import heroes_of_might_and_magic.unit.interfaces.SecondLevel;

public class OplotFactory implements UnitFactory {
    @Override
    public FirstLevel createFirstLevelUnit() {
        return new Centaur();
    }

    @Override
    public SecondLevel createSecondLevelUnit() {
        return new Dwarf();
    }
}
