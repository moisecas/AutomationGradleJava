package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BasePage {

    private By usernameField = By.id("moisecas32"); //se crea un objeto By que contiene el id del campo de usuario
    private By passwordField = By.id("123456"); //se crea un objeto By que contiene el id del campo de contraseña
    private By loginButton = By.xpath("//button[text()='Log in']");

    private By userElement = By.xpath("//a[@id='nameofuser']");

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
        try {
            // Verifica si el elemento de usuario está visible
            return driver.findElement(userElement).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
