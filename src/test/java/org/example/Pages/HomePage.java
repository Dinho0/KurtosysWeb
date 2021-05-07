package org.example.Pages;

import org.openqa.selenium.By;

public class HomePage {

   public By searchBox = By.id("twotabsearchtextbox");
   public By searchButton = By.id("nav-search-submit-button");
   public By category = By.xpath("//*[@id=\"n/22\"]/span/a/span");
   public By bookType = By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[3]/div/div/div[1]/a");
   public By addItemButton = By.id("add-to-cart-button");
   public By verifyItem = By.id("huc-v2-order-row-confirm-text");


}
