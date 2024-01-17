import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends POMCuenta {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String documentNumber, String password) {
        clickComboBox();  // Selecciona el combobox deseado por el nuevo XPath

        // Espera un momento si es necesario para que aparezcan las opciones y luego haz clic en la opción deseada
        WebElement comboBoxOption = driver.findElement(By.xpath("//div[@id='a4057e2b597c-0']"));
        comboBoxOption.click();

        enterDocumentNumber(documentNumber);
        enterPassword(password);
        // Agrega otros pasos de inicio de sesión si es necesario
    }
}
