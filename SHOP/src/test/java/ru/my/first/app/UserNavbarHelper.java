package ru.my.first.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserNavbarHelper extends HelperBase{

    public UserNavbarHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void openUserNavbar() {
        click(By.id("navbarDropdown2"));
    }
}
