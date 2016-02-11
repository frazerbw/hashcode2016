package com.company;

import java.util.ArrayList;

/**
 * Created by frazer on 11/02/16.
 */
public class Pathfinder {

    private ArrayList<Point> points;
    private Point starting;
    private Point destination;

    public Pathfinder(ArrayList<Point> points, Point starting, Point destination) {
        this.points = points;
        this.starting = starting;
        this.destination = destination;
    }

    public ArrayList<Point> getSolution() {

        ArrayList<Move> moves = new ArrayList<Move>();

        Point currentPos = starting;
        ArrayList<Point> movesLeft = (ArrayList<Point>) points.clone();
        ArrayList<Point> bestOrder = new ArrayList<Point>();
        bestOrder.add(starting);

        for (Point nextDest : points) {

            int cheapest = 99999;
            Point nextMove = null;

            for (Point point : movesLeft) {
                int distance = point.distBetween(currentPos);
                if (distance < cheapest) {
                    nextMove = point;
                    cheapest = distance;
                }
            }

            movesLeft.remove(nextMove);
            bestOrder.add(nextMove);
            currentPos = nextMove;
        }

        bestOrder.add(destination);
        return bestOrder;
    }


}
