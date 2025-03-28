package ru.my.first.test;

import org.testng.annotations.Test;
import ru.my.first.model.LoginData;

public class ShopExitTest extends TestBase {

    @Test
    public void testExit() {
        app.getLoginHelper().gotoSignUp();
        app.getLoginHelper().fillLoginForm(new LoginData("test@mail.com", "1"));
        app.getLoginHelper().getEntry();
        app.getUserNavbarHelper().openUserNavbar();
        app.getExitHelper().quit();
    }
}