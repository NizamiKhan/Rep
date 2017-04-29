package heroes_of_might_and_magic.unit.impl.first_level;

import heroes_of_might_and_magic.unit.interfaces.FirstLevel;

//копейщик
public class Spearman implements FirstLevel {

    private int attack = 4;
    private int speed = 4;


    @Override
    public void attack() {
        System.out.println(attack);
    }

    @Override
    public void speed() {
        System.out.println(4);
    }



}
