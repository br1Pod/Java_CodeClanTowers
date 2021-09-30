import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(RoomType.WEDDING, "Gretna Green" );
    }

    @Test
    public void getNameOfConferenceRoom(){
        assertEquals("Gretna Green", conferenceRoom.getRoomName());
    }


}
