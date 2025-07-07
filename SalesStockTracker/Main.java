package SalesStockTracker;

public class Main {
    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();

        System.out.println("Initial Tracking:");
        tracker.displayTracking();

        System.out.println("\nAdding Checkpoint after 'In Transit':");
        tracker.addCheckpointAfter("In Transit", "Warehouse Handover");
        tracker.displayTracking();

        System.out.println("\nSimulating Lost Parcel after 'Warehouse Handover':");
        tracker.simulateLostParcelAfter("Warehouse Handover");
        tracker.displayTracking();

        System.out.println("\nTrying to add checkpoint after lost stage:");
        tracker.addCheckpointAfter("Delivered", "Customer Confirmation");
    }
}

