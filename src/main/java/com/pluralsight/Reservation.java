package com.pluralsight;

public class Reservation {
    private final Room.RoomType roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(Room.RoomType roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public double getPrice() {
        return roomType == Room.RoomType.KING ? 139 : 124;
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

    public double getReservationTotal() {
        double total = getPrice() * numberOfNights;
        if (isWeekend) {
            total = total * 1.10;
        }

        return total;
    }

}
