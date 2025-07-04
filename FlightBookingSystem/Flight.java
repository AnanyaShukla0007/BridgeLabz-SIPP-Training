package FlightBookingSystem;

public class Flight {
	String flightNumber;
	String origin;
	String destination;
	double price;
	
	public Flight(String flightNumber,String origin,String destination,double price) {
		this.flightNumber=flightNumber;
		this.origin=origin;
		this.destination=destination;
		this.price=price;
	}
	
	public void displayFlight() {
		System.out.println("Flight: "+flightNumber+" From "+origin+" To "+destination+" Price$ "+price);
	}
	
}
