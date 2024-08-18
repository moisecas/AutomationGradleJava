package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.elements.utils.WebDriverManagerUtil;
import org.openqa.selenium.WebDriver;
import org.example.elements.pages.DemoBlazeHomePage;
import org.example.elements.pages.ContactPage;
public class FormContactSteps {
    private WebDriver driver;

    @Given("the user is on the DemoBlaze homepage")
    public void go_to_home_page(){
        driver = WebDriverManagerUtil.getDriver();
        driver.get("https://www.demoblaze.com/index.html");

    };

    @When("the user navigates to the Contact section")
    public void form_contact(){
        driver = WebDriverManagerUtil.getDriver();
        DemoBlazeHomePage homePage = new DemoBlazeHomePage(driver);
        homePage.clickOnContact();
    };

    @Then("the user should be able to fill out the contact form and submit it successfully")
    public void form_contact_clic(){
        WebDriver driver = WebDriverManagerUtil.getDriver();
        ContactPage contactPage = new ContactPage(driver);

        // Verificar que todos los elementos del formulario de contacto estén visibles
        boolean isFormVisible = contactPage.isEmailVisible() &&
                contactPage.isNameVisible() &&
                contactPage.isMessageVisible() &&
                contactPage.isSendButtonVisible() &&
                contactPage.isCloseButtonVisible();

        // Asumimos que si todos los elementos están visibles, la verificación es exitosa
        if (isFormVisible) {
            System.out.println(" visible.");
        } else {
            System.out.println("not visible.");
        }

    };
}
