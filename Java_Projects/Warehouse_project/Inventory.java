import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;
    private List<Supplier> suppliers;
    private List<Order> orders;

    public Inventory() {
        this.items = new ArrayList<>();
        this.suppliers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String itemId) {
        items.removeIf(item -> item.getItemId().equals(itemId));
    }

    public Item findItemById(String itemId) {
        for (Item item : items) {
            if (item.getItemId().equals(itemId)) {
                return item;
            }
        }
        return null;
    }

    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public Supplier findSupplierById(String supplierId) {
        for (Supplier supplier : suppliers) {
            if (supplier.getSupplierId().equals(supplierId)) {
                return supplier;
            }
        }
        return null;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
