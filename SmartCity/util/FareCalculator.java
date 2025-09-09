package util;

import model.Trip;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(Trip trip);
}
