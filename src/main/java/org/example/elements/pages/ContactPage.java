package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends BasePage {

    private final By btnEmail = By.id("recipient-email");
    private final By btnName = By.id("recipient-name");

    private final By btnMessage = By.id("message-text");

    private  final By btnSend = By.className("btn btn-primary");
    private  final By btnClose = By.className("btn btn-secondary");
    public ContactPage(WebDriver driver) {
        super(driver);
    }
    // Método para verificar si btnEmail está visible
    public boolean isEmailVisible() {
        return isElementVisible(btnEmail);
    }

    // Método para verificar si btnName está visible
    public boolean isNameVisible() {
        return isElementVisible(btnName);
    }

    // Método para verificar si btnMessage está visible
    public boolean isMessageVisible() {
        return isElementVisible(btnMessage);
    }

    // Método para verificar si btnSend está visible
    public boolean isSendButtonVisible() {
        return isElementVisible(btnSend);
    }

    // Método para verificar si btnClose está visible
    public boolean isCloseButtonVisible() {
        return isElementVisible(btnClose);
    }
    // Método reutilizable en la clase base para verificar la visibilidad de un elemento
    private boolean isElementVisible(By locator) {
        WebElement element = driver.findElement(locator);
        return element.isDisplayed();
    }

}
