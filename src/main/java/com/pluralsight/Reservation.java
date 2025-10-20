package com.pluralsight;

public class Reservation {
    private String roomType;
    private float price;
    private int numberOfNights;
    private boolean isWeekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getPrice() {
        price = roomType.equals("king") ? 139 : 124;
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal(){
        double total = getPrice() * numberOfNights;
        if (isWeekend) {
            total = total * 0.10;
        }

        return total;
    }


}
