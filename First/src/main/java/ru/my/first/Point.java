package ru.my.first;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p1, Point p2) {
        double X = p2.x - p1.x;
        double Y = p2.y - p1.y;

        BigDecimal b = new BigDecimal(Math.sqrt(X * X + Y * Y));
        return b.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
