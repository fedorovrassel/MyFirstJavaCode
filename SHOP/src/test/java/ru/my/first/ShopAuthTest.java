package ru.my.first;

import org.testng.annotations.Test;

public class ShopAuthTest extends TestBase {

    @Test
    public void testAuth() {
        gotoSignUp();
        fillLoginForm(new LoginData("test@mail.com", "1"));
        getEntry();
    }
}