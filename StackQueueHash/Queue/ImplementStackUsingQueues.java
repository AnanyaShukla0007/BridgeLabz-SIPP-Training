import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.top()); // 20
        stack.pop();
        System.out.println(stack.top()); // 10
    }
}