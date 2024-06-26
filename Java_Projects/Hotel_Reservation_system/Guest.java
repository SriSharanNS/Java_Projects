package Java_Projects.Hotel_Reservation_system;

public class Guest {
    private String guestId;
    private String name;

    public Guest(String guestId, String name) {
        this.guestId = guestId;
        this.name = name;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (ID: " + guestId + ")";
    }
}
