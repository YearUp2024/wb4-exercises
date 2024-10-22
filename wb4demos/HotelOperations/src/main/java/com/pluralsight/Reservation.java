package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType(){
        return roomType;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public double getPrice() throws Exception {
        double pricePerNight = 0.0;

        if(this.roomType.equalsIgnoreCase("king")){
            pricePerNight = 139.0;
        } else if(this.roomType.equalsIgnoreCase("double")){
            pricePerNight = 124.0;
        }else{
            throw new Exception("Invalid input");
        }

        if(this.isWeekend){
            pricePerNight *= 1.1;
        }

        return pricePerNight;
    }

    public double getNumberOfNights(){
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend(){
        return isWeekend;
    }

    public void setWeekend(boolean isWeekend){
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() throws Exception {
        return this.getPrice() * this.numberOfNights;
    }
}
