package ch.css.produkt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    private final Character testee = new Character();

    @Test
    void characterShouldReceiveDamage() {
        int expectedHealth = 990;

        testee.receiveDamage(10);

        assertEquals(expectedHealth, testee.getHealth());
    }

    @Test
    void characterShouldReceiveHeal() {
        int expectedHealth = 1000;
        testee.receiveDamage(10);

        testee.receiveHeal(10);

        assertEquals(expectedHealth, testee.getHealth());
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
    void shouldCreateCharacterWith1000Health() {
        int expectedHealth = 1000;

        assertEquals(expectedHealth, testee.getHealth());
    }

    @Test
    void shouldBeAlive() {
        Boolean expectedAlive = true;

        assertEquals(expectedAlive, testee.getLiveness());
    }

    @Test
    void shouldBeDeadAfterFullDamage() {
        Boolean expectedAlive = false;

        testee.receiveDamage(1000);

        assertEquals(expectedAlive, testee.getLiveness());
    }

}
