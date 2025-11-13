package FlightBookingApp;

public class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String msg) { super(msg); }
}