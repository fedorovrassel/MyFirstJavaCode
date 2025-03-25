package ru.my.first;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointDistanceTest {

    @Test
    public void ConsistenceDistanceTest() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 3;
        int y2 = 3;
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Assert.assertEquals(p1.distance(p1, p2), p2.distance(p1, p2));
    }

    @Test
    public void ZeroDistanceTest() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Assert.assertEquals(p1.distance(p1, p2), 0.0);
    }

    @Test
    public void DistanceTest() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Assert.assertEquals(p1.distance(p1, p2), 1.4);
    }
}
