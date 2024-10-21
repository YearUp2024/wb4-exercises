package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirt;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirt){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirt = isDirt;
    }

    public int getNumberOfBeds(){
        return this.numberOfBeds;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isOccupied(){
        return isOccupied();
    }

    public boolean isDirty(){
        return isDirt;
    }

    public boolean isAvailable(){
        return (isOccupied() || isDirty());
    }
}
