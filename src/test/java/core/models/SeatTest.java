package core.models;

import core.models.Seat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeatTest {
    @Before
    public void setUp(){

    }

    @Test
    public void givenASeat_whenICreateASeat_thenShouldCreated(){
        Seat seat = new Seat();
        assertNotNull(seat);
    }

}