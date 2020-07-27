package org.example;

import org.example.core.Game;
import org.example.core.Player;

public class App {
    public static void main(String[] args) {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        Game game = Game.getInstance();
        for (int i = 0; i < 5; i++) {
            game.dealCard(playerOne);
            game.dealCard(playerTwo);
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Player One's Hand");
        playerOne.showHand();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Player Two's Hand");
        playerTwo.showHand();
        System.out.println("---------------------------------------------------------------------");
        
    }
}
