
abstract class Checkpoint {
    String id, name;
    double distance;
    int expected, actual;

    Checkpoint(String id, String name, double distance, int expected, int actual) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.expected = expected;
        this.actual = actual;
    }

    boolean isDelayed() {
        return actual > expected;
    }

    abstract boolean isCritical();

    abstract String getType();
    abstract double penalty();

    public String toString() {
        return getType() + " - " + name + " - " + (isDelayed() ? "Delayed" : "On Time")
                + " - Penalty: " + penalty();
    }
}

class DeliveryCheckpoint extends Checkpoint {
    DeliveryCheckpoint(String id, String n, double d, int e, int a) {
        super(id, n, d, e, a);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "DeliveryCheckpoint";
    }

    double penalty() {
        return isDelayed() ? (actual - expected) * 2.0 : 0;
    }
}

class FuelCheckpoint extends Checkpoint {
    FuelCheckpoint(String id, String n, double d, int e, int a) {
        super(id, n, d, e, a);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "FuelCheckpoint";
    }

    double penalty() {
        return isDelayed() ? 10 : 0;
    }
}

class RestCheckpoint extends Checkpoint {
    RestCheckpoint(String id, String n, double d, int e, int a) {
        super(id, n, d, e, a);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "RestCheckpoint";
    }

    double penalty() {
        return isDelayed() ? (actual - expected) * 0.5 : 0;
    }
}


class RouteLinkedList<T extends Checkpoint> { // linkedlist
    static class Node<U> {
        U data;
        Node<U> next;

        Node(U data) {
            this.data = data;
        }
    }

    Node<T> head;

    void add(T c) {
        if (head == null)
            head = new Node<>(c);
        else {
            Node<T> t = head;
            while (t.next != null)
                t = t.next;
            t.next = new Node<>(c);
        }
    }

    double totalDistance() {
        double sum = 0;
        for (Node<T> t = head; t != null; t = t.next)
            sum += t.data.distance;
        return sum;
    }
    double totalPenalty() {
        double sum = 0;
        for (Node<T> t = head; t != null; t = t.next)
            sum += t.data.penalty();
        return sum;
    }
    void printRoute() {
        int i = 1;
        for (Node<T> t = head; t != null; t = t.next, i++)
            System.out.println(i + ". " + t.data);
    }
    boolean hasDelivery() {
        for (Node<T> t = head; t != null; t = t.next) {
            if (t.data instanceof DeliveryCheckpoint) {
                return true;
            }
        }
        return false;
    }
    boolean hasFuel() {
        for (Node<T> t = head; t != null; t = t.next)
            if (t.data instanceof FuelCheckpoint)
                return true;
        return false;
    }
}

class Driver { // driver
    String id, name;
    final RouteLinkedList<Checkpoint> route = new RouteLinkedList<>();

    Driver(String i, String n) {
        id = i;
        name = n;
    }

    void summary() {
        System.out.println("Driver: " + id + " - " + name);
        System.out.println("Route Summary:");
        route.printRoute();
        double dist = route.totalDistance(), pen = route.totalPenalty();
        System.out.println("Total Distance: " + dist + " km");
        System.out.println("Total Penalty: " + pen);
        System.out.println("Route Score: " + (dist - pen));
        System.out.println("Critical Route Check: "
                + (route.hasDelivery() && route.hasFuel() ? "All required checkpoints present"
                        : "Missing critical checkpoints"));
    }
}


public class RouteTrackingSystem {
    public static void main(String[] args) {
        Driver d = new Driver("D1007", "Madhav");
        d.route.add(new DeliveryCheckpoint("C1", "Warehouse A", 35, 30, 40)); // penalty 20
        d.route.add(new FuelCheckpoint("C2", "Pump 12", 25, 15, 15)); // penalty 0
        d.route.add(new RestCheckpoint("C3", "Motel X", 20, 60, 65)); // penalty 2.5
        d.route.add(new DeliveryCheckpoint("C4", "Client Hub", 40, 45, 60)); // penalty 30
        d.summary();
    }
}
