package com.google.calculator;

import org.openqa.selenium.*;
import org.testng.Assert;

import static com.google.calculator.BaseSeleniumPage.driver;
import static org.openqa.selenium.Keys.ENTER;


public class GooglePage {
    private static final String RESULT = "0";

    public void fillSearchField(String calculator) {
        if (isElementPresent(By.xpath("//button[@id='L2AGLb']"))) {
            driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        }
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(calculator);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(ENTER);
       // driver.findElement(By.xpath("//center//input[@type='submit']")).sendKeys(ENTER);
    }

    public void typeCalcButtons() {
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();//1
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();//*
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();//2
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();//-
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();//3
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();//+
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();//1
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();//
    }

    public void getResult() {
        WebElement result = driver.findElement(By.xpath("//span[@id='cwos']"));
        Assert.assertEquals(result.getText(), RESULT);
    }

    public boolean isElementPresent (By locator) {
        try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException ex) {
            return false;
        }
    }
}
