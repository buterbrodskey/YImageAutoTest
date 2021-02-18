package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OnlineCalculateTest {
    public static WebDriver driver;
    public static BeginPage beginPage;
    public static WorkPage workPage;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        beginPage = new BeginPage(driver);
        workPage = new WorkPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("beginpage"));
    }

    @Test
    public void sumTest() {
        beginPage.inputSearchQuery("калькулятор онлайн");

        workPage.inputNumber_44();
        workPage.clickPlus();
        workPage.inputNumber_89();
        workPage.clickEquals();
        Assertions.assertEquals(133,workPage.getResult());
    }

}
