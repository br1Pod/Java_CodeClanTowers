public class BedRoom extends Room {

    private int roomNumber;

    public BedRoom(RoomType roomType, int roomNumber) {
        super(roomType);
        this.roomNumber = roomNumber;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
