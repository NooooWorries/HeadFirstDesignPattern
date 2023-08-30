package tutorial.character;

import tutorial.weapon.SwordBehaviour;

public class Knight extends Character {
    public Knight() {
        weaponBehaviour = new SwordBehaviour();
    }
}
