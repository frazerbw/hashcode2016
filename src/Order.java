import java.util.ArrayList;

public class Order {
	// Variable definition
    private ArrayList<Product> items;
    private Point deliveryAddress;
    private boolean fulfilled;

    public Order(ArrayList<Product> items, Point deliveryAddress) {
        this.items = items;
        this.deliveryAddress = deliveryAddress;
        this.fulfilled = false;
    }
    // Get delivery location
    public Point getDeliveryAddress() {
        return deliveryAddress;
    }
    
    public void setFulfilled() {
        this.fulfilled = true;
    }
}
