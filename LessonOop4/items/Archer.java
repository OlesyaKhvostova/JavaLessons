package items;

import weapons.Bow;
import weapons.DummyShield;

public class Archer extends Warrior<Bow, DummyShield> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon) {
        super(name, weapon, new DummyShield());

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" +
                "distance=" + distance +
                '}';
    }
}
