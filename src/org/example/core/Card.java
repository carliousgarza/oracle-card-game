package org.example.core;

public class Card {
    public String suit;
    public int value;

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
        }
        return value + suit;
    }
}
