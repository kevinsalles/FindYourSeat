package core.service;

import core.models.Seat;
import persist.SeatRepository;
import persist.SeatRepositoryImpl;

import java.util.ArrayList;

public class AssignationSeatImpl implements AssignationSeat {

    SeatRepository seatRepository = new SeatRepositoryImpl();

    public ArrayList<Seat> getAllSeat() {
        return seatRepository.getAllSeats();
    }
}
