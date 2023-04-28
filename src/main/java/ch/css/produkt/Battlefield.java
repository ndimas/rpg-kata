package ch.css.produkt;

import java.util.Arrays;
import java.util.List;

public class Battlefield {
    private final List<Character> characters;

    public Battlefield(Character... characters) {
        this.characters = Arrays.asList(characters);
    }

    public List<Character> getCharacters() {
        return characters;
    }
}
