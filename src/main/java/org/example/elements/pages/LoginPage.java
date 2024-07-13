package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BasePage {

    private By usernameField = By.id("loginusername"); //se crea un objeto By que contiene el id del campo de usuario
    private By passwordField = By.id("loginpassword"); //se crea un objeto By que contiene el id del campo de contraseña
    private By loginButton = By.xpath("//button[text()='Log in']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void submitLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        // Implement a check to verify if the login was successful
        // For example, check if a certain element is present on the page
        return driver.findElement(By.id("nameofElementAfterLogin")).isDisplayed();
    }
}
