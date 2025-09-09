package service;

public interface TransportService {
    String getServiceName();
    double getFare();
    boolean isAvailable();

    default void printServiceDetails() {
        System.out.println("Service: " + getServiceName() + ", Fare: " + getFare());
    }

}
