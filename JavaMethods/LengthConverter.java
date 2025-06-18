public class LengthConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double m) {
        return m * 3.28084;
    }

    public static double convertFeetToMeters(double ft) {
        return ft * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println(convertKmToMiles(10));
        System.out.println(convertMilesToKm(6.2));
        System.out.println(convertMetersToFeet(100));
        System.out.println(convertFeetToMeters(328));
    }
}
