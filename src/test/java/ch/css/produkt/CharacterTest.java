package ch.css.produkt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ch.css.produkt.Character.MAX_HEALTH;
import static ch.css.produkt.FighterType.MELEE;
import static ch.css.produkt.FighterType.RANGED;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterTest {
    private Character testee = new Character();

    @BeforeEach
    void setUp() {
        testee = new Character();
    }


    @Test
    void sameCharacterShouldReceiveHeal() {
        testee.dealDamage(testee, 10);

        testee.heal(testee, 10);

        assertEquals(MAX_HEALTH, testee.getHealth());
    }

    @Test
    void otherCharacterShouldNotReceiveHeal() {
        Character otherCharacter = new Character();
        testee.dealDamage(otherCharacter, 10);

        testee.heal(otherCharacter, 10);

        assertEquals(MAX_HEALTH - 10, otherCharacter.getHealth());
    }

    @Test
    void healingCannotRaiseHealthAboveMax() {
        testee.heal(testee, 10);

        assertEquals(MAX_HEALTH, testee.getHealth());
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
    void shouldStayDeadAfterHealDeadCharacter() {
        Character opponent = new Character();
        opponent.dealDamage(testee, MAX_HEALTH);
        boolean expectedAlive = false;

        testee.heal(testee, 10);

        assertEquals(expectedAlive, testee.getLiveness());
    }

    @Test
    void shouldCreateCharacterWithCustomLevel() {
        int expectedLevel = 5;

        Character actual = new Character(expectedLevel);

        assertEquals(expectedLevel, actual.getLevel());
    }

    @Test
    void meleeFighterHasSmallRange() {
        Character melee = new Character(MELEE, 5);
        int expectedRange = 2;

        assertEquals(expectedRange, melee.getRange());
    }

    @Test
    void rangedFighterHasLargeRange() {
        Character melee = new Character(RANGED, 1);
        int expectedRange = 20;

        assertEquals(expectedRange, melee.getRange());
    }
}
