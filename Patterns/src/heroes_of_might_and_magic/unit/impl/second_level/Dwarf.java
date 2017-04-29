package heroes_of_might_and_magic.unit.impl.second_level;

import heroes_of_might_and_magic.unit.interfaces.SecondLevel;

//гном
public class Dwarf implements SecondLevel {

    private int attack = 6;
    private int speed = 3;



    @Override
    public void attack() {
        System.out.println(6);
    }

    @Override
    public void speed() {
        System.out.println(3);
    }
}
