package ru.my.first.test;

import org.testng.annotations.Test;
import ru.my.first.model.LoginData;

public class ShopAuthTest extends TestBase {

    @Test
    public void testAuth() {
        app.getLoginHelper().gotoSignUp();
        app.getLoginHelper().fillLoginForm(new LoginData("test@mail.com", "1"));
        app.getLoginHelper().getEntry();
    }
}