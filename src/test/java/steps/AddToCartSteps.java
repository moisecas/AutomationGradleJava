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
        driver = WebDriverManagerUtil.getDriver(); //se inicializa el driver de chrome
        driver.get("https://www.demoblaze.com/index.html"); //visita la pagina de demoblaze
        homePage = new DemoBlazeHomePage(driver); //se crea un objeto de la clase DemoBlazeHomePage para poder acceder a sus metodos
    }
    @When("the user navigates to the Samsung galaxy s6 product page") //se navega a la pagina del producto Samsung galaxy s6
    public void the_user_navigates_to_the_samsung_galaxy_s6_product_page() {
        homePage.goToProductPage(); //homePage es un objeto de la clase DemoBlazeHomePage y se llama al metodo goToProductPage
        productPage = new ProductPage(driver); //se crea un objeto de la clase ProductPage para poder acceder a sus metodos
    }

    @When("the user adds the product to the cart")
    public void the_user_adds_the_product_to_the_cart() {
        productPage.addToCart(); //productPage es un objeto de la clase ProductPage y se llama al metodo addToCart
        cartPage = new CartPage(driver); //se crea un objeto de la clase CartPage para poder acceder a sus metodos
        cartPage.goToCart(); //se llama al metodo goToCart
    }

    @Then("the product should be added to the cart successfully")
    public void the_product_should_be_added_to_the_cart_successfully() {
        assertTrue(cartPage.isProductInCart()); //se llama al metodo isProductInCart de la clase CartPage y se verifica que el producto este en el carrito
        driver.quit(); //se cierra el driver de chrome para finalizar la prueba de aceptacion
    }
}

