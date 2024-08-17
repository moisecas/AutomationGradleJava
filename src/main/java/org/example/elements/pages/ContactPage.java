package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage {

    private final By btnEmail = By.id("recipient-email");
    private final By btnName = By.id("recipient-name");

    private final By btnMesage = By.id("message-text");

    private  final By btnSend = By.className("btn btn-primary");
    private  final By btnClose = By.className("btn btn-secondary");
    public ContactPage(WebDriver driver) {
        super(driver);
    }
}
