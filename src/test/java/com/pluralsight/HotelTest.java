package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    @Test
    void bookRoom_whenRoomsAvailable_should_return_true() {
        // arrange: create object
            Hotel myHotel = new Hotel("Majestic", 10, 10);
        // act: call method
        boolean result = myHotel.bookRoom(5, true);
        // assert: verify changes
        assertTrue(result);

    }

    @Test
    void bookRoom_whenRoomsAvailable_should_return_false() {
        // arrange: create object
        Hotel myHotel = new Hotel("Majestic", 10, 10);
        // act: call method
        boolean result = myHotel.bookRoom(11, true);
        // assert: verify changes
        assertFalse(result);
    }

    @Test
    void checkIn_when_rooms_is_occupied_should_throw_an_exception() {
        Room myRoom = new Room(2,true, true, true, Room.RoomType.KING);

        IllegalStateException exception = assertThrows(IllegalStateException.class, myRoom::checkIn);

        assertEquals("Room is not available", exception.getMessage());
    }

    @Test
    void checkIn_when_rooms_is_dirty_should_throw_an_exception() {
        Room myRoom = new Room(2,true, true, true, Room.RoomType.KING);

        IllegalStateException exception = assertThrows(IllegalStateException.class, myRoom::checkIn);

        assertEquals("Room is not available", exception.getMessage());
    }

    @Test
    void cleanRoom_when_rooms_is_occupied_should_throw_an_exception() {
        Room myRoom = new Room(2,true, true, true, Room.RoomType.KING);

        IllegalStateException exception = assertThrows(IllegalStateException.class, myRoom::cleanRoom);

        assertEquals("Room is occupied", exception.getMessage());
    }
}