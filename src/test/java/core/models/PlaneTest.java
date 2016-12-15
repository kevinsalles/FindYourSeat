package core.models;

import core.models.Plane;
import core.models.Seat;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class PlaneTest {
    private final static int FIVE_SEATS = 5;

    private Plane plane;
    private ArrayList<Seat>seats;

    @Before
    public void setUp(){
        createListOfSeat(FIVE_SEATS);
        createPlane();
    }

    @Test
    public void givenAPlane_whenICreateAPlane_thenShouldCreate(){
        plane = new Plane();
        assertNotNull(plane);
    }

    @Test
    public void givenAPlane_whenGetSeat_thenShouldHaveEmptySeatCollection(){
        plane = new Plane();
        seats = plane.getAllSeat();
        assertTrue(seats.isEmpty());
    }

    @Test
    public void givenAPlaneWithSeatList_whenICreateAPlane_thenListShouldNotEmpty(){
        assertFalse(seats.isEmpty());
    }

    private void createPlane(){
        plane = new Plane(seats);
    }

    private void createListOfSeat(int NumberOfSeat){
        seats = new ArrayList<Seat>();
        for(int i = 0;i<=NumberOfSeat;i++){
            seats.add(mock(Seat.class));
        }
    }

}