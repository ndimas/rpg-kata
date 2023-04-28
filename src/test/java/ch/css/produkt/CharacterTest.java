package ch.css.produkt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest
{
   private final Character testee = new Character();

    @Test
    public void shouldCreateCharacterWithLevel1()
    {

        assertEquals( 1, testee.getLevel() );
    }
    @Test
    public void shouldCreateCharacterWith1000Health()
    {

        assertEquals( 1000, testee.getHealth() );
    }

    @Test
    public void shouldBeAlive(){
        Boolean expededAlive = true;
        assertEquals(expededAlive, testee.getLiveness());
    }
}
