package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class ResetLoginStep{

/*
    @Given("^Open the Firefox and launch the application$")
    public void openFirefox() throws Exception {
        System.out.println("Firefox is successfully opned !!");
    }

    @When("^Enter the Username and Password$")
    public void enterUsernameAndPassword() throws Exception {
        
        System.out.println("Username and Password have been entered!!");
    }

    @Then("^Reset the credential$")
    public void resetCredential() throws Exception {
        System.out.println("Credential has been reset!!");
    }*/

@Given("^Open the Firefox and launch the application$")
public void open_the_Firefox_and_launch_the_application()  {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Firefox is successfully opned !!");
}

@When("^Enter the Username and Password$")
public void enter_the_Username_and_Password() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Username and Password have been entered!!");
}

@When("^Enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void enter_the_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("Username is "+strArg1 +" and Password is "+strArg2);
    }

@Then("^Reset the Username and Password$")
public void reset_the_Username_and_Password() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Credential has been reset!!");
}
    

}