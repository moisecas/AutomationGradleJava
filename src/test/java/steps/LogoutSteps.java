package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.elements.pages.LoginPage;
import org.example.elements.utils.WebDriverManagerUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class LogoutSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is logged in")
    public void the_user_is_on_the_demoblaze_login_page() {
        driver = WebDriverManagerUtil.getDriver();
        driver.get("https://www.demoblaze.com/index.html");
        loginPage = new LoginPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
        loginPage.enterUsername("moisecas32");
        loginPage.enterPassword("123456");
        loginPage.submitLogin();
        assertTrue(loginPage.isLoginSuccessful());
    }

    @When("the user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout2"))).click(); //espera hasta que el boton de logout este clickeable
    }

    @Then("the user should be logged out successfully")
    public void the_user_should_be_logged_out_successfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login2")));
        assertTrue(driver.findElement(By.id("login2")).isDisplayed());
        WebDriverManagerUtil.quitDriver();
    }

}
