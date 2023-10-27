package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class StepTest {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";


    @Given("user on login page")
    public void user_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);

        String loginPageAssert = driver.findElement(By.className("login_logo")).getText();
        Assert.assertEquals(loginPageAssert, "Swag Labs");

    }

    @Then("user input username")
    public void user_input_username() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @Then("user input problem username")
    public void user_input_problem_username() {
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
    }

    @And("user input valid password")
    public void user_input_valid_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("user input invalid password")
    public void userInputInvalidPassword() {
        driver.findElement(By.id("password")).sendKeys("salahPassword");
    }

    @And("user click login button")
    public void user_click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user is on Homepage")
    public void user_is_on_Homepage() {
        String getTitle = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(getTitle, "Products");
//        driver.close();
    }

    @Then("user get error message")
    public void user_get_error_message() {
//        driver.findElement(By.xpath("//h3[contains(text()='Epic sadface: Username and password do not match any user in this service')]"));
        driver.findElements(By.className("error-button"));
        driver.close();
    }

    @And("user click burger menu button")
    public void userClickBurgerMenuButton() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    @And("user click logout")
    public void userClickLogout() {
        driver.findElement(By.id("logout_sidebar_link")).click();
    }


    @Then("user success add product to cart")
    public void userSuccessAddProductToCart() {
        driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    @And("user click remove button")
    public void userClickRemoveButton() {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }

    @Then("user success remove product from cart")
    public void userSuccessRemoveProductFromCart() {
    }

    @Then("user click add to cart")
    public void user_click_add_to_cart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }

    @And("user go to shopping cart")
    public void user_go_to_shopping_cart() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    @And("user click checkout")
    public void user_click_checkout() {
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }

    @And("user fill the first name")
    public void user_fill_the_first_name() {
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("namaDepan");
    }

    @And("user fill the last name")
    public void user_fill_the_last_name() {
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("namaBelakang");
    }

    @And("user fill the postal code")
    public void user_fill_the_postal_code() {
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("132456");
    }

    @And("user click continue button")
    public void user_click_continue_button() {
        driver.findElement(By.id("continue")).click();
    }

    @And("user click finish button")
    public void user_click_finish_button() {
        driver.findElement(By.id("finish")).click();
    }

    @Then("user successfully checkout the product")
    public void user_successfully_checkout_the_product() {
        driver.findElement(By.className("complete-header"));

    }

    @Then("user get error message that must be filled column")
    public void userGetErrorMessageThatMustBeFilledColumn() {
        driver.findElements(By.className("error-button"));
    }
}