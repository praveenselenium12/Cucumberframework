package Stepdefinition;

import Driverfactory.Drivers;
import Pageojectmodel.Homepage;
import Pageojectmodel.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class stepsclass {
    Homepage obj=new Homepage(Drivers.getDriver());
    Login obj1=new Login(Drivers.getDriver());
    @Given("user should be in freecrm homepage")
    public void user_should_be_in_freecrm_homepage() {

           boolean value= obj1.launchBrower();
            Assert.assertTrue(value);
    }
    @When("click on login button")
    public void click_on_login_button() {
            obj1.login();
    }
    @Then("login page should be displayed")
    public void login_page_should_be_displayed() {
            boolean flag=obj1.verifyLoginPage();
            Assert.assertTrue(flag);
    }
    @Then("enter email address")
    public void enter_email_address() {
            obj1.emailid();
    }
    @Then("enter password")
    public void enter_password() {
            obj1.password();
    }
    @When("click on login")
    public void click_on_login() {
        obj1.loginbutton();
    }
    @Then("user should be login")
    public void user_should_be_login() {

    }

    @Then("user should be login to the appication")
    public void user_should_be_login_to_the_appication() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
