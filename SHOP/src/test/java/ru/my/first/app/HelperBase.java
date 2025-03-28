package ru.my.first.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected final WebDriver webDriver;

    public HelperBase(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    protected void fillField(By locator, String text) {
        click(locator);
        webDriver.findElement(locator).sendKeys(text);
    }

    protected void click(By locator) {
        webDriver.findElement(locator).click();
    }
}
