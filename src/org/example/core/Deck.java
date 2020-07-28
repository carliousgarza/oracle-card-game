package org.example.core;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    // Could've gone for Card[52] for efficiency, but decided to keep arraylist for clarity and simplicity.
    private ArrayList<Card> deckOfCards = new ArrayList<Card>();
    private ArrayList<Card> dealtCards = new ArrayList<Card>();

    public Deck() {
        fillDeckOfCards();
    }

    private void fillDeckOfCards() {
        for (int cardValue = 0; cardValue < 13; cardValue++) {
            CardValue value = CardValue.values()[cardValue];
            for (int suitValue = 0; suitValue < 4; suitValue++) {
                Card card = new Card(value, Suit.values()[suitValue]);
                this.deckOfCards.add(card);
            }
        }

        /* 
        // Uncomment to add Jokers. Kept them as spades and hearts instead of red and black for simplicity. 
        deckOfCards.add(new Card(CardValue.JOKER, Suit.SPADES)); 
        deckOfCards.add(new Card(CardValue.JOKER, Suit.HEARTS));
        */
    }

    // Decided to shuffle once instead of getting a random number each time you deal a card.
    public void shuffle() {
        Collections.shuffle(deckOfCards);
    }

    // Deal the top card of a shuffled deck.
    public Card dealCard() {
        Card nextCard = deckOfCards.get(0);
        deckOfCards.remove(nextCard);
        dealtCards.add(nextCard);
        return nextCard;
    }
}
