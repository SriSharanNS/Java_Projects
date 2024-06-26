package Java_Projects.Hotel_Reservation_system;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel() {
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room findAvailableRoom(String roomType) {
        for (Room room : rooms) {
            if (room.getRoomType().equals(roomType) && room.isAvailable()) {
                return room;
            }
        }
        return null;
    }

    public void makeReservation(String reservationId, Guest guest, String roomType) {
        Room room = findAvailableRoom(roomType);
        if (room != null) {
            Reservation reservation = new Reservation(reservationId, guest, room);
            reservations.add(reservation);
            System.out.println("Reservation successful!");
        } else {
            System.out.println("No available rooms of type " + roomType);
        }
    }

    public void listReservations() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}
