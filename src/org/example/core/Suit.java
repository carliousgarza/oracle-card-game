package org.example.core;

public enum Suit {
    SPADES("♠"), HEARTS("♥"), DIAMONDS("♦"), CLUBS("♣");

    private final String suitString;

    private Suit(String suitString) {
        this.suitString = suitString;
    }

    @Override
    public String toString() {
        return suitString;
    }
}