package org.example.StepDefs;

import org.example.Events;
import org.example.Pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class Steps  extends HomePage {

    Events events =  new Events();


    public void launchBrowser(){
       events.launchBrowser();

    }

    public void navigate( ){

       events.clickItem(whitePaperseBooks);

    }
    public void verifyTitle(){


        events.waitForPageToLoad();
        assertEquals("White Papers", events.driver.findElement(title).getText());

    }

    public void navigatetoForm(){
        events.clickItem(whitepapertitle);
    }
    public void fillForm(){
        events.waitForPageToLoad();
        events.waitForPageToLoad();

        events.clickItem(firstName);
        events.inputData(firstName, "Moses");
        events.inputData(lastName, "Yusuff");
        events.inputData(email, "mosesyusuff@yhoo.com");
        events.inputData(company, "Dyces");
        events.inputData(industry, "IT");
        events.clickItem(checkBox);
        events.clickItem(btnSendCopy);


    }

    public void takescreenshot(){
    events.takeScreenshot("C:/");
    }



}
