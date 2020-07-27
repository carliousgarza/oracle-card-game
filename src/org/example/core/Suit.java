package org.example.core;

public enum Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS;

    @Override
    public String toString() {
        switch (this) {
            case SPADES:
                return("♠");
            case HEARTS:
                return("♥");
            case DIAMONDS:
                return("♦");
            default:
                return("♣");
        }
    }
}