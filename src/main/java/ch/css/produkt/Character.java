package ch.css.produkt;

public class Character {
    static final int MAX_HEALTH = 1000;
    private int health = MAX_HEALTH;
    private final int level = 1;

    public void dealDamage(Character target, int damage){
        target.receiveDamage(damage);
    }

    public int getHealth() {
        return health;
    }

    public boolean getLiveness() {
        return health > 0;
    }

    public int getLevel() {
        return level;
    }

    private void receiveDamage(int damage) {
        health = damage > health ? 0 : health - damage;
    }

    public void heal(Character target, int healAmount) {
        target.receiveHeal(healAmount);
    }
    private void receiveHeal(int healAmount) {
        if (getLiveness()) {
            this.health = Math.min(healAmount + health, MAX_HEALTH);
        }
    }
}
