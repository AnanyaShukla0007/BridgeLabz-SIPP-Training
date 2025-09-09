package functionalInterface;
interface Vehicle {
 void displaySpeed(int speed);

 default void displayBattery(int percentage) {
     System.out.println("Battery info not available for this vehicle.");
 }
}
class Cars implements Vehicle {
 public void displaySpeed(int speed) {
     System.out.println("Car Speed: " + speed + " km/h");
 }
}

class ElectricCar implements Vehicle {
 public void displaySpeed(int speed) {
     System.out.println("Electric Car Speed: " + speed + " km/h");
 }

 @Override
 public void displayBattery(int percentage) {
     System.out.println("Battery: " + percentage + "% remaining.");
 }
}

public class SmartVehicleDashboard {
 public static void main(String[] args) {
     Vehicle car = new Cars();
     car.displaySpeed(80);
     car.displayBattery(0); 

     Vehicle tesla = new ElectricCar();
     tesla.displaySpeed(120);
     tesla.displayBattery(85);
 }
}
