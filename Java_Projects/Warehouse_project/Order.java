import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private Date orderDate;
    private List<Item> items;

    public Order(String orderId, Date orderDate, List<Item> items) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.items = items;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
