package strategy.play.main;

import strategy.play.characters.Character;
import strategy.play.characters.King;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
    }
}
