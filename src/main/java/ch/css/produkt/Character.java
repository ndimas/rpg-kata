package ch.css.produkt;

public class Character {
    private static final int MAX_HEALTH = 1000;
    private int health = MAX_HEALTH;
    private final int level = 1;

    public int getHealth() {
        return health;
    }

    public Boolean getLiveness() {
        return health > 0;
    }

    public int getLevel() {
        return level;
    }

    public void receiveDamage(int damage) {
        health = damage > health ? 0 : health - damage;
    }

    public void receiveHeal(int healAmount) {
        if (health > 0) {
            this.health = Math.min(healAmount + health, MAX_HEALTH);
        }
    }
}
