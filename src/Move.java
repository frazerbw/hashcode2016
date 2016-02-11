public class Move {
	// Variable definition
    private Point starting;
    private Point target;

    public Move(Point starting, Point target) {
        this.starting = starting;
        this.target = target;
    }
    
    // Get distance
    public int distance() {
        return 0;
    }
    // Get starting point
    public Point getStarting() {
        return starting;
    }
    // Get ending point
    public Point getTarget() {
        return target;
    }


}
