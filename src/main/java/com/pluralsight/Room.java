package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private boolean isOccupied;
    private boolean isDirty;
    private RoomType roomType;

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public Room(int numberOfBeds, boolean isOccupied, boolean isDirty, boolean isAvailable, RoomType roomType) {
        this.numberOfBeds = numberOfBeds;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.roomType = roomType;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public void checkIn() {
        if (!isAvailable()) {
            throw new IllegalStateException("Room is not available");
        }
        isOccupied = true;
        isDirty = true;
    }

    public void checkout() {
        if (isAvailable()) {
            throw new IllegalStateException("Room is available");
        }
        cleanRoom();
        isOccupied = false;
    }

    public void cleanRoom() {
        isDirty = false;
    }

    @Override
    public String toString() {
        return "Room{" + "\n " +
                "numberOfBeds = " + numberOfBeds + "\n" +
                " isOccupied = " + isOccupied + "\n" +
                " isDirty = " + isDirty + "\n" +
                " isAvailable = " + isAvailable() + "\n" +
                " roomType = " + roomType + "\n" +
                '}';
    }

    public enum RoomType {
        KING, DOUBLE
    }
}
