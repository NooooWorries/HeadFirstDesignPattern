package tutorial.weapon;

public class SwordBehaviour implements IWeaponBehaviour {
    @Override
    public void fight() {
        System.out.println("Fight with sword!");
    }
}
