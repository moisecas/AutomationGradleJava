import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMCuenta{

    private WebDriver driver;
    private POMCuenta cuentaPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        cuentaPage = new POMCuenta(driver);
    }

    @Test
    public void testLogin() {
        cuentaPage.navigateToWebsite("https://www.bancodeoccidente.com.co/portaltransaccional/#/login");
        cuentaPage.clickComboBox();
        cuentaPage.enterDocumentNumber("tu_documento");
        cuentaPage.enterPassword("tu_contraseña");
        // Agregar las aserciones o validaciones necesarias
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


