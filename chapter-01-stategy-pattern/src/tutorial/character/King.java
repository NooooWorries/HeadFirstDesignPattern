package tutorial.character;

import tutorial.weapon.AxeBehaviour;

public class King extends Character {
    public King() {
        weaponBehaviour = new AxeBehaviour();
    }
}
