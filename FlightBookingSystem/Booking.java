package FlightBookingSystem;

public class Booking {
	String passengerName;
	Flight flight;
	
	public Booking(String passengerName,Flight flight) {
		this.passengerName=passengerName;
		this.flight=flight;
	}
	
	public void displayBooking() {
		System.out.println("Passenger "+passengerName+" ");
		flight.displayFlight();
	}
	
}
