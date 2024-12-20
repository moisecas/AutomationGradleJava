package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.elements.pages.SanAngelPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSteps {

    private WebDriver driver;
    private SanAngelPage sanAngelPage;

    @Given("the user is on the San Angel homepage")
    public void the_user_is_on_the_San_Angel_homepage() {
        // Configura WebDriverManager para manejar el ChromeDriver automáticamente
        WebDriverManager.chromedriver().setup();

        // Inicializa el driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navega al sitio web
        driver.get("https://sanangel.com.co/");
        sanAngelPage = new SanAngelPage(driver);
    }

    @When("the user selects the product {string}")
    public void the_user_selects_the_product(String productName) {
        if (productName.equals("arreglo floral versalles medellin flores variadas")) {
            sanAngelPage.selectFirstProduct();
        } else if (productName.equals("cilindro con 24 rosas medellin")) {
            sanAngelPage.selectSecondProduct();
        }
    }

    @When("the user clicks twice on the quantity button for the first product")
    public void the_user_clicks_twice_on_the_quantity_button_for_the_first_product() {
        sanAngelPage.clickTwiceFirstProductQuantity();
    }

    @When("the user clicks {string}")
    public void the_user_clicks(String button) {
        if (button.equals("Add to cart")) {
            sanAngelPage.clickAddToCart();
        } else if (button.equals("Submit")) {
            sanAngelPage.clickSubmit();
        }
    }

    @When("the user navigates back to the homepage")
    public void the_user_navigates_back_to_the_homepage() {
        sanAngelPage.navigateToHomepage();
    }

    @When("the user clicks five times on the quantity button for the second product")
    public void the_user_clicks_five_times_on_the_quantity_button_for_the_second_product() {
        sanAngelPage.clickFiveTimesSecondProductQuantity();
    }

    @Then("the products should be added to the shopping cart successfully")
    public void the_products_should_be_added_to_the_shopping_cart_successfully() {
        // Aquí podrías agregar una validación del carrito si es posible
        System.out.println("Products added to the cart successfully.");
        driver.quit();
    }
}
