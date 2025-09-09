import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class HospitalApp {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal!"),
            new Alert("Normal", "Scheduled check-up reminder."),
            new Alert("Emergency", "Patient requires immediate attention!"),
            new Alert("Info", "New hospital policy update.")
        );

        
        Predicate<Alert> criticalFilter = alert -> alert.type.equals("Critical") || alert.type.equals("Emergency");

        System.out.println("Filtered Alerts:");
        alerts.stream()
              .filter(criticalFilter)
              .forEach(System.out::println);
    }
}