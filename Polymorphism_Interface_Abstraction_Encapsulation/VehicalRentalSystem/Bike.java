package VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate = 0.02;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance [Policy #" + maskPolicy() + "]";
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    private String maskPolicy() {
        return "*****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
