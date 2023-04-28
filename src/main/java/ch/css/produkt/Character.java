package ch.css.produkt;

public class Character {
    static final int MAX_HEALTH = 1000;
    private double health = MAX_HEALTH;
    private int level;

    public Character() {
        this(1);
    }

    public Character(int level) {
        this.level = level;
    }

    public void dealDamage(Character target, int damage) {
        if (target != this) {
            double damageFactor = calculateDamageFactor(target);
            target.receiveDamage(damage * damageFactor);
        }
    }

    private double calculateDamageFactor(Character target) {
        int levelDifference = target.getLevel() - level;

        if (levelDifference >= 5) {
            return 0.5;
        } else if (levelDifference <= -5) {
            return 2;
        }
        return 1;
    }

    public double getHealth() {
        return health;
    }

    public boolean getLiveness() {
        return health > 0;
    }

    public int getLevel() {
        return level;
    }

    private void receiveDamage(double damage) {
        health = damage > health ? 0 : health - damage;
    }

    public void heal(Character target, int healAmount) {
        if (target == this) {
            target.receiveHeal(healAmount);
        }
    }

    private void receiveHeal(int healAmount) {
        if (getLiveness()) {
            this.health = Math.min(healAmount + health, MAX_HEALTH);
        }
    }
}
