package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.elements.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.example.elements.utils.WebDriverManagerUtil;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LogoutSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("the user is logged in")
    public void the_user_is_on_the_demoblaze_login_page() {
        assertTrue(loginPage.isLoginSuccessful()); // Verificar si el usuario está logueado correctamente
    }

    @When("the user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button() {
        loginPage.logout();
    }

    @Then("the user should be logged out successfully")
    public void the_user_should_be_logged_out_successfully() {
        loginPage.visuliceButtonLogin();
    }

}
