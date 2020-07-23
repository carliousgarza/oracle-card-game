package org.example.core;

import java.util.ArrayList;

public class Deck {
    public ArrayList<Card> deckOfCards = new ArrayList<Card>();
    public ArrayList<Card> dealtCards = new ArrayList<Card>();

    public Deck() {
        for(int cardValue = 1 ; cardValue <= 13 ; cardValue++){
            deckOfCards.add(new Card(cardValue,Suit.clubs));
            deckOfCards.add(new Card(cardValue,Suit.diamonds));
            deckOfCards.add(new Card(cardValue,Suit.hearts));
            deckOfCards.add(new Card(cardValue,Suit.spades));
        }
    }

    public Card dealCard(){
        int randomCard = (int)(Math.random() * (deckOfCards.size() - 1) );
        Card chosenRandomCard = deckOfCards.get(randomCard);
        deckOfCards.remove(chosenRandomCard);
        dealtCards.add(chosenRandomCard);
        return chosenRandomCard;
    }
}
