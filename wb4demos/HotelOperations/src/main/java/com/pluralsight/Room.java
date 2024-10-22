package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = isOccupied;
        this.dirty = isDirty;
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
        return dirty;
    }

    public boolean isAvailable(){
        return (!this.isOccupied() && !this.isDirty());
    }

    public void checkIn(){
        if(!isOccupied() && !isDirty()){
            this.occupied = true;
            this.dirty = true;
        }
    }

    public void checkout() throws Exception {
        if(isOccupied()){
            this.occupied = false;
        }else{
            throw new Exception("This room can not be checkout.");
        }
    }

    public void cleanroom(){
        if(isDirty()){
            this.dirty = false;
        }
    }
}
