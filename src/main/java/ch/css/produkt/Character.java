package ch.css.produkt;

public class Character
{
    private int health = 1000;
    private final int level = 1;

    public int getHealth() {
        return health;
    }

    public Boolean getLiveness() {
        return health>0;
    }
    public int getLevel() {
        return level;
    }

    public void receiveDamage(int damage) {
        health -= damage;
    }
}
