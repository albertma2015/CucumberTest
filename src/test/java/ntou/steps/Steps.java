package ntou.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Steps {

    public static WebDriver driver;

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The user is on login page");
        // driver= new FirefoxDriver();

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @When("the user enters valid id and password")
    public void the_user_enters_valid_id_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The user enters valid id and password");
        driver.findElement(By.name("uid")).sendKeys("mngr507131");
        driver.findElement(By.name("password")).sendKeys("urAvery");
    }

    @When("hits submit")
    public void hits_submit() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The user hits submit");
        driver.findElement(By.name("btnLogin")).click();

    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The user is logged in successfully!");
        System.out.println(driver.findElement(By.tagName("marquee")).getText());
    }

}
