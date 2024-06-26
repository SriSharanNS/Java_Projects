package Java_Projects.Hotel_Reservation_system;

public class Reservation {
    private String reservationId;
    private Guest guest;
    private Room room;

    public Reservation(String reservationId, Guest guest, Room room) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.room = room;
        this.room.setAvailable(false);
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId + "\nGuest: " + guest + "\nRoom: " + room;
    }
}
