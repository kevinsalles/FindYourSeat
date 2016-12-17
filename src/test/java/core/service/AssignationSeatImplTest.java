package core.service;

import core.models.Seat;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Kévin on 2016-12-17.
 */
public class AssignationSeatImplTest {
    private AssignationSeat assignationSeat;

    @Before
    public void setup(){
        assignationSeat = new AssignationSeatImpl();
    }

    @Test
    public void whenIGetSeat_thenShouldHaveAListNotNull(){
        ArrayList<Seat> seats = assignationSeat.getAllSeat();
        assertNotNull(seats);
    }
}