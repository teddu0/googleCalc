package com.google.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest extends BaseSeleniumTest {

    GooglePage g = new GooglePage();

    @Test //Получаем результат выражения 1*2-3+1
    public void calculatingResultTest() throws InterruptedException {
        g.fillSearchField("calculator");
        g.typeCalcButtons();
        g.getResult();
       // Thread.sleep(4000);//поставил слипы просто для того, что успеть увидеть результат
    }
}
