package FlightBookingApp;

import OnlineOrder.PaymentFailedException;

public class FlightBooking {
 public void checkSeatAvailability() throws SeatUnavailableException {
     if (Math.random() < 0.5) throw new SeatUnavailableException("No seats available on this flight.");
 }

 public void processPayment() throws PaymentFailedException {
     if (Math.random() < 0.5) throw new PaymentFailedException("Payment authorization failed.");
 }

 public void bookTicket() throws Exception {
     checkSeatAvailability();
     processPayment();
     System.out.println("Flight ticket booked!");
 }
}
