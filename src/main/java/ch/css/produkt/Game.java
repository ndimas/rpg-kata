package ch.css.produkt;

import java.util.Arrays;
import java.util.List;

public class Game {
    private final List<BoardCharacter> characters;


    public Game(BoardCharacter... characters) {
        this.characters = Arrays.asList(characters);
    }

    int calculateDistance(BoardCharacter fighter, BoardCharacter anotherFighter) {
        int xDiff = Math.abs(fighter.getCoords().x() - anotherFighter.getCoords().x());
        int yDiff = Math.abs(fighter.getCoords().y() - anotherFighter.getCoords().y());
        return (int) Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    public List<BoardCharacter> getCharacters() {
        return characters;
    }
}
