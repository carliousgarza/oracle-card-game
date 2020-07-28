package org.example.core;

public enum CardValue {
    ACE("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"),
    JACK("J"), QUEEN("Q"), KING("K"), JOKER("JOKER");

    private final String cardValueString;

    private CardValue(String cardValueString) {
        this.cardValueString = cardValueString;
    }

    @Override
    public String toString() {
        return (cardValueString);
    }
}