package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirt;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirt){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = isOccupied;
        this.dirt = isDirt;
    }

    public int getNumberOfBeds(){
        return this.numberOfBeds;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public boolean isDirty(){
        return dirt;
    }

    public boolean isAvailable(){
        return (!this.isOccupied() && !this.isDirty());
    }
}
