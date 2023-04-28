package ch.css.produkt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ch.css.produkt.Character.MAX_HEALTH;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterTest {
    private Character testee = new Character();

    @BeforeEach
    void setUp() {
        testee = new Character();
    }

    @Test
    void characterShouldReceiveDamage() {
        int expectedHealth = 990;

        testee.receiveDamage(10);

        assertEquals(expectedHealth, testee.getHealth());
    }

    @Test
    void characterShouldReceiveHeal() {
        testee.receiveDamage(10);

        testee.receiveHeal(10);

        assertEquals(MAX_HEALTH, testee.getHealth());
    }

    @Test
    void healingCannotRaiseHealthAboveMax() {
        testee.receiveHeal(10);

        assertEquals(MAX_HEALTH, testee.getHealth());
    }

    @Test
    void characterHealthShouldBe0WhenTooMuchReceiveDamageAnd() {
        int expectedHealth = 0;

        testee.receiveDamage(2000);

        assertEquals(expectedHealth, testee.getHealth());
    }

    @Test
    void shouldCreateCharacterWithLevel1() {
        int expectedLevel = 1;

        assertEquals(expectedLevel, testee.getLevel());
    }

    @Test
    void shouldCreateCharacterWithMaxHealth() {
        assertEquals(MAX_HEALTH, testee.getHealth());
    }

    @Test
    void shouldBeAlive() {
        Boolean expectedAlive = true;

        assertEquals(expectedAlive, testee.getLiveness());
    }

    @Test
    void shouldBeDeadAfterFullDamage() {
        boolean expectedAlive = false;

        testee.receiveDamage(MAX_HEALTH);

        assertEquals(expectedAlive, testee.getLiveness());
    }

    @Test
    void shouldStayDeadAfterHealDeadCharacter(){
        testee.receiveDamage(MAX_HEALTH);
        boolean expectedAlive = false;

        testee.receiveHeal(10);

        assertEquals(expectedAlive, testee.getLiveness());
    }

}
