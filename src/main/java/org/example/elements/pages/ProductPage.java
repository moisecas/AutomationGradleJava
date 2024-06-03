package org.example.elements.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By; //importamos la clase By para poder usar los localizadores

public class ProductPage extends BasePage {
    private By addTocardButton = By.linkText("Add to cart"); //se crea un objeto By que contiene el link del boton de agregar al carrito

    public ProductPage( WebDriver driver){
        super(driver);
    }

    public  void addToCart(){
        driver.findElement(addTocardButton).click(); //se busca el boton de agregar al carrito y se hace click
        driver.switchTo().alert().accept(); //se acepta la alerta que aparece al agregar el producto al carrito
    }

}
