package ru.my.first;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareAreaTest {

    @Test
    public void TestArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25);
    }
}
