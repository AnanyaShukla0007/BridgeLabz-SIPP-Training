package analytics;

import model.Passenger;
import model.Trip;

import java.util.*;
import java.util.stream.*;

public class RevenueAnalytics {
    public static void analyze(List<Passenger> passengers, List<Trip> trips) {
       
        Map<String, List<Passenger>> byRoute = passengers.stream()
                .collect(Collectors.groupingBy(Passenger::getRoute));

        
        Map<Boolean, List<Trip>> peakTrips = trips.stream()
                .collect(Collectors.partitioningBy(Trip::isPeakTime));

        
        DoubleSummaryStatistics stats = trips.stream()
                .collect(Collectors.summarizingDouble(Trip::getFare));

        System.out.println("Revenue by Route: " + byRoute);
        System.out.println("Peak Trips: " + peakTrips.get(true).size());
        System.out.println("Total Revenue: " + stats.getSum() + ", Avg Fare: " + stats.getAverage());
    }
}