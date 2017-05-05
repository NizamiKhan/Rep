package impls.heroes;

import enums.GroupHero;
import interfaces.castlesunits.FirstLevel;
import interfaces.Hero;
import interfaces.castlesunits.SecondLevel;
import interfaces.castlesunits.ThirdLevel;

public class BestHero implements Hero {

    FirstLevel firstLevel;
    SecondLevel secondLevel;
    ThirdLevel thirdLevel;

    int attack;
    int protection;
    GroupHero groupHero;

    public BestHero() {
    }

    public BestHero(FirstLevel firstLevel, SecondLevel secondLevel, ThirdLevel thirdLevel) {
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
        this.thirdLevel = thirdLevel;
    }

    public BestHero(int attack, int protection, GroupHero groupHero) {
        this.attack = attack;
        this.protection = protection;
        this.groupHero = groupHero;
    }

    public BestHero(FirstLevel firstLevel, SecondLevel secondLevel, ThirdLevel thirdLevel, int attack, int protection, GroupHero groupHero) {
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
        this.thirdLevel = thirdLevel;
        this.attack = attack;
        this.protection = protection;
        this.groupHero = groupHero;
    }

    public FirstLevel getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(FirstLevel firstLevel) {
        this.firstLevel = firstLevel;
    }

    public SecondLevel getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(SecondLevel secondLevel) {
        this.secondLevel = secondLevel;
    }

    public ThirdLevel getThirdLevel() {
        return thirdLevel;
    }

    public void setThirdLevel(ThirdLevel thirdLevel) {
        this.thirdLevel = thirdLevel;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public GroupHero getGroupHero() {
        return groupHero;
    }

    public void setGroupHero(GroupHero groupHero) {
        this.groupHero = groupHero;
    }

    public void attackAllUnits() {

        firstLevel.attackFirstLevel();
        secondLevel.attackSecondLevel();
        thirdLevel.attackThirdLevel();

        System.out.println("Attack = " + attack);
        System.out.println("Protection = " + protection);
        System.out.println("Group Hero: " + groupHero);
    }

    public void attackTest() {

        secondLevel.attackSecondLevel();


    }
}
