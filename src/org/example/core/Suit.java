package org.example.core;

public enum Suit {
    // Changed from interface to enum, because of limited options, for simplicity.
    // Seemed a bit more appropriate than having an interface.

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