package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    private By usernameField = By.id("loginusername"); //se crea un objeto By que contiene el id del campo de usuario
    private By passwordField = By.id("loginpassword"); //se crea un objeto By que contiene el id del campo de contraseña
    private By loginButton = By.xpath("//button[text()='Log in']");

    private By userElement = By.xpath("//a[@id='nameofuser']");
    private By logoutButton = By.id("logout2");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        userField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passField.sendKeys(password);
    }

    public void submitLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
    }

    public boolean isLoginSuccessful() {
        // Verificar si el usuario está logueado correctamente
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement logoutBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(logoutButton));
            return logoutBtn.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    public void visuliceButtonLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
    }

}
