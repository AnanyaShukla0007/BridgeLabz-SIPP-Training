package FlightBookingSystem;
import java.util.*;
public class FlightBookingSystem {
	static Flight[] flights= {new Flight("AI 101","Delhi","Mumbai",4500),
							new Flight("AI 102","Delhi","Lucknow",4300),
							new Flight("AI 103","Delhi","Kolkata",3600),
							new Flight("AI 104","Bengluru","Chandigarh",8400),
							new Flight("AI 107","Dhabad","Goa",7800)
			                };
	static List<Booking> bookings=new ArrayList<>();
	public static void searchFlight(String origin,String Destination) {
		boolean found=false;
		for(Flight flight:flights) {
			if(flight.origin.equalsIgnoreCase(origin) && flight.destination.equalsIgnoreCase(Destination)) {
				flight.displayFlight();
				found=true;
			}
		}
		if(!found) {
			System.out.print("No flight has been found");
		}
	}
	public static void BookFlight(String passengerName,String flightNumber) {
		for(Flight flight:flights) {
			if(flight.flightNumber.equalsIgnoreCase(flightNumber)) {
				bookings.add(new Booking(passengerName,flight));
				System.out.println("Booking is succesfull for: "+passengerName);
				return ;
			}
		}
		System.out.println("Flight is not find with number:"+flightNumber);
	}
	public static void displayBookings() {
		if(bookings.isEmpty()) {
			System.out.println("No Booking found");
		}
		else {
			for(Booking booking:bookings) {
				booking.displayBooking();
				System.out.println("==============================================================================================================================================");
				
			}
		}
	}
 
}
