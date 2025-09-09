package service;

public class AmbulanceService implements TransportService {
    @Override
    public String getServiceName() {
        return "Ambulance";
    }

    @Override
    public double getFare() {
        return 0.0;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
