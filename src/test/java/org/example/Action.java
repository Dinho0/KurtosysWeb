package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://amazon.com");
        driver.manage().window().fullscreen();
    }

    public void clickItem(By item){
        driver.findElement(item).click();
    }

    public void inputData(By item, String inputdata){
        driver.findElement(item).sendKeys(inputdata);
    }
}
