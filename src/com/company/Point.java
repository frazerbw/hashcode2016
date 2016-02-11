package com.company;

/**
 * Created by tomas on 11/02/16.
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int distBetween(Point p) {
        return (int) Math.ceil(Math.sqrt(
                Math.pow(this.x - p.getX(),2) + Math.pow(this.y - p.getY(),2)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        if (y != point.y) return false;

        return true;
    }

    public static void main(String[] arg) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(3,3);
        System.out.println(p1.distBetween(p2)); //returns 3
    }

    public String toString() {
        return "X: " + getX() + " Y: " + getY();
    }

}
