package persist;

import core.models.Seat;

import java.util.ArrayList;

/**
 * Created by Kévin on 2016-12-17.
 */
public interface SeatRepository {
    void persist(Seat seat);
    ArrayList<Seat> getAllSeats();
}
