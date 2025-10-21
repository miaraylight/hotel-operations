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

        clerk.punchTimeCard(LocalTime.now());
        Duration duration = Duration.ofHours(10);
        clerk.punchTimeCard(LocalTime.now().plus(duration));

        System.out.println("Total pay: " + clerk.getTotalPay() + "$");

    }
}
