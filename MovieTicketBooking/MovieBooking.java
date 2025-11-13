package MovieTicketBooking;

import java.util.HashMap;
import java.util.Map;

public class MovieBooking {
    private final Map<Integer, Boolean> seats = new HashMap<>();

    public MovieBooking() {
        for (int i = 1; i <= 30; i++) seats.put(i, false); // false = available
    }

    public void book(int seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        Boolean status = seats.get(seatNo);
        if (status == null) throw new InvalidSeatException("Seat " + seatNo + " does not exist.");
        if (status) throw new SeatAlreadyBookedException("Seat " + seatNo + " is already booked.");
        seats.put(seatNo, true);
        System.out.println("Seat " + seatNo + " booked successfully!");
    }
}