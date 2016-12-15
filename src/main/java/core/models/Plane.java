package core.models;

import java.util.ArrayList;

public class Plane {
    private ArrayList<Seat> seats;

    public Plane(){
        this.seats = new ArrayList<Seat>();
    }

    public Plane(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public ArrayList<Seat> getAllSeat() {
        return seats;
    }
}
