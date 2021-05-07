package org.example.StepDefs;

import org.example.Action;
import org.example.Pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Steps  extends HomePage {
    Action action =  new Action();


    public void launchBrowser(){
       action.launchBrowser();

    }

    public void searchItemAndSelectBook(String BookName){

       action.inputData(searchBox, "Who are thou");
       action.clickItem(searchButton);
       action.clickItem(category);
       action.clickItem(bookType);

    }
    public void addItemToCart(){
        action.clickItem(addItemButton);

    }

    public void verifyItem(){
        Assert.assertEquals( "Added to Cart", verifyItem.equals("Added to Cart"));
    }



}
