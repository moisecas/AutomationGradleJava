package org.example.elements.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private By cartlink = By.linkText("Cart");
    private  By placeOrderButton = By.xpath("//button[normalize-space()='Place Order']");

    public CartPage(WebDriver driver){
        super(driver);
    }

    public void goToCart(){
        driver.findElement(cartlink).click();
    }

    public void placeOrder(){
        driver.findElement(placeOrderButton).click();
    }
}
