package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {
    private By addToCartButton = By.linkText("Add to cart"); //se crea un objeto By que contiene el link del boton de agregar al carrito

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        if (isAddToCartButtonAvailable()) {
            driver.findElement(addToCartButton).click(); //se busca el boton de agregar al carrito y se hace click
            driver.switchTo().alert().accept(); //se acepta la alerta que aparece al agregar el producto al carrito
        } else {
            System.out.println("The 'Add to cart' button is not available.");
        }
    }

    public boolean isAddToCartButtonAvailable() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Espera de hasta 10 segundos
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
            return element != null;
        } catch (Exception e) {
            return false;
        }
    }
}
