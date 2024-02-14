import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demoblaze {
    public static void main(String[] args) {
        // Configurar WebDriverManager para el controlador de Chrome
        WebDriverManager.chromedriver().setup();

        // Iniciar el WebDriver
        WebDriver driver = new ChromeDriver();

        // Navegar a la página web
        driver.get("https://www.demoblaze.com/");

        // Localizar el elemento por su XPath y hacer clic en él
        WebElement elemento = driver.findElement(By.xpath("//div[@id='contcont']//a[2]"));
        elemento.click();

        // Cerrar el navegador
        driver.quit();
    }
}

