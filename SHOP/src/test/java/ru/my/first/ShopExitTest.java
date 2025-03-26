package ru.my.first;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShopExitTest extends TestBase  {

    @Test
    public void testExit() {
        gotoSignUp();
        fillLoginForm(new LoginData("test@mail.com", "1"));
        getEntry();
        webDriver.findElement(By.id("navbarDropdown2")).click();
        webDriver.findElement(By.linkText("Выйти")).click();
    }

}