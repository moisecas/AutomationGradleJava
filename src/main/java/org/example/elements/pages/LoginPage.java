package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    private By usernameField = By.id("loginusername"); //se crea un objeto By que contiene el id del campo de usuario
    private By passwordField = By.id("loginpassword"); //se crea un objeto By que contiene el id del campo de contraseña
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
        // Verificar si el usuario está logueado correctamente
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Esperar hasta 10 segundos
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nameofuser']"))).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
