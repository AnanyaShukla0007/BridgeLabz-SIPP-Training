interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

}

public class UnitConversion {
    public static void main(String[] args) {
        System.out.println("10 km = " + UnitConverter.kmToMiles(10) + " miles");
        System.out.println("6.21 miles = " + UnitConverter.milesToKm(6.21) + " km");
        System.out.println("5 kg = " + UnitConverter.kgToLbs(5) + " lbs");

    }
}
