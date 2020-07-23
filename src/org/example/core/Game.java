package org.example.core;

public class Game implements AutoCloseable {
    private static Game instance;
    private Deck deck;

    private Game() {
        deck = new Deck();
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Cleaning up instance");
        instance = null;
    }

    public void dealCard(Player p) {
        p.hand.add(deck.dealCard());
    }
}
