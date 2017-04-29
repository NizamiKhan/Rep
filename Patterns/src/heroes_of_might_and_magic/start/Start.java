package heroes_of_might_and_magic.start;

import heroes_of_might_and_magic.factory.impl.CastleFactory;
import heroes_of_might_and_magic.factory.impl.OplotFactory;
import heroes_of_might_and_magic.factory.interfaces.UnitFactory;
import heroes_of_might_and_magic.unit.interfaces.FirstLevel;
import heroes_of_might_and_magic.unit.interfaces.SecondLevel;

import java.util.Scanner;

public class Start {

    private static UnitFactory unitFactory;

    public static void main(String[] args) {

        SelectFactory();

        FirstLevel firstLevel = unitFactory.createFirstLevelUnit();
        SecondLevel secondLevel = unitFactory.createSecondLevelUnit();


    }

    private static void SelectFactory() {

        int key;
        System.out.println("Выберите город: ");
        System.out.println("1. Замок ");
        System.out.println("2. Оплот ");

        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();

        switch (key) {
            case 1:
                unitFactory = new CastleFactory();
                break;
            case 2:
                unitFactory = new OplotFactory();
                break;
        }
    }
}
