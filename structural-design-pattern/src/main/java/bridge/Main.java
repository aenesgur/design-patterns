package bridge;

import bridge.character.Archer;
import bridge.character.GameCharacter;
import bridge.character.Knight;
import bridge.weapon.BowAndArrow;
import bridge.weapon.Sword;
import bridge.weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Sword();
        Weapon bowAndArrow = new BowAndArrow();

        GameCharacter knight = new Knight(sword);
        GameCharacter archer = new Archer(bowAndArrow);

        knight.attack();
        archer.attack();
    }
}
