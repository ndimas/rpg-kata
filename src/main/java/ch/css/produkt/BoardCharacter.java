package ch.css.produkt;

public class BoardCharacter {
    private Character character;
    private Point coords;

    public BoardCharacter(Character character, Point point) {
        this.character = character;
        this.coords = point;
    }

    public Point getCoords() {
        return coords;
    }

    public Character getCharacter() {
        return character;
    }
}
