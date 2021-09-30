import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    BedRoom bedroom;

    @Before
    public void before(){
        bedroom = new BedRoom(RoomType.TWIN, 2);
    }

    @Test
    public void getRoomNumber(){
        assertEquals(2, bedroom.getRoomNumber());
    }

    @Test
    public void checkRoomIsTwin(){
        assertEquals(RoomType.TWIN, bedroom.getRoomType());
    }

    @Test
    public void checkCapacityOfTwinRoom(){
        assertEquals(2, bedroom.getCapacityFromEnum());
    }
}
