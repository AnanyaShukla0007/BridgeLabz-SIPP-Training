package service;

public class MetroService implements TransportService {
    @Override
    public String getServiceName() {
        return "Metro";
    }

    @Override
    public double getFare() {
        return 25;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
