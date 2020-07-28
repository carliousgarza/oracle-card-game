package org.example.core;

import java.util.ArrayList;

public class Player {
    // Decided to keep player the same, made sense for a player to have a hand
    // instead of having a Hand class.

    public ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<Card>();
    }

    public void showHand() {
        System.out.println(hand);
    }
}
