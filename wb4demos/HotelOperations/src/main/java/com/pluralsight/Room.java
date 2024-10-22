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
    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }

    public boolean isDirty(){
        return dirty;
    }
    public void setDirty(boolean dirty){
        this.dirty = dirty;
    }

    public boolean isAvailable(){
        return (!this.isOccupied() && !this.isDirty());
    }

    public boolean checkIn(){
        return isOccupied();
    }

    public boolean checkout(){
        return isAvailable();
    }

    public boolean cleanroom(){
        boolean occupied = false;
        if(checkIn()){
            setDirty(true);
            setOccupied(true);
        }
        return occupied;
    }
}
