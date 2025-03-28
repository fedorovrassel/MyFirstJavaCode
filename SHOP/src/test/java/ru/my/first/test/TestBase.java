package ru.my.first.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.my.first.app.Applications;

public class TestBase {

    protected final Applications app = new Applications();

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }

}
