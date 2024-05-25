package automatedtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Con Selenium Manager, no es necesario establecer manualmente la ruta del driver.
        // Selenium Manager descargará y gestionará automáticamente los drivers necesarios.

        // Ejemplo para Chrome:
        driver = new ChromeDriver();

        // Ejemplo para Firefox:
        // driver = new FirefoxDriver();

        // Ejemplo para Edge:
        // driver = new EdgeDriver();

        // Ejemplo para Safari (solo en macOS):
        // driver = new SafariDriver();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        // Verificar que el título de la página contiene "Selenium WebDriver"
        assert driver.getTitle().contains("Selenium WebDriver");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
