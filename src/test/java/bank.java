import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class bank {

    private WebDriver driver; //

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openBancoDeOccidenteAndCheckTitle() {
        driver.get("https://www.bancodeoccidente.com.co/wps/portal/banco-de-occidente/bancodeoccidente/canales-servicios/canales-y-transacciones-para-personas/portal-transaccional");

        // Localiza el enlace "Ingresa" y hace clic en él
        WebElement linkIngresa = driver.findElement(By.xpath("//a[normalize-space()='Ingresa']"));
        linkIngresa.click();

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

