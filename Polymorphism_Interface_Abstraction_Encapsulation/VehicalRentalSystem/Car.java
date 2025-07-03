package VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {
	private String insurancePolicyNumber;
	private double insuranceRate=0.05;
	
	public Car(String vehicleNumber, double rentalRate,String insurancePolicyNumber) {
		super(vehicleNumber, "Car", rentalRate);
		this.insurancePolicyNumber=insurancePolicyNumber;
	}
	

	@Override
	public double calculateInsurance() {
		// TODO Auto-generated method stub
		return calculateRentalCost(1)*insuranceRate;
	}

	@Override
	public String getInsuranceDetails() {
		// TODO Auto-generated method stub
		return "Car Insurance [Policy #"+maskPolicy()+"]";
	}

	@Override
	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return getRentalRate()*days;
	}
	private String maskPolicy() {
		return "*****"+insurancePolicyNumber.substring(insurancePolicyNumber.length()-4);
	}

}
