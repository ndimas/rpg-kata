package ch.css.produkt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CharacterTest
{
    @Test
    public void shouldCreateCharacter()
    {
        Character character = new Character();

        assertEquals( 1000, character.getHealth() );
    }
}
