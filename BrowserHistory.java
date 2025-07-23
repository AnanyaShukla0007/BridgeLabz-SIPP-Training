class Node {
    String url;
    Node prev;
    Node next;

    Node(String url) {
        this.url = url;
    }
}

public class BrowserHistory {
    private Node current;

    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }

    public void visit(String url) {
        Node newNode = new Node(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    public String back(int steps) {
        while (steps-- > 0 && current.prev != null) {
            current = current.prev;
        }
        return current.url;
    }

    public String forward(int steps) {
        while (steps-- > 0 && current.next != null) {
            current = current.next;
        }
        return current.url;
    }

    public String getCurrentPage() {
        return current.url;
    }

    public void printHistory() {
        Node temp = current;
        while (temp.prev != null) temp = temp.prev;

        while (temp != null) {
            if (temp == current) System.out.print("[" + temp.url + "]");
            else System.out.print(temp.url);
            temp = temp.next;
            if (temp != null) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory("home.com");

        history.visit("youtube.com");
        history.visit("github.com");
        history.visit("openai.com");

        history.printHistory(); 

        System.out.println("Back to: " + history.back(2)); 
        history.printHistory();

        System.out.println("Forward to: " + history.forward(1)); 
        history.printHistory();

        history.visit("leetcode.com");
        history.printHistory();
    }
}
