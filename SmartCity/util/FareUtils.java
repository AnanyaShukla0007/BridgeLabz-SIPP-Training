package util;

import model.Trip;

public class FareUtils {
    public static double calculateFare(Trip trip) {
        return trip.getFare() * (trip.isPeakTime() ? 1.5 : 1.0);
    }
}