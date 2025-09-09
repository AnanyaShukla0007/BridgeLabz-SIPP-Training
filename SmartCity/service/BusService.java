package service;

public class BusService implements TransportService {
    @Override
    public String getServiceName() {
        return "Bus";
    }

    @Override
    public double getFare() {
        return 15;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}