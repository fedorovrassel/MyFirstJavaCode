package ru.my.first.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserNavbarHelper {
    private WebDriver webDriver;

    public UserNavbarHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void openUserNavbar() {
        webDriver.findElement(By.id("navbarDropdown2")).click();
    }
}
