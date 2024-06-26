public class NonPerishableItem extends Item {
    private String brand;

    public NonPerishableItem(String itemId, String itemName, double price, int quantity, String brand) {
        super(itemId, itemName, price, quantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
