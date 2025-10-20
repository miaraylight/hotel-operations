package com.pluralsight;

import java.time.LocalDateTime;

public class Room {
    private int numberOfBeds;
    private boolean isOccupied;
    private boolean isDirty;
    private LocalDateTime isAvailable;
    public enum RoomType {
        KING, DOUBLE
    }

    private RoomType roomType;

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Room(int numberOfBeds, boolean isOccupied, boolean isDirty, LocalDateTime isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
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

    public LocalDateTime getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(LocalDateTime isAvailable) {
        this.isAvailable = isAvailable;
    }
}
