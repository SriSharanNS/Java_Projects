package Java_Projects.Hotel_Reservation_system;

public class Room {
    private String roomNumber;
    private String roomType;
    private boolean isAvailable;

    public Room(String roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + roomType + ")";
    }
}
