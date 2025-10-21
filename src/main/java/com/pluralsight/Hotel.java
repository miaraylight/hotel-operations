package com.pluralsight;

public class Hotel {
    public String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }



    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (getAvailableSuites() > numberOfRooms) {
                bookedSuites += numberOfRooms;
                this.numberOfSuites -= numberOfRooms;
                return true;
            }else {
                return false;
            }
        } else {
            if (getAvailableRooms() > numberOfRooms) {
                bookedBasicRooms += numberOfRooms;
                this.numberOfRooms -= numberOfRooms;
                return true;
            }else {
                return false;
            }
        }
    }

    private int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    private int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", numberOfSuites=" + numberOfSuites +
                ", numberOfRooms=" + numberOfRooms +
                ", bookedSuites=" + bookedSuites +
                ", bookedBasicRooms=" + bookedBasicRooms +
                '}';
    }
}
