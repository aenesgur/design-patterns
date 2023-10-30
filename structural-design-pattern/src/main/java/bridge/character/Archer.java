package bridge.character;

import bridge.weapon.Weapon;

public class Archer extends GameCharacter {
    public Archer(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        System.out.println("Archer is attacking.");
        weapon.useWeapon();
    }
}