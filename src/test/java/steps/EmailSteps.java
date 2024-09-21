package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class EmailSteps {
    private WebDriver driver;
    private WebDriverWait wait;

    public EmailSteps() {
        WebDriverManager.chromedriver().setup(); // Asegura que se configura el ChromeDriver
        this.driver = new ChromeDriver(); // Inicializa el driver de Chrome
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Inicializa WebDriverWait con el driver correcto
    }

    @Given("the user is logged into Google")
    public void the_user_is_logged_into_Google() {
        driver.get("https://mail.google.com"); // Navegar a Gmail
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='identifierId']")));
        emailField.sendKeys("moisesquipux");
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Siguiente']")));
        nextButton.click();
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Passwd']")));
        passwordField.sendKeys("DelUnoAl24++");
        WebElement nextPasswordButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Siguiente']")));
        nextPasswordButton.click();
    }

    @Given("the user is on the Gmail page")
    public void the_user_is_on_the_Gmail_page() {
        WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@role='presentation']")));
        if (logoElement.isDisplayed()) {
            System.out.println("El logo de Gmail está visible en la página.");
        }
    }
    @When("the user writes an email")
    public void the_user_writes_an_email() {
        // Clic en "Compose"
        WebElement composeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Compose')]")));
        composeButton.click();

        // Escribir el destinatario
        WebElement recipientField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':bd']")));
        recipientField.sendKeys("pruebautomatizacionquipux@gmail.com");

        // Escribir el asunto
        WebElement subjectField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':7m']")));
        subjectField.sendKeys("Prueba Java Moises Castro");

        // Escribir el cuerpo del mensaje
        WebElement bodyField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=':90']")));
        bodyField.sendKeys("Enviando documento");
        bodyField.sendKeys(" Aquí está el enlace al documento: https://drive.google.com/file/d/1UP3hEMBvb3wlo5OqYZWeJ3PYXTMmbLb8/view?usp=sharing");


        // Clic en el botón para adjuntar archivo
        WebElement attachButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=':9k']")));
        attachButton.click();


        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=':7c']")));
        searchField.sendKeys("prueba");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        searchField.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement firstDriveFile = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.eizQhe-ObfsIf-mJRMzd-PFprWc-YbohUe-VtOx3e")));
        firstDriveFile.click();


        // Esperar y hacer clic en el botón "Add as link"
        WebElement addAsLinkButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Add as link']")));
        addAsLinkButton.click();

        // Regresar al contenido principal
        driver.switchTo().defaultContent();
    }


    @When("the user clicks the Send button")
    public void the_user_clicks_the_send_button() {
        WebElement sendButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=':7c']")));
        sendButton.click();
    }

}
