import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom bedRoom;
    BedRoom bedRoom2;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel();
        bedRoom = new BedRoom(RoomType.SINGLE, 237);
        bedRoom2 = new BedRoom(RoomType.TWIN, 100);
        conferenceRoom = new ConferenceRoom(RoomType.MEETING, "Shark Room");
        guest = new Guest("Jack Torrance");
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedRoom);
        hotel.addBedroom(bedRoom2);
        assertEquals(2, hotel.getBedroomCount());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomsCount());
    }

    @Test
    public void canAddGuestsToRoom(){
        hotel.addBedroom(bedRoom);
        bedRoom.addGuestToRoom(guest);

        assertEquals(1, bedRoom.countGuestsInRoom());
    }
}
