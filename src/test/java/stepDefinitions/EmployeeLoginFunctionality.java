package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeHomePage;
import pages.EmployeeLoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class EmployeeLoginFunctionality extends Base {

    @Then("I click on the employee login menue")
    public void i_click_on_the_employee_login_menue() {
       click((EmployeeLoginPage.MenueEmpLogin));
    }
    @Then("I enter employee user id")
    public void i_enter_employee_user_id() {
       sendkeys(EmployeeLoginPage.TextEmpUserID,"testpilot@gmail.com");
    }
    @Then("I enter employee user password")
    public void i_enter_employee_user_password() {
       sendkeys(EmployeeLoginPage.TextEmpUserPwd,"1234");
    }

    @When("I click on employee login button")
    public void i_click_on_employee_login_button() {
        click(EmployeeLoginPage.ButtonEmpUserLogin);
    }

    @Then("verify I am in the employee home page")
    public void verify_i_am_in_the_employee_home_page() {
      String empIdMessage =  getText((EmployeeHomePage.employeeIDmsg));
       assertEquals("Employee Id: 102",empIdMessage);
    }
}
