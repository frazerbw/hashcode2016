import java.util.ArrayList;
import java.util.Iterator;

public class Drone {
	// Variables definition
    private Point location;
    private int MAX_PAYLOAD;
    ArrayList<Product> payload;

    public Drone(Point location, int MAX_PAYLOAD) {
        this.location = location;
        this.MAX_PAYLOAD = MAX_PAYLOAD;
        this.payload = new ArrayList<Product>();
    }
    // Get location
    public Point getLocation() {
        return location;
    }
    // Get maximum payload
    public int getMAX_PAYLOAD() {
        return MAX_PAYLOAD;
    }
    // Get current payload
    public int getCurrentWeight() {
        int weight = 0;
        for (Iterator<Product> i = payload.iterator(); i.hasNext();) {
            Product p = i.next();
            weight = weight + p.getWeight();
        }
        return weight;
    }

    public boolean load(ArrayList<Product> products, Warehouse warehouse) {
        if (!this.location.equals(warehouse.getLocation())) return false; //needs to fly
        if (!warehouse.getStock().containsAll(products)) return false;
        for (Iterator<Product> i = products.iterator(); i.hasNext();) {
            if (this.getCurrentWeight() >= MAX_PAYLOAD) break;
            Product p = i.next();
            warehouse.getStock().remove(p);
            this.payload.add(p);
        }
        return true;
    }

    public void deliver(Point point) {
        
    }
    public void setLocation(Point location) {
        this.location = location;
    }
}
