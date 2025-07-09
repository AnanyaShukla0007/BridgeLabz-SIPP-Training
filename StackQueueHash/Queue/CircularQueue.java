public class CircularQueue {
    private int[] data;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = this.rear = this.size = 0;
    }

    public boolean enqueue(int val) {
        if (isFull()) return false;
        data[rear] = val;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public boolean dequeue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return data[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.peek()); 
        q.dequeue();
        System.out.println(q.peek()); 
    }
}