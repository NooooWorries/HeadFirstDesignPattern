package tutorial.character;

import tutorial.weapon.IWeaponBehaviour;

public abstract class Character {
    IWeaponBehaviour weaponBehaviour;

    public void fight() {
        weaponBehaviour.fight();
    }

    public void setWeaponBehaviour(IWeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
