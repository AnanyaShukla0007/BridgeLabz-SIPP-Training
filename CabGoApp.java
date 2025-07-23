package JavaProblems;

public class CabGoApp {
    public static void main(String[] args) {
        Driver driver = new Driver("Ravi", "MH12AB1234", 4.7);
        Vehicle mini = new Mini("KA01AA1234", 4);
        RideService ride = new RideService(mini, driver);

        ride.bookRide("Koramangala", "MG Road", 10);
        System.out.println("Fare: ₹" + ride.getFare());
        ride.endRide();
    }
}


interface IRideService {
    void bookRide(String startLocation, String endLocation, double distance);
    void endRide();
}

abstract class Vehicle {
    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public abstract double getRatePerKm();
}


class Mini extends Vehicle {
    public Mini(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Mini");
    }

    @Override
    public double getRatePerKm() {
        return 10;
    }
}

class Sedan extends Vehicle {
    public Sedan(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "Sedan");
    }

    @Override
    public double getRatePerKm() {
        return 15;
    }
}

class SUV extends Vehicle {
    public SUV(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity, "SUV");
    }

    @Override
    public double getRatePerKm() {
        return 20;
    }
}



class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public double getRating() {
        return rating;
    }
}


class RideService implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    private String startLocation;
    private String endLocation;
    private double distance;
    private double fare;
    private final double baseFare = 30;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(String startLocation, String endLocation, double distance) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
        this.fare = baseFare + distance * vehicle.getRatePerKm();

        System.out.println("Ride booked with " + driver.getName() + " in a " + vehicle.type + ".");
        System.out.println("From: " + startLocation + " To: " + endLocation);
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended at " + endLocation);
    }

    public double getFare() {
        return fare;
    }
}
