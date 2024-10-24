package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        Hand hand = new Hand();

        for(int i = 0; i < 5; i++){
            Card card = deck.deal();
            hand.Deal(card);
        }

        int handValue = hand.getValue();
        System.out.println("handValue = " + handValue);
    }
}