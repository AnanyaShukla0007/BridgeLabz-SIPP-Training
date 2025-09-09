package util;

import model.Location;

public interface GeoUtils {
    static double calculateDistance(Location a, Location b) {
        // Euclidean distance (for simplicity; not accurate for real-world coordinates)
        double latDiff = a.getLatitude() - b.getLatitude();
        double lonDiff = a.getLongitude() - b.getLongitude();
        return Math.sqrt(Math.pow(latDiff, 2) + Math.pow(lonDiff, 2));
    }
}