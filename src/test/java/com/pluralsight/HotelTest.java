package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

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
        Room myRoom = new Room(2, true, true, true, Room.RoomType.KING);

        IllegalStateException exception = assertThrows(IllegalStateException.class, myRoom::checkIn);

        assertEquals("Room is not available", exception.getMessage());
    }

    @Test
    void checkIn_when_rooms_is_dirty_should_throw_an_exception() {
        Room myRoom = new Room(2, true, true, true, Room.RoomType.KING);

        IllegalStateException exception = assertThrows(IllegalStateException.class, myRoom::checkIn);

        assertEquals("Room is not available", exception.getMessage());
    }

    @Test
    void cleanRoom_when_rooms_is_occupied_should_throw_an_exception() {
        Room myRoom = new Room(2, true, true, true, Room.RoomType.KING);

        IllegalStateException exception = assertThrows(IllegalStateException.class, myRoom::cleanRoom);

        assertEquals("Room is occupied", exception.getMessage());
    }

    @Test
    void punchTimeCard_when_first_called_should_update_start_time() {
        Employee clerk = new Employee(1, "Sponge Bob", "Front Desk", 10);

        LocalTime now = LocalTime.now();
        clerk.punchTimeCard(now);

        LocalTime result = clerk.startTime;

        assertEquals(now, result);

    }

    @Test
    void punchTimeCard_when_second_called_should_update_end_time() {
        Employee clerk = new Employee(1, "Sponge Bob", "Front Desk", 10);


        LocalTime first = LocalTime.of(8, 0);
        clerk.punchTimeCard(first);

        LocalTime second = first.plusHours(10); // 10 hours later
        clerk.punchTimeCard(second);

        LocalTime result = clerk.getEndTime();

        assertEquals(second, result);

    }

    @Test
    void getReservationTotal_reserving_king_for_one_night_not_weekend() {

        Reservation reservation = new Reservation(Room.RoomType.KING, 1, false);
        double expectedResult = 139;
        double result = reservation.getReservationTotal();

        assertEquals(expectedResult, result);

    }

    @Test
    void getReservationTotal_reserving_king_for_one_night_on_weekend_should_calculate() {

        Reservation reservation = new Reservation(Room.RoomType.KING, 1, true);
        double expectedResult = 152.9;
        double result = reservation.getReservationTotal();

        assertEquals(expectedResult, result);

    }

    @Test
    void getReservationTotal_reserving_basic_for_one_night_on_weekend_should_calculate() {

        Reservation reservation = new Reservation(Room.RoomType.DOUBLE, 1, true);
        double expectedResult = 136.4;
        double result = reservation.getReservationTotal();

        assertEquals(expectedResult, result);

    }

    @Test
    void getReservationTotal_reserving_basic_for_zero_night_on_weekend_should_throw_exception() {

        Reservation reservation = new Reservation(Room.RoomType.DOUBLE, 0, true);
        Exception exception = assertThrows(IllegalArgumentException.class, reservation::getReservationTotal);

        assertEquals("Number of nights must be greater than zero.", exception.getMessage());

    }
}