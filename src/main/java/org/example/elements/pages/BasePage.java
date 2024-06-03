package org.example.elements.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory; //el page factory es una clase que nos permite inicializar los elementos de la pagina
public abstract class BasePage { //es abstracta porque no se va a instanciar, solo se va a heredar de ella para inicializar los elementos de la pagina

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;  //el driver que se recibe por parametro se asigna al driver de la clase
        PageFactory.initElements(driver, this); //inicializa los elementos de la pagina
    }

    public String getTitle() {
        return driver.getTitle();
    }

}
