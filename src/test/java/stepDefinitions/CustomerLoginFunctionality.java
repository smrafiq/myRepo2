package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.testng.Assert;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;
import pages.LandingPage;
import static org.junit.Assert.assertEquals;


public class CustomerLoginFunctionality extends Base {

    @Given("I am in the landing page")
    public void i_am_in_the_landing_page() {
        navigateUrl("https://it.microtechlimited.com/");
    }

    @Then("I click on the login menue")
    public void i_click_on_the_login_menue() {
        click(LandingPage.Menuelogin);
    }
    @Then("I click on the customer login menue")
    public void i_click_on_the_customer_login_menue() {
        click(CustomerLoginPage.menueCustomerLogin);
    }
    @Then("I enter user id")
    public void i_enter_user_id() {
        sendkeys(CustomerLoginPage.textCustomerUserID,"david@gmail.com");
    }
    @Then("I enter user password")
    public void i_enter_user_password() {
        sendkeys(CustomerLoginPage.textCustomerUserPwd,"1234");
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        click(CustomerLoginPage.buttonCustomerLogin);
    }
    @Then("verify I am in the customer home page")
    public void verify_i_am_in_the_customer_home_page() {
        String getTextMsg = getText(CustomerHomePage.labelCustomerWelcomeMsg);
        System.out.println("actual message: " + getTextMsg);
        //Assert.assertEquals(getTextMsg,"Welcome David");
        System.out.println("HELLO CUCUMBER");
       assertEquals(getTextMsg,"Welcome David");
    }




}
