package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoBlazeHomePage extends BasePage { //extiende de la clase BasePage porque es una pagina web y hereda sus metodos de inicializacion de elementos
    private By productLink = By.xpath("//a[normalize-space()='Samsung galaxy s6']"); //se crea un objeto By que contiene el link del producto (Samsung galaxy s6

    public DemoBlazeHomePage(WebDriver driver) { //constructor de la clase
        super(driver); //se llama al constructor de la clase padre que es BasePage y se le pasa el driver

    }

    public void goToProductPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Espera de hasta 10 segundos
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(productLink));
        element.click(); //se hace click en el link del producto
    }

}