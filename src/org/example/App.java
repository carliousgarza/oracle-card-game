package org.example;

import org.example.core.Game;

public class App {
    public static void main(String[] args) {
        //App shouldn't worry about anything other than starting the game.

        Game game = Game.getInstance();

        game.start();

        try {
            game.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
