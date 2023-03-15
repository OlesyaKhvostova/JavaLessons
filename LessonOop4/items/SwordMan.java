package items;

import weapons.Defense;
import weapons.SkinShield;
import weapons.Sword;

public class SwordMan extends Warrior<Sword, Defense> {
    public SwordMan(String name, Sword weapon, Defense shield) {
        super(name, weapon, shield);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}
