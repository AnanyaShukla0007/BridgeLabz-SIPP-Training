package VehicleRentalSystem;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		List<Vehicle>fleet=new ArrayList<>();
		fleet.add(new Car("MH12AB1232",2000,"CARPOL123456"));
		fleet.add(new Bike("DL10XY7890", 500, "BIKEPOL987654"));
        fleet.add(new Truck("GJ05TR4567", 3000));
        
        int rentalDays=3;
        for(Vehicle v:fleet) {
        	v.displayDetails();
        	double rentalCost=v.calculateRentalCost(rentalDays);
        	System.out.println("Rental Cost for "+rentalDays+"days: ₹"+rentalCost);
        	
        	if(v instanceof Insurable) {
        		Insurable insurable=(Insurable)v;
        		System.out.println(insurable.getInsuranceDetails());
        		System.out.println("Insurance Cost: ₹"+insurable.calculateInsurance());
        	}
        	else {
        		System.out.println("No insurance Applicable");
        	}
        }
	}
}
