package ru.my.first.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExitHelper {

    private WebDriver webDriver;

    public ExitHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void quit() {
        webDriver.findElement(By.linkText("Выйти")).click();
    }
}

