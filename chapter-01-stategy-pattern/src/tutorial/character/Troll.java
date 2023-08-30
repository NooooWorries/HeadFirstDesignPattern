package tutorial.character;

import tutorial.weapon.KnifeBehaviour;

public class Troll extends Character {
    public Troll() {
        weaponBehaviour = new KnifeBehaviour();
    }
}
