package ru.my.first.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.my.first.model.LoginData;

public class LoginHelper extends HelperBase {

    public LoginHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void fillLoginForm(LoginData loginData) {
        fillField(By.id("exampleInputEmail1"), loginData.getLogin());
        fillField(By.id("exampleInputPassword1"), loginData.getPassword());
    }

    public void getEntry() {
        click(By.name("_csrf"));
    }

    public void gotoSignUp() {
        click(By.linkText("Вход"));
    }
}
