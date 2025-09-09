package generics;

import java.util.*;
abstract class WarehouseItem {
	private String name;
	
	public WarehouseItem(String name){
		this.name = name;
		
		
	}
	public String getName() {
		return name;
	}
	public abstract void displayInfo() ;
	
}
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    public void displayInfo() {
        System.out.println("Electronics Item: " + getName());
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public void displayInfo() {
        System.out.println("Grocery Item: " + getName());
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public void displayInfo() {
        System.out.println("Furniture Item: " + getName());
    }
}

class Storage<T extends WarehouseItem>{
	private List<T> items = new ArrayList<>();
	public void addItem(T item) {
		items.add(item);
	}
	public List<T> getItems(){
		return items;
	}
	
}

class WarehouseUtil{
	public static void displayAllItems(List<? extends WarehouseItem> items) {
		for(WarehouseItem item : items) {
			item.displayInfo();
		}
	}
}
public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Smartphone"));
        electronicsStorage.addItem(new Electronics("Laptop"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Wheat"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

      
        System.out.println("Electronics: ");
        WarehouseUtil.displayAllItems(electronicsStorage.getItems());
 
        System.out.println("\nGroceries: ");
        WarehouseUtil.displayAllItems(groceriesStorage.getItems());

        System.out.println("\nFurniture: ");
        WarehouseUtil.displayAllItems(furnitureStorage.getItems());
    }
}