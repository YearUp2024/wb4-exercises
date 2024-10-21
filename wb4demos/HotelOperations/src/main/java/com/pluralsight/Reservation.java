package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public String getRoomType(){
        return this.roomType;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public double getPrice(){
        return this.price;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend(){
        return this.weekend;
    }

    public void setWeekend(boolean weekend){
        this.weekend = weekend;
    }

    public double getReservationTotal(){
        return this.reservationTotal;
    }

}
