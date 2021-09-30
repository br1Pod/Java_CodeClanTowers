import java.util.ArrayList;

public class Hotel {

    private ArrayList<BedRoom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<BedRoom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public ArrayList<BedRoom> getBedrooms() {
        return bedrooms;
    }

    public int getBedroomCount(){
        return this.bedrooms.size();
    }

    public void setBedrooms(ArrayList<BedRoom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public int getConferenceRoomsCount(){
        return this.conferenceRooms.size();
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void addBedroom(BedRoom bedRoom){
        this.bedrooms.add(bedRoom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

//    add guests to room

//    public void addGuestsToBedRoom(Guest guest, BedRoom bedRroom){
//        room.addGuestToRoom(guest);
//    }
}
