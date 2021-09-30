import java.util.ArrayList;

public abstract class Room {

        private RoomType roomType;
        private ArrayList<Guest> guests;

        public Room(RoomType roomType) {
                this.roomType = roomType;
        }

        public RoomType getRoomType() {
                return roomType;
        }

        public void setRoomType(RoomType roomType) {
                this.roomType = roomType;
        }

        public int getCapacityFromEnum(){
                return this.roomType.getCapacity();
        }
}

