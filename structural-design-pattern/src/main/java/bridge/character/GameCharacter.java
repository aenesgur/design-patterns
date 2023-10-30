package bridge.character;

import bridge.weapon.Weapon;

public abstract class GameCharacter {
    protected Weapon weapon;

    public GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void attack();
}
