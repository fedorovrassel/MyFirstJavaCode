package ru.my.first.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.testng.Assert.fail;

public class Applications {

    public WebDriver webDriver;
    private UserNavbarHelper userNavbarHelper;
    private LoginHelper loginHelper;
    private ExitHelper exitHelper;
    public StringBuffer verificationErrors = new StringBuffer();

    public void init() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        userNavbarHelper = new UserNavbarHelper(webDriver);
        loginHelper = new LoginHelper(webDriver);
        exitHelper = new ExitHelper(webDriver);
        webDriver.get("http://shop.bugred.ru/");
    }

    public void stop() {
        webDriver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!verificationErrorString.isEmpty()) {
            fail(verificationErrorString);
        }
    }

    public UserNavbarHelper getUserNavbarHelper() {
        return userNavbarHelper;
    }

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public ExitHelper getExitHelper() {
        return exitHelper;
    }
}
