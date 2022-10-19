package com.google.calculator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseSeleniumTest {
    public WebDriver driver;
    private static final String BASE_URL = "https://www.google.com/";

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
        driver.get(BASE_URL);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();

    }
}
