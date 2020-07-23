package org.example.core;

public class Game implements AutoCloseable {
    private static Game gameInstance;
    private Deck deck;

    private Game() {
        deck = new Deck();
    }

    public static Game getInstance() {
        if (gameInstance == null) {
            gameInstance = new Game();
        }
        return gameInstance;
    }

    public void dealCard(Player player) {
        player.hand.add(deck.dealCard());
    }

    @Override
    public void close() throws Exception {
        System.out.println("Cleaning up gameInstance");
        gameInstance = null;
    }
}
