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
        return value + " of " + suit;
    }
}
