class Vehicle {
    static int registrationFee = 1000;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    void displayVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Reg No: " + registrationNumber);
            System.out.println("Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH12AB1234", "Alvangi", "Bike");
        v1.displayVehicle();
        Vehicle.updateRegistrationFee(1200);
    }
}