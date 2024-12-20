package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SanAngelPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By firstProduct = By.xpath("//img[@alt='arreglo floral versalles medellin flores variadas']");
    private By secondProduct = By.xpath("//img[@alt='cilindro con 24 rosas medellin']");
    private By firstProductQuantity = By.xpath("//input[@id='quantity_6765847012ea2']");
    private By secondProductQuantity = By.xpath("//input[@id='quantity_676584e9e98cb']");
    private By addToCartButton = By.xpath("//button[@name='add-to-cart']");
    private By submitButton = By.xpath("//button[@type='submit']");
    private By homepageLogo = By.xpath("//header[@class='desktop-header']//img[@alt='San Angel Flores']");

    public SanAngelPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10); // Usa un valor long directamente (en segundos)
    }

    public void selectFirstProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();
    }

    public void selectSecondProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(secondProduct)).click();
    }

    public void clickTwiceFirstProductQuantity() {
        WebElement quantityElement = wait.until(ExpectedConditions.elementToBeClickable(firstProductQuantity));
        for (int i = 0; i < 2; i++) {
            quantityElement.click();
        }
    }

    public void clickFiveTimesSecondProductQuantity() {
        WebElement quantityElement = wait.until(ExpectedConditions.elementToBeClickable(secondProductQuantity));
        for (int i = 0; i < 5; i++) {
            quantityElement.click();
        }
    }

    public void clickAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }

    public void clickSubmit() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public void navigateToHomepage() {
        wait.until(ExpectedConditions.elementToBeClickable(homepageLogo)).click();
    }
}
