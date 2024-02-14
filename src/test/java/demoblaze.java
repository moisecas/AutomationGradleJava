import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demoblaze {
    public static void main(String[] args) {
        // Configurar WebDriverManager para el controlador de Chrome
        WebDriverManager.chromedriver().setup();

        // Iniciar webdriver
        WebDriver driver = new ChromeDriver();

        // entrar a la pagina
        driver.get("https://www.demoblaze.com/index.html");

        // click sobre producto
        WebElement samsungGalaxyS6 = driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
        samsungGalaxyS6.click();

        // agregar al carro
        WebElement btnSuccess = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
        btnSuccess.click();

        // Realizar clic en home
        WebElement navLink = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
        navLink.click();

        // Realizar clic en el elemento carrito
        WebElement cartur = driver.findElement(By.xpath("//a[@id='cartur']"));
        cartur.click();

        // Cerrar el navegador
        driver.quit();
    }
}

