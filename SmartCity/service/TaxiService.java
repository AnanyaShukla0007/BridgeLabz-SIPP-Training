package service;

public class TaxiService implements TransportService {
    @Override
    public String getServiceName() {
        return "Taxi";
    }

    @Override
    public double getFare() {
        return 70;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
