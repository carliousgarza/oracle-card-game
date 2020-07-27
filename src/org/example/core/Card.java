package org.example.core;

public class Card {
    private Suit suit;
    private CardValue value;

    public Card(CardValue value, Suit suit) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString() + suit;
    }
}
