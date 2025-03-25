package ru.my.first;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleAreaTest {

    @Test
    public void TestArea(){
        Rectangle  r = new Rectangle(4, 5);
        Assert.assertEquals(r.area(), 20);
    }
}
