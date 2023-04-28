package ch.css.produkt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ch.css.produkt.Character.MAX_HEALTH;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterDamageTest {
    private Character testee = new Character();

    @BeforeEach
    void setUp() {
        testee = new Character();
    }

    @Test
    void shouldReduceDamageWhenAttackerSmallerLevel() {
        Character target = new Character(6);
        Character attacker = new Character(1);
        short expectedHealth = 995;

        attacker.dealDamage(target, 10);

        assertEquals(expectedHealth, target.getHealth());
    }

    @Test
    void shouldIncreaseDamageWhenAttackerBiggerLevel() {
        Character target = new Character(1);
        Character attacker = new Character(6);
        short expectedHealth = 980;

        attacker.dealDamage(target, 10);

        assertEquals(expectedHealth, target.getHealth());
    }

    @Test
    void characterShouldReceiveDamage() {
        int expectedHealth = 990;
        Character opponent = new Character();

        opponent.dealDamage(testee, 10);

        assertEquals(expectedHealth, testee.getHealth());
    }

    @Test
    void characterHealthShouldBe0WhenTooMuchReceiveDamageAnd() {
        int expectedHealth = 0;
        Character opponent = new Character();

        opponent.dealDamage(testee, 2000);

        assertEquals(expectedHealth, testee.getHealth());
    }

    @Test
    void shouldBeDeadAfterFullDamage() {
        boolean expectedAlive = false;
        Character opponent = new Character();
        opponent.dealDamage(testee, MAX_HEALTH);

        testee.dealDamage(testee, MAX_HEALTH);

        assertEquals(expectedAlive, testee.getLiveness());
    }

    @Test
    void shouldNotDamageItself() {
        testee.dealDamage(testee, 10);

        assertEquals(MAX_HEALTH, testee.getHealth());
    }

}
