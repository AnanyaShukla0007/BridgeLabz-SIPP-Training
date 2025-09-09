package dashboard;

import service.TransportService;
import java.util.List;

public class Dashboard {
    public void display(List<TransportService> services) {
        services.forEach(TransportService::printServiceDetails);
    }
}