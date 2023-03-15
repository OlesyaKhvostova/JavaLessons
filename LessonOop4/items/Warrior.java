package items;

import weapons.Defense;
import weapons.SkinShield;
import weapons.Weapon;
import weapons.Shield;

import java.sql.ShardingKey;
import java.util.Random;

public abstract class Warrior<T extends Weapon, S extends Defense> {
    private String name;
    protected T weapon;
    protected S shield;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name, T weapon, S shield) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        healthPoint = 100;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        if (damage > enemy.getMaxProtaction())
        {
            damage = damage - enemy.getMaxProtaction();
        }
        else
        {
            damage = 0;
        }
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }

    public int getMaxProtaction(){
        return shield.protaction();
    }

    public boolean hasShield()
    {
        return ((Shield)shield).hasShield();
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", defense=" + shield +
                ", healthPoint=" + healthPoint +
                '}';
    }
}
