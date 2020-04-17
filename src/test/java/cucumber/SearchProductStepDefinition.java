package cucumber;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class SearchProductStepDefinition
{
    private WebDriver driver;

    @Given("^User is on the GreenKart landing page$")
    public void user_is_on_the_greenkart_landing_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "D:\\my\\dev\\poc\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^User search for \"([^\"]*)\" vegetable$")
    public void user_search_for_something_vegetable(String productName) throws Throwable {
       //xpath syntax: //tagname[@attribute='value']
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(productName);
    }

    @Then("^\"([^\"]*)\" vegetable product is displayed$")
    public void something_vegetable_product_is_displayed(String productName) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(productName));
    }
}