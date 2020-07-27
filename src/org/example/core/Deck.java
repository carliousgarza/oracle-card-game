package org.example.core;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public ArrayList<Card> deckOfCards = new ArrayList<Card>();
    public ArrayList<Card> dealtCards = new ArrayList<Card>();

    public Deck() {
        for (int cardValue = 1; cardValue <= 13; cardValue++) {
            deckOfCards.add(new Card(cardValue, Suit.clubs));
            deckOfCards.add(new Card(cardValue, Suit.diamonds));
            deckOfCards.add(new Card(cardValue, Suit.hearts));
            deckOfCards.add(new Card(cardValue, Suit.spades));
        }
    }

    public void Shuffle() {
        Collections.shuffle(deckOfCards);
    }

    public Card dealCard() {
        Card nextCard = deckOfCards.get(0);
        deckOfCards.remove(nextCard);
        dealtCards.add(nextCard);
        return nextCard;
    }
}
