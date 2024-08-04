package org.example.elements.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverManagerUtil { //clase que se encarga de inicializar el driver de chrome y devolverlo
    private static WebDriver driver;
    public static WebDriver getDriver() { //metodo que devuelve el driver de chrome
        WebDriverManager.chromedriver().setup(); //se inicializa el driver de chrome
        return new ChromeDriver(); //se devuelve el driver de chrome porque es el que se va a usar en este caso
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
