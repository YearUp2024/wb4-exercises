package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit(){
        if(isFaceUp){
            return suit;
        }else {
            return "#";
        }
    }

    public String getValue(){
        if(isFaceUp){
            return value;
        }else {
            return "#";
        }
    }

    public int getPointValue() throws Exception {
        if(this.value.equalsIgnoreCase("2")){
            return 2;
        }
        if(this.value.equalsIgnoreCase("3")){
            return 3;
        }
        if(this.value.equalsIgnoreCase("4")){
            return 4;
        }
        if(this.value.equalsIgnoreCase("5")){
            return 5;
        }
        if(this.value.equalsIgnoreCase("6")){
            return 6;
        }
        if(this.value.equalsIgnoreCase("7")){
            return 7;
        }
        if(this.value.equalsIgnoreCase("7")){
            return 7;
        }
        if(this.value.equalsIgnoreCase("8")){
            return 8;
        }
        if(this.value.equalsIgnoreCase("9")){
            return 9;
        }
        if(this.value.equalsIgnoreCase("10")){
            return 10;
        }
        if(this.value.equalsIgnoreCase("J")){
            return 10;
        }
        if(this.value.equalsIgnoreCase("Q")){
            return 10;
        }
        if(this.value.equalsIgnoreCase("K")){
            return 10;
        }
        if(this.value.equalsIgnoreCase("A")){
            return 11;
        }else {
            throw new Exception("Invalid Card Value");
        }
    }

    public boolean isFaceUp(){
        return isFaceUp;
    }

    public void flip(){
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString(){
        return this.value + " of " + this.suit;
    }
}
