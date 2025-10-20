package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;


    public float getPrice() {
        return (float) (roomType.equals("KING") ? 139 : 124);
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
            total = total * 1.10;
        }

        return total;
    }


}
