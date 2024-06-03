package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DemoBlazeHomePage extends BasePage { //extiende de la clase BasePage porque es una pagina web y hereda sus metodos de inicializacion de elementos
    private By productLink = By.linkText("samsung galaxy s6"); //se crea un objeto By que contiene el link del producto

    public DemoBlazeHomePage(WebDriver driver) { //constructor de la clase
        super(driver); //se llama al constructor de la clase padre que es BasePage y se le pasa el driver

    }

    public void goToProductPage() {
        driver.findElement(productLink).click(); //se busca el link del producto y se hace click
    }

}