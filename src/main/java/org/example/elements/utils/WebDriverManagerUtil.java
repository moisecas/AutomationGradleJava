package org.example.elements.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManagerUtil { //clase que se encarga de inicializar el driver de chrome y devolverlo
    private static WebDriver driver;
    public static WebDriver getDriver() { //metodo que devuelve el driver de chrome
        WebDriverManager.chromedriver().setup(); //se inicializa el driver de chrome
//        return new ChromeDriver(); se devuelve el driver de chrome porque es el que se va a usar en este caso
        // Configuración de ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");

        // Inicia el navegador con las opciones configuradas
        driver = new ChromeDriver(options);
        return driver;

    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
