package model;

public class Trip {
    private String route;
    private double fare;
    private boolean peakTime;

    public Trip(String route, double fare, boolean peakTime) {
        this.route = route;
        this.fare = fare;
        this.peakTime = peakTime;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public boolean isPeakTime() {
        return peakTime;
    }

    public void setPeakTime(boolean peakTime) {
        this.peakTime = peakTime;
    }
}
