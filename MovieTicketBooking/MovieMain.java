package MovieTicketBooking;

public class MovieMain {
    public static void main(String[] args) {
        MovieBooking mb = new MovieBooking();
        try {
            mb.book(5);
            mb.book(5); // will throw
        } catch (InvalidSeatException | SeatAlreadyBookedException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
