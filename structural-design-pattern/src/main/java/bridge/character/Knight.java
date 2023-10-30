package bridge.character;

import bridge.weapon.Weapon;

public class Knight extends GameCharacter {
    public Knight(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        System.out.println("Knight is attacking.");
        weapon.useWeapon();
    }
}