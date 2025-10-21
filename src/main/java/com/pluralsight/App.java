package com.pluralsight;

import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Room myRoom = new Room(2, false, false, true, Room.RoomType.KING);
        System.out.println(myRoom);

        Reservation reservation = new Reservation(myRoom.getRoomType(), 3, true);
        System.out.println(reservation.getReservationTotal());

        Employee clerk = new Employee(1, "Sponge Bob", "Front Desk", 10);
        System.out.println(clerk.getTotalPay());

//        clerk.punchIn(LocalTime.of(10, 45));
//
//        clerk.punchOut(LocalTime.of(18, 45));

        clerk.punchTimeCard(LocalTime.of(10, 45));

        clerk.punchTimeCard(LocalTime.of(18, 55));

        clerk.punchTimeCard(LocalTime.of(8, 5));

        clerk.punchTimeCard(LocalTime.of(18, 30));


    }
}
