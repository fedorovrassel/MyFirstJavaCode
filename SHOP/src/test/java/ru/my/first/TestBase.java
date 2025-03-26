package ru.my.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import static org.testng.Assert.fail;

public class TestBase {

    public StringBuffer verificationErrors = new StringBuffer();
    protected WebDriver webDriver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webDriver.get("http://shop.bugred.ru/");
    }

    protected void getEntry() {
        webDriver.findElement(By.name("_csrf")).click();
    }

    protected void gotoSignUp() {
        webDriver.findElement(By.linkText("Вход")).click();
    }

    protected void fillLoginForm(LoginData loginData) {
        webDriver.findElement(By.id("exampleInputEmail1")).click();
        webDriver.findElement(By.id("exampleInputEmail1")).sendKeys(loginData.getLogin());
        webDriver.findElement(By.id("exampleInputPassword1")).click();
        webDriver.findElement(By.id("exampleInputPassword1")).sendKeys(loginData.getPassword());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        webDriver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!verificationErrorString.isEmpty()) {
            fail(verificationErrorString);
        }
    }
}
