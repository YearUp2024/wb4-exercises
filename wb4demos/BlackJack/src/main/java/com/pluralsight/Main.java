package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Welcome to BlackJack!");
        String playerOneName = Console.PromptForString("Player 1, enter your name: ");
        System.out.println("Delaying cards... 2 cards to each player!");

        System.out.println("The dealer hand is: ");
        Card dealerCard1 = deck.deal();
        Card dealerCard2 = deck.deal();
        Hand delarHand = new Hand();
        delarHand.Deal(dealerCard1);
        delarHand.Deal(dealerCard2);
        delarHand.DisplayHand();

        System.out.println(playerOneName + "'s hand is: ");
        Card player1Card1 = deck.deal();
        Card player1Card2 = deck.deal();
        Hand player1Hand = new Hand();
        player1Hand.Deal(player1Card1);
        player1Hand.Deal(player1Card2);
        player1Hand.DisplayHand();

        if(delarHand.getValue() == player1Hand.getValue()){
            System.out.println("It's a TIE!");
        } else if(delarHand.getValue() > player1Hand.getValue()){
            System.out.println("Dealer Wins");
        } else{
            System.out.println(playerOneName + " wins!");
        }
    }
}