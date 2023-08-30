package tutorial;

import tutorial.character.King;
import tutorial.character.Knight;
import tutorial.character.Queen;
import tutorial.character.Troll;

public class Main {
    public static void main(String[] args) {
       king();
       knight();
       queen();
       troll();
    }

    private static void king() {
        System.out.println("===== King Start =====");
        King king = new King();
        king.fight();
        System.out.println("===== King End =====\n");
    }

    private static void knight() {
        System.out.println("===== Knight Start =====");
        Knight knight = new Knight();
        knight.fight();
        System.out.println("===== Knight End =====\n");
    }

    private static void queen() {
        System.out.println("===== Queen Start =====");
        Queen queen = new Queen();
        queen.fight();
        System.out.println("===== Queen End =====\n");
    }

    private static void troll() {
        System.out.println("===== Troll Start =====");
        Troll troll = new Troll();
        troll.fight();
        System.out.println("===== Troll End =====\n");
    }

}
