package LinkedList.RoundRobinSchedular;

class Process {
    String processId;
    int burstTime;
    int priority;
    int remainingTime;
    int waitingTime = 0;
    int turnAroundTime = 0;

    Process next;

    public Process(String processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
