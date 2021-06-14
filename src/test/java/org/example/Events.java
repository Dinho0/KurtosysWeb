package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class Events {
     public WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.kurtosys.com/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        waitForPageToLoad();
         WebElement resource = driver.findElement(By.xpath("//*[@id=\"kurtosys-menu-item-59810\"]/a/div/div/span"));
        action.moveToElement(resource).perform();

    }

    public void clickItem(By item){
        driver.findElement(item).click();
    }

    public void inputData(By item, String inputdata){
        driver.findElement(item).sendKeys(inputdata);
    }

    public void takeScreenshot( String fileWithPath){


        TakesScreenshot scrShot =((TakesScreenshot)driver);


        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);


        File DestFile=new File(fileWithPath);


    }

    public  void waitForPageToLoad(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
