package ru.my.first.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.my.first.model.LoginData;

public class LoginHelper {
    private WebDriver webDriver;

    public LoginHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void fillLoginForm(LoginData loginData) {
        webDriver.findElement(By.id("exampleInputEmail1")).click();
        webDriver.findElement(By.id("exampleInputEmail1")).sendKeys(loginData.getLogin());
        webDriver.findElement(By.id("exampleInputPassword1")).click();
        webDriver.findElement(By.id("exampleInputPassword1")).sendKeys(loginData.getPassword());
    }

    public void getEntry() {
        webDriver.findElement(By.name("_csrf")).click();
    }

    public void gotoSignUp() {
        webDriver.findElement(By.linkText("Вход")).click();
    }
}
