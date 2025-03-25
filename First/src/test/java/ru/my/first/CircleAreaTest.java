package ru.my.first;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleAreaTest {

    @Test
    public void AreaTest() {
        Circle c = new Circle(5);
        Assert.assertEquals(c.area(), 78.5);
    }
}
