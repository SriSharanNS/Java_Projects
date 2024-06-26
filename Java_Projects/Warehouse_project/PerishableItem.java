public class PerishableItem extends Item {
    private String expirationDate;

    public PerishableItem(String itemId, String itemName, double price, int quantity, String expirationDate) {
        super(itemId, itemName, price, quantity);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
