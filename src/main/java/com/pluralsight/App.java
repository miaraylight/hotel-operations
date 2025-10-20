package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Room myRoom = new Room(2, false, false, true, Room.RoomType.KING);
        System.out.println(myRoom);

        Reservation reservation = new Reservation(myRoom.getRoomType(), 3, true);
        System.out.println(reservation.getReservationTotal());

        Employee clerk = new Employee(1, "Sponge Bob", "Front Desk", 10, 60);
        System.out.println(clerk.getTotalPay());
    }
}
