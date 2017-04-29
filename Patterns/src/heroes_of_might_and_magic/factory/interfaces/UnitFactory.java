package heroes_of_might_and_magic.factory.interfaces;

import heroes_of_might_and_magic.unit.interfaces.FirstLevel;
import heroes_of_might_and_magic.unit.interfaces.SecondLevel;

public interface UnitFactory {

    FirstLevel createFirstLevelUnit();

    SecondLevel createSecondLevelUnit();

}
