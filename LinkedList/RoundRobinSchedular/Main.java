package LinkedList.RoundRobinSchedular;

public class Main {
    public static void main(String[] args) {
        RoundRobinSchedular scheduler = new RoundRobinSchedular();

        // Add processes
        scheduler.addProcess("P1", 6, 1);
        scheduler.addProcess("P2", 4, 2);
        scheduler.addProcess("P3", 9, 3);
        scheduler.addProcess("P4", 5, 2);

        int timeQuantum = 3;
        System.out.println("Starting Round-Robin Scheduling with Time Quantum = " + timeQuantum + "\n");
        scheduler.displayQueue();
        scheduler.simulateRoundRobin(timeQuantum);
    }
}

