import java.util.ArrayList;

public abstract class Room {

        private RoomType roomType;
        private ArrayList<Guest> guests;

        public Room(RoomType roomType) {
                this.roomType = roomType;
                this.guests = new ArrayList<>();
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

        public void addGuestToRoom(Guest guest){
                this.guests.add(guest);
        }

        public int countGuestsInRoom(){
                return this.guests.size();
        }
}

