package com.company;

/**
 * Created by frazer on 11/02/16.
 */
public class Move {

    private Point starting;
    private Point target;

    public Move(Point starting, Point target) {
        this.starting = starting;
        this.target = target;
    }

    public int distance() {
        return 0;
    }

    public Point getStarting() {
        return starting;
    }

    public Point getTarget() {
        return target;
    }


}
