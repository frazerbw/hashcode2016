import java.util.ArrayList;

public class Warehouse {
	// Variables definition
	private Point location;
    private ArrayList<Product> stock;

    public Warehouse(Point location, ArrayList<Product> stock) {
        this.location = location;
        this.stock = stock;
    }

    public Point getLocation() {
        return location;
    }
    public ArrayList<Product> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Product> stock) {
        this.stock = stock;
    }
}
