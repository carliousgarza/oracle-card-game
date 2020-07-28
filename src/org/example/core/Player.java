package org.example.core;

import java.util.ArrayList;

public class Player {
    public ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<Card>();
    }

    public void showHand() {
        System.out.println(hand);
    }
}
