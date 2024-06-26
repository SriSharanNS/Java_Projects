package Java_Projects.Hotel_Reservation_system;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Add rooms to the hotel
        hotel.addRoom(new Room("101", "Single"));
        hotel.addRoom(new Room("102", "Double"));
        hotel.addRoom(new Room("103", "Suite"));

        // Create guests
        Guest guest1 = new Guest("G001", "Alice Johnson");
        Guest guest2 = new Guest("G002", "Bob Smith");

        // Make reservations
        hotel.makeReservation("R001", guest1, "Single");
        hotel.makeReservation("R002", guest2, "Double");
        hotel.makeReservation("R003", guest1, "Suite"); // Alice makes another reservation

        // List all reservations
        hotel.listReservations();
    }
}
