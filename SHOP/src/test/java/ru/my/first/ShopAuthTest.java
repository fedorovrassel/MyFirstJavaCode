package ru.my.first;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ShopAuthTest {
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://shop.bugred.ru/");
    }

    @Test
    public void testAuthSucces() {
        driver.findElement(By.linkText("Вход")).click();
        driver.findElement(By.id("exampleInputEmail1")).click();
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("test@mail.com");
        driver.findElement(By.id("exampleInputPassword1")).click();
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("1");
        driver.findElement(By.name("_csrf")).click();
    }

   @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }
}