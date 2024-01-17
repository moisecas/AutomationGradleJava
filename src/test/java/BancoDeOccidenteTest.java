import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BancoDeOccidenteTest {

    private WebDriver driver;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openBancoDeOccidenteAndCheckTitle() {
        driver.get("https://www.bancodeoccidente.com.co/wps/portal/banco-de-occidente/bancodeoccidente/canales-servicios/canales-y-transacciones-para-personas/portal-transaccional");

        WebElement linkIngresa = driver.findElement(By.xpath("//a[normalize-space()='Ingresa']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linkIngresa);


        // Puedes agregar más acciones aquí después de hacer clic, como verificar que se haya cargado una nueva página o formulario

        // Verifica que el título de la página contenga una palabra clave
        // Cambia 'Banco de Occidente' por el título real de la página si es necesario
        String title = driver.getTitle();
        assertTrue(title.contains("Banco de Occidente"));
    }

    @AfterEach
    public void tearDown() {    
        if (driver != null) {
            driver.quit();
        }
    }
}

