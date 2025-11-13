package FlightBookingApp;

import OnlineOrder.PaymentFailedException;

public class FlightMain {
 public static void main(String[] args) {
     FlightBooking fb = new FlightBooking();
     try {
         fb.bookTicket();
     } catch (SeatUnavailableException e) {
         System.out.println("Booking failed: " + e.getMessage());
     } catch (PaymentFailedException e) {
         System.out.println("Booking failed: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
     } finally {
         System.out.println("Thank you for booking with us!");
     }
 }
}
