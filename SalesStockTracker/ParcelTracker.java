package SalesStockTracker;

public class ParcelTracker {
    private ParcelStage head;

    // Initialize with default stages
    public ParcelTracker() {
        head = new ParcelStage("Packed");
        addStage("Shipped");
        addStage("In Transit");
        addStage("Delivered");
    }

    // Add stage at the end
    public void addStage(String stageName) {
        ParcelStage newStage = new ParcelStage(stageName);
        if (head == null) {
            head = newStage;
            return;
        }
        ParcelStage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    // Add custom checkpoint after a specific stage
    public void addCheckpointAfter(String afterStage, String checkpointName) {
        ParcelStage temp = head;
        while (temp != null && !temp.stageName.equals(afterStage)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Stage \"" + afterStage + "\" not found.");
            return;
        }

        ParcelStage checkpoint = new ParcelStage(checkpointName);
        checkpoint.next = temp.next;
        temp.next = checkpoint;
    }

    // Display full parcel tracking
    public void displayTracking() {
        if (head == null) {
            System.out.println("No tracking info available (possibly lost parcel).");
            return;
        }
        ParcelStage temp = head;
        while (temp != null) {
            System.out.print(temp.stageName);
            if (temp.next != null) System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Simulate a lost parcel (manually break the chain)
    public void simulateLostParcelAfter(String stageName) {
        ParcelStage temp = head;
        while (temp != null && !temp.stageName.equals(stageName)) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.next = null;
            System.out.println("Simulated lost parcel after: " + stageName);
        } else {
            System.out.println("Stage not found.");
        }
    }
}
