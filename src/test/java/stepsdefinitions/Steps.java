package stepsdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps {
    WebDriver driver;

    @Given("the user is on the eCommerce login page")
    public void the_user_is_on_the_e_commerce_login_page() {

        driver =new ChromeDriver();
        driver.get("http://85.209.95.122/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
        driver.manage().window().maximize();

    }
    @When("the user enter valid credentials as username:{string} and  password: {string}")
    public void the_user_enter_valid_credentials_as_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

    }


    @When("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button() {
        driver.findElement(By.xpath("//input[@name='submit']")).click();


    }

    @Then("the user should be redirected to the  products")
    public void the_user_should_be_redirected_to_the_products() {
driver.findElement(By.xpath("//span[normalize-space()='HOME']")).isDisplayed();
driver.quit();

    }




}