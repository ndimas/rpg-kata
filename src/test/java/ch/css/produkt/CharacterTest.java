package ch.css.produkt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {
    private final Character testee = new Character();

    @Test
    public void characterShouldReceiveDamage() {
        int expectedHealth = 990;

        testee.receiveDamage(10);

        assertEquals(expectedHealth, testee.getHealth());
    }

    @Test
    public void shouldCreateCharacterWithLevel1() {
        int expectedLevel = 1;

        assertEquals(expectedLevel, testee.getLevel());
    }

    @Test
    public void shouldCreateCharacterWith1000Health() {
        int expectedHealth = 1000;

        assertEquals(expectedHealth, testee.getHealth());
    }

    @Test
    public void shouldBeAlive() {
        Boolean expededAlive = true;
        assertEquals(expededAlive, testee.getLiveness());
    }
}
