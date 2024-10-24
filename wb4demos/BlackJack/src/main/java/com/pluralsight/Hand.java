package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void Deal(Card card){
        cards.add(card);
    }

    public void Deal(Deck deck, int numberOfCardsToDeal){
        for(int i = 0; i < numberOfCardsToDeal ; i++){
            Deal(deck.deal());
        }
    }

    public int getSize(){
        return cards.size();
    }

    public int getValue() throws Exception {
        int hasValue = 0;
        for(Card card : cards){
            card.flip();
            hasValue += card.getPointValue();
            card.flip();
        }
        return hasValue;
    }

    @Override
    public String  toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Card card : this.cards){
            stringBuilder.append(card.toString());
            stringBuilder.append("\n");
        }

        try {
            stringBuilder.append("The total is:").append(this.getValue());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
