package model;

public class Passenger {
    private String name;
    private String route;
    private double fare;

    public Passenger(String name, String route, double fare) {
        this.name = name;
        this.route = route;
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
