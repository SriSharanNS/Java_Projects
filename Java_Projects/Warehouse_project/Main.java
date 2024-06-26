import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add Suppliers
        Supplier supplier1 = new Supplier("S001", "Supplier One", "contact@supplierone.com");
        inventory.addSupplier(supplier1);

        // Add Items
        Item item1 = new PerishableItem("I001", "Milk", 2.5, 100, "2024-07-01");
        Item item2 = new NonPerishableItem("I002", "Soap", 1.5, 200, "BrandX");
        Item item3 = new NonPerishableItem("I003", "cream", 4.5, 400, "jacks");

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        // Create Order
        Order order1 = new Order("O001", new Date(), Arrays.asList(item1, item2));
        inventory.addOrder(order1);

        // Display Items
        System.out.println("Items in Inventory:");
        for (Item item : inventory.getItems()) {
            System.out.println(item.getItemName() + " - " + item.getQuantity() + " units");
        }

        // Find and display a specific item
        Item foundItem = inventory.findItemById("I001");
        if (foundItem != null) {
            System.out.println("Found Item: " + foundItem.getItemName());
        } else {
            System.out.println("Item not found.");
        }
    }
}
