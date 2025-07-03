package VehicleRentalSystem;

public class Truck extends Vehicle {

	public Truck(String vehicleNumber,double rentalRate) {
		super(vehicleNumber,"Truck", rentalRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return getRentalRate()*days*1000;
	}
	

}
