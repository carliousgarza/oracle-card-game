package org.example.core;

public class Card {
    private String suit;
    private int value;

    public Card(int value, String suit) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == 1) {
            return "A" + suit;
        } else if (value == 11) {
            return "J" + suit;
        } else if (value == 12) {
            return "Q" + suit;
        } else if (value == 13) {
            return "K" + suit;
        } /* else if (value == 14) {
            return "JOKER" + suit;
        } */
        return value + suit;
    }
}
