package ch.css.produkt;

public class Character {
    static final int MAX_HEALTH = 1000;
    private FighterType type;
    private double health = MAX_HEALTH;
    private int level;

    public Character() {
        this(1);
    }

    public Character(int level) {
        this.level = level;
    }

    public Character(FighterType melee, int level) {
        this(level);
        this.type = melee;

    }

    public void dealDamage(Character target, int damage) {
        if (target != this) {
            double damageFactor = calculateDamageFactor(target);
            target.receiveDamage(damage * damageFactor);
        }
    }

    private double calculateDamageFactor(Character target) {
        int levelDifference = target.getLevel() - level;
        boolean target5LevelsStronger = levelDifference >= 5;
        boolean target5LevelsWeaker = levelDifference <= -5;

        if (target5LevelsStronger) {
            return 0.5;
        } else if (target5LevelsWeaker) {
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

    public int getRange() {
        return type == FighterType.MELEE ? 2 : 20;
    }
}
