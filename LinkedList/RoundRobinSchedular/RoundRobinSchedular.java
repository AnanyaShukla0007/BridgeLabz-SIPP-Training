package LinkedList.RoundRobinSchedular;

public class RoundRobinSchedular {
    private Process head = null;
    private Process tail = null;
    private int totalProcesses = 0;
    private int currentTime = 0;

    // Add process at the end
    public void addProcess(String id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
        totalProcesses++;
    }

    // Remove process by ID
    public void removeProcess(String id) {
        if (head == null) return;

        Process current = head, prev = tail;

        do {
            if (current.processId.equals(id)) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else {
                    prev.next = current.next;
                    if (current == head) head = current.next;
                    if (current == tail) tail = prev;
                }
                totalProcesses--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Display current circular queue
    public void displayQueue() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("[" + temp.processId + ", RT: " + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Simulate round-robin execution
    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        currentTime = 0;
        Process current = head;

        while (totalProcesses > 0) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);
                currentTime += execTime;
                current.remainingTime -= execTime;

                // Update waiting and turnaround time for others
                Process temp = head;
                do {
                    if (!temp.processId.equals(current.processId) && temp.remainingTime > 0) {
                        temp.waitingTime += execTime;
                    }
                    temp = temp.next;
                } while (temp != head);

                if (current.remainingTime == 0) {
                    current.turnAroundTime = currentTime;
                    System.out.println("Process " + current.processId + " finished at time " + currentTime);
                    removeProcess(current.processId);
                    if (head == null) break;
                    current = current.next;
                } else {
                    current = current.next;
                }

                displayQueue();
            } else {
                current = current.next;
            }
        }

        // After simulation, print results
        System.out.println("\n--- Final Results ---");
        double totalWT = 0, totalTAT = 0;
        Process temp = head;
        if (head == null) {
            System.out.println("All processes executed.");
            return;
        }
        do {
            System.out.println("Process " + temp.processId + ": Waiting Time = " + temp.waitingTime +
                    ", Turnaround Time = " + temp.turnAroundTime);
            totalWT += temp.waitingTime;
            totalTAT += temp.turnAroundTime;
            temp = temp.next;
        } while (temp != head);

        int completed = totalProcesses;
        System.out.printf("Average Waiting Time: %.2f\n", totalWT / completed);
        System.out.printf("Average Turnaround Time: %.2f\n", totalTAT / completed);
    }
}

