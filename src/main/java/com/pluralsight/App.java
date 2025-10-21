package com.pluralsight;

import java.time.Duration;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Room myRoom = new Room(2, false, false, true, Room.RoomType.KING);
        System.out.println(myRoom);

        Reservation reservation = new Reservation(myRoom.getRoomType(), 3, true);
        System.out.println(reservation.getReservationTotal());

        Employee clerk = new Employee(1, "Sponge Bob", "Front Desk", 10);
        System.out.println(clerk.getTotalPay());

        clerk.punchTimeCard(LocalTime.now());

        Duration duration = Duration.ofHours(8);

        clerk.punchTimeCard(LocalTime.now().plus(duration));


    }
}
