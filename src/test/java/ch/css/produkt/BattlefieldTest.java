package ch.css.produkt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BattlefieldTest {
    @Test
    void shouldCreateBattleFieldWithTwoFighters() {
        Battlefield battlefield = new Battlefield(new Character(),new Character());

        assertEquals(2, battlefield.getCharacters().size());
    }
}
