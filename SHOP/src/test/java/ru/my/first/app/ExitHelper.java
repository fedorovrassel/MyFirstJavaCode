package ru.my.first.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExitHelper extends HelperBase{

    public ExitHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void quit() {
        click(By.linkText("Выйти"));
    }
}

