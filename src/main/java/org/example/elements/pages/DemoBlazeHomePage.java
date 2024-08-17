package org.example.elements.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoBlazeHomePage extends BasePage { //extiende de la clase BasePage porque es una pagina web y hereda sus metodos de inicializacion de elementos
    private By productLink = By.xpath("//a[normalize-space()='Samsung galaxy s6']"); //se crea un objeto By que contiene el link del producto (Samsung galaxy s6

    private By laptopsCategory = By.xpath("//a[3]"); //categoria laptops
    private By monitorsCategory = By.xpath("//a[4]"); //categoria monitores

    private By sonyVaioI5Element = By.xpath("//a[normalize-space()='Sony vaio i5']");
    private By appleMonitor24Element = By.xpath("//a[normalize-space()='Apple monitor 24']");

    private By btnContact = By.xpath("//a[normalize-space()='Contact']");
    public DemoBlazeHomePage(WebDriver driver) { //constructor de la clase
        super(driver); //se llama al constructor de la clase padre que es BasePage y se le pasa el driver

    }

    public void goToProductPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Espera de hasta 10 segundos
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(productLink));
        element.click(); //se hace click en el link del producto
    }

    public void clickOnLaptopsCategory() {
        WebElement laptopsElement = driver.findElement(laptopsCategory);
        laptopsElement.click();
    }

    public void clickOnMonitorsCategory() {
        WebElement monitorsElement = driver.findElement(monitorsCategory);
        monitorsElement.click();
    }
    // Método para verificar si  está visible en la lista de laptops
    public boolean isSonyVaioI5Visible() {
        return driver.findElement(sonyVaioI5Element).isDisplayed();
    }

    // Método para verificar si  está visible en la lista de Monitors
    public boolean isAppleMonitor24Visible() {
        return driver.findElement(appleMonitor24Element).isDisplayed();
    }

    // Método para hacer clic en el enlace de 'Contact'
    public void clickOnContact() {
        WebElement contactElement = driver.findElement(btnContact);
        contactElement.click();
    }

}