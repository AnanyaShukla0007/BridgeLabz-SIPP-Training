package functionalInterface;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = temp -> temp > 37.5;

        double[] readings = {36.5, 37.0, 38.2, 39.0, 36.8};

        for (double temp : readings) {
            if (isHighTemp.test(temp)) {
                System.out.println("ALERT: High temperature detected -> " + temp);
            } else {
                System.out.println("Normal temperature -> " + temp);
            }
        }
    }
}