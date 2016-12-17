package persist;

import core.models.Seat;

import java.util.ArrayList;

/**
 * Created by Kévin on 2016-12-17.
 */
public class SeatRepositoryImpl implements SeatRepository {

    ArrayList<Seat> seats = new ArrayList<Seat>();

    public void persist(Seat seat) {
        seats.add(seat);
    }

    public ArrayList<Seat> getAllSeats() {
        return seats;
    }
}
