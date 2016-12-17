package persist;

import core.models.Seat;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SeatRepositoryImplTest {

    private final static int FIRST_ELEMENT = 0;

    private SeatRepository seatRepository;

    @Mock
    private Seat seatMock;

    @Before
    public void setup(){
        seatRepository = new SeatRepositoryImpl();
    }

    @Test
    public void givenASeat_whenIPersist_thenItSaved(){
        seatRepository.persist(seatMock);
    }

    @Test
    public void whenIGetAllSeat_thenShouldListNotEmpty(){
        ArrayList<Seat> seats = seatRepository.getAllSeats();
        assertNotNull(seats);
    }

    @Test
    public void givenASeat_whenIGetAllSeat_thenReturnASeat(){
        seatRepository.persist(seatMock);
        ArrayList<Seat> seats = seatRepository.getAllSeats();
        assertEquals(seatMock,seats.get(FIRST_ELEMENT));
    }

}