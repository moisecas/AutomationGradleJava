package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.elements.pages.CartPage;
import org.example.elements.pages.DemoBlazeHomePage;
import org.example.elements.pages.ProductPage;
import org.example.elements.utils.WebDriverManagerUtil;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class AddToCartSteps {

    private WebDriver driver;
    private DemoBlazeHomePage homePage;
    private ProductPage productPage;
    private CartPage cartPage;

    @Given("the user is on the DemoBlaze home page") //se inicializa el driver de chrome y se abre la pagina de demoblaze
    public void the_user_is_on_the_demo_blaze_home_page() {
        driver = WebDriverManagerUtil.getDriver();
        driver.get("https://www.demoblaze.com/index.html");
        homePage = new DemoBlazeHomePage(driver);
    }
    @When("the user navigates to the Samsung galaxy s6 product page")
    public void the_user_navigates_to_the_samsung_galaxy_s6_product_page() {
        homePage.goToProductPage();
        productPage = new ProductPage(driver);
    }

    @When("the user adds the product to the cart")
    public void the_user_adds_the_product_to_the_cart() {
        productPage.addToCart();
        cartPage = new CartPage(driver);
        cartPage.goToCart();
    }

    @Then("the product should be added to the cart successfully")
    public void the_product_should_be_added_to_the_cart_successfully() {
        assertTrue(cartPage.isProductInCart());
        driver.quit();
    }
}

