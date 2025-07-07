public class InventorySystem {
    private ItemNode head;

    // Add item at the beginning
    public void addItemAtBeginning(String name, String id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Add item at the end
    public void addItemAtEnd(String name, String id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Add item at specific position (1-based index)
    public void addItemAtPosition(String name, String id, int quantity, double price, int position) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        if (position <= 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove item by ID
    public void removeItemById(String id) {
        if (head == null) return;
        if (head.itemId.equals(id)) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && !temp.next.itemId.equals(id)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Update quantity by ID
    public void updateQuantity(String id, int newQuantity) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId.equals(id)) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    // Search by ID
    public void searchById(String id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId.equals(id)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    // Search by Name
    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No item with name " + name + " found.");
    }

    // Calculate total inventory value
    public double calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        return total;
    }

    // Display all items
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    // Helper: display a single item
    private void displayItem(ItemNode node) {
        System.out.println("Name: " + node.itemName + ", ID: " + node.itemId +
                           ", Quantity: " + node.quantity + ", Price: " + node.price);
    }

    // Sort inventory by Name or Price in ascending or descending order
    public void sortInventory(String sortBy, boolean ascending) {
        head = mergeSort(head, sortBy, ascending);
    }

    // Merge Sort on Linked List
    private ItemNode mergeSort(ItemNode node, String sortBy, boolean ascending) {
        if (node == null || node.next == null) return node;

        ItemNode mid = getMiddle(node);
        ItemNode nextOfMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(node, sortBy, ascending);
        ItemNode right = mergeSort(nextOfMid, sortBy, ascending);

        return merge(left, right, sortBy, ascending);
    }

    private ItemNode merge(ItemNode a, ItemNode b, String sortBy, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (sortBy.equalsIgnoreCase("name")) {
            condition = ascending ? a.itemName.compareToIgnoreCase(b.itemName) < 0 :
                                    a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = ascending ? a.price < b.price : a.price > b.price;
        }

        if (condition) {
            a.next = merge(a.next, b, sortBy, ascending);
            return a;
        } else {
            b.next = merge(a, b.next, sortBy, ascending);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode node) {
        if (node == null) return node;

        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
