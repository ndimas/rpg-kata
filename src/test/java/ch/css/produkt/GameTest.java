package ch.css.produkt;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
    @Test
    void shouldCreateBattleFieldWithTwoFighters() {
        BoardCharacter boardFighter = new BoardCharacter(new Character(), new Point(0, 0));
        BoardCharacter otherBoardFighter = new BoardCharacter(new Character(), new Point(0, 0));

        Game game = new Game(boardFighter, otherBoardFighter);

        assertEquals(2, game.getCharacters().size());
    }

    @Test
    void shouldCalculateDistanceBetweenTwoFighters() {
        BoardCharacter boardFighter = new BoardCharacter(new Character(), new Point(0, 0));
        BoardCharacter otherBoardFighter = new BoardCharacter(new Character(), new Point(3, 4));

        Game game = new Game(boardFighter, otherBoardFighter);

        int actual = game.calculateDistance(boardFighter, otherBoardFighter);

        assertEquals(5, actual);
    }
}
