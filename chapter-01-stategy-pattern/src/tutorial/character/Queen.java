package tutorial.character;

import tutorial.weapon.BowAndArrowBehaviour;

public class Queen extends Character {
    public Queen() {
        weaponBehaviour = new BowAndArrowBehaviour();
    }
}
