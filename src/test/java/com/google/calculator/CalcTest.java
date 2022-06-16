package com.google.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends BaseSelenium {
    private static final String BASE_URL = "https://www.google.com/";
    private static final String TYPE_CALC = "calculator";
    private static final String RESULT = "0";
    private static final String[] ARR_CALC_BUTTONS = {
            "//div[@jsname='N10B9']",//1
            "//div[@jsname='YovRWb']",//*
            "//div[@jsname='lVjWed']",//2
            "//div[@jsname='pPHzQc']",//-
            "//div[@jsname='KN1kY']",//3
            "//div[@jsname='XSr6wc']",//+
            "//div[@jsname='Pt8tGc']"};//=

    GooglePage g = new GooglePage();

    @Test
    public void calculatingResultTest() throws InterruptedException {
        driver.get(BASE_URL);
        driver.findElement(By.xpath(g.getSearchField)).sendKeys(TYPE_CALC);
        driver.findElement(By.xpath(g.searchBtn)).click();
        driver.findElement(By.xpath(ARR_CALC_BUTTONS[0])).click();
        driver.findElement(By.xpath(ARR_CALC_BUTTONS[1])).click();
        driver.findElement(By.xpath(ARR_CALC_BUTTONS[2])).click();
        driver.findElement(By.xpath(ARR_CALC_BUTTONS[3])).click();
        driver.findElement(By.xpath(ARR_CALC_BUTTONS[4])).click();
        driver.findElement(By.xpath(ARR_CALC_BUTTONS[5])).click();
        driver.findElement(By.xpath(ARR_CALC_BUTTONS[0])).click();
        driver.findElement(By.xpath(ARR_CALC_BUTTONS[6])).click();
        WebElement result = driver.findElement(By.xpath(g.getResult));
        Assert.assertEquals(result.getText(), RESULT);

    }
}
