package org.example.core;

public class Game implements AutoCloseable {
    private static Game gameInstance;
    private Deck deck;
    private static Player playerOne;
    private static Player playerTwo;

    private Game() {
        deck = new Deck();
        deck.shuffle();
    }

    public void start() {
        playerOne = new Player();
        playerTwo = new Player();
        for (int cardsDealt = 1; cardsDealt <= 5; cardsDealt++) {
            dealCard(playerOne);
            dealCard(playerTwo);
        }
        showHands();
    }

    private static void showHands() {
        if (playerOne == null || playerTwo == null) {
            return;
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Player One's Hand");
        playerOne.showHand();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Player Two's Hand");
        playerTwo.showHand();
        System.out.println("---------------------------------------------------------------------");
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
