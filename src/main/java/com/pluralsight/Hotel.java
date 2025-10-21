package com.pluralsight;

public class Hotel {
    public String name;
    public int numberOfSuites;
    public int numberOfRooms;
    public int bookedSuites;
    public int bookedBasicRooms;

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
            bookedSuites += numberOfRooms;
            this.numberOfSuites -= numberOfRooms;
            return true;
        } else {
            bookedBasicRooms += numberOfRooms;
            this.numberOfRooms -= numberOfRooms;
            return true;
        }

    }

//    private int getAvailableSuites() {
//
//    }
//
//    private int getAvailableSuites() {
//
//    }
}
