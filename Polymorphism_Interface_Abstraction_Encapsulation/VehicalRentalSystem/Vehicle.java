package VehicleRentalSystem;

public abstract class Vehicle {
	private String vehicleNumber;
	private String type;
	private double rentalRate;
	
	public Vehicle(String vehicleNumber,String type,double rentalRate) {
		this.vehicleNumber=vehicleNumber;
		this.type=type;
		this.rentalRate=rentalRate;
	}
	
	public abstract double calculateRentalCost(int days);
	
	public void displayDetails() {
		System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: ₹" + rentalRate + "/day");

	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public String getType() {
		return type;
	}
	public double getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(double rentalRate) {
		this.rentalRate=rentalRate;
	}
}
