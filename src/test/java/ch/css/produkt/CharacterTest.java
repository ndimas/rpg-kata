package ch.css.produkt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CharacterTest
{
   private final Character testee = new Character();

    @Test
    public void shouldCreateCharacter()
    {

        assertEquals( 1000, character.getHealth() );
    }
}
