package com.softuni.models.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorUiTest {
    WebDriver webDriver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("http://localhost:9000/");
    }

   @Test
   public void checkAddition(){
        webDriver.findElement(By.cssSelector("#leftOperand")).clear();
        webDriver.findElement(By.cssSelector("#leftOperand")).sendKeys("1.0");
        webDriver.findElement(By.cssSelector("#rightOperand")).clear();
        webDriver.findElement(By.cssSelector("#rightOperand")).sendKeys("2.0");
        Select operator = new Select(webDriver.findElement(By.xpath("//*[@name='operator']")));
        operator.selectByVisibleText("+");
        webDriver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
        Assert.assertEquals(webDriver.findElement(By.cssSelector("#result")).getAttribute("value"),"3.0");
   }

    @Test
    public void checkSubstraction(){
        webDriver.findElement(By.cssSelector("#leftOperand")).clear();
        webDriver.findElement(By.cssSelector("#leftOperand")).sendKeys("2");
        webDriver.findElement(By.cssSelector("#rightOperand")).clear();
        webDriver.findElement(By.cssSelector("#rightOperand")).sendKeys("1");
        Select operator = new Select(webDriver.findElement(By.xpath("//*[@name='operator']")));
        operator.selectByVisibleText("-");
        webDriver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
        Assert.assertEquals(webDriver.findElement(By.cssSelector("#result")).getAttribute("value"),"1.0");
    }

    @Test
    public void checkMultiplication(){
        webDriver.findElement(By.cssSelector("#leftOperand")).clear();
        webDriver.findElement(By.cssSelector("#leftOperand")).sendKeys("2");
        webDriver.findElement(By.cssSelector("#rightOperand")).clear();
        webDriver.findElement(By.cssSelector("#rightOperand")).sendKeys("1");
        Select operator = new Select(webDriver.findElement(By.xpath("//*[@name='operator']")));
        operator.selectByVisibleText("*");
        webDriver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
        Assert.assertEquals(webDriver.findElement(By.cssSelector("#result")).getAttribute("value"),"2.0");
    }

    @Test
    public void checkDivision(){
        webDriver.findElement(By.cssSelector("#leftOperand")).clear();
        webDriver.findElement(By.cssSelector("#leftOperand")).sendKeys("2");
        webDriver.findElement(By.cssSelector("#rightOperand")).clear();
        webDriver.findElement(By.cssSelector("#rightOperand")).sendKeys("1");
        Select operator = new Select(webDriver.findElement(By.xpath("//*[@name='operator']")));
        operator.selectByVisibleText("/");
        webDriver.findElement(By.xpath("//button[contains(text(),'Calculate')]")).click();
        Assert.assertEquals(webDriver.findElement(By.cssSelector("#result")).getAttribute("value"),"2.0");
    }


    @AfterTest
    public void tearDown(){
       webDriver.quit();
   }
}
