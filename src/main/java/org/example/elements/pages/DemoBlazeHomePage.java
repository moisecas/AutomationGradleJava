package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DemoBlazeHomePage extends BasePage {
    private By productLink = By.linkText("samsung galaxy s6"); //se crea un objeto By que contiene el link del producto

    public DemoBlazeHomePage(WebDriver driver) {
        super(driver);

    }

    public void goToProductPage() {
        driver.findElement(productLink).click(); //se busca el link del producto y se hace click
    }

}