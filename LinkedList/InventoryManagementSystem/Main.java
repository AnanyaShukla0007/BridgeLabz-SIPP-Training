package LinkedList.InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        InventorySystem inventory = new InventorySystem();

        inventory.addItemAtEnd("Laptop", "ID101", 10, 50000);
        inventory.addItemAtBeginning("Mouse", "ID102", 50, 500);
        inventory.addItemAtPosition("Keyboard", "ID103", 20, 800, 2);
        inventory.addItemAtEnd("Monitor", "ID104", 15, 7000);

        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        System.out.println("\nSearch by ID 'ID103':");
        inventory.searchById("ID103");

        System.out.println("\nSearch by Name 'Mouse':");
        inventory.searchByName("Mouse");

        System.out.println("\nUpdating Quantity of 'ID104' to 25:");
        inventory.updateQuantity("ID104", 25);

        System.out.println("\nInventory after Quantity Update:");
        inventory.displayInventory();

        System.out.println("\nTotal Inventory Value: ₹" + inventory.calculateTotalValue());

        System.out.println("\nSorting by Item Name (Ascending):");
        inventory.sortInventory("name", true);
        inventory.displayInventory();

        System.out.println("\nSorting by Price (Descending):");
        inventory.sortInventory("price", false);
        inventory.displayInventory();

        System.out.println("\nRemoving item with ID 'ID102':");
        inventory.removeItemById("ID102");
        inventory.displayInventory();
    }
}
