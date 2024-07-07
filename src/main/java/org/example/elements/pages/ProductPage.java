package org.example.elements.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {
    private By addToCartButton = By.linkText("Add to cart");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        if (isAddToCartButtonAvailable()) {
            driver.findElement(addToCartButton).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Espera de hasta 10 segundos para la alerta
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept(); //espera hasta que la alerta esté presente y la acepta
        } else {
            System.out.println("The 'Add to cart' button is not available.");
        }
    }

    public boolean isAddToCartButtonAvailable() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
            return element != null;
        } catch (Exception e) {
            return false;
        }
    }
}
