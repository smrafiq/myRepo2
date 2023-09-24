package tests;

import base.Base;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeHomePage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class VerifyEmployeeLogin extends Base {
    @Test
    public  void verifyEmployeeLogin() {
        //BaseClass.startUp();
        navigateUrl("https://it.microtechlimited.com/");

        //______________________EMPLOYEE LANDING PAGE _________________
        //click on login menue
        //click(By.partialLinkText("LOG"));
        click(LandingPage.Menuelogin);





        // ____________EMPLOYEE LOGIN PAGE ________________________-
        //click employee login menue
       // click(By.partialLinkText("Employee"));
        click(EmployeeLoginPage.MenueEmpLogin);
        //enter userName
        sendkeys(EmployeeLoginPage.TextEmpUserID,"testpilot@gmail.com");

        //enter employee password
        sendkeys(EmployeeLoginPage.TextEmpUserPwd,"1234");
        //click on login button
        click(EmployeeLoginPage.ButtonEmpUserLogin);


        // ____________________ EMPLOYEE HOME PAGE _______________________
        //verify test's home page
        getText(EmployeeHomePage.labelEmployeeWelcomeMsg);
        String getTextMsg = getText(By.xpath("//h2[contains(text(), 'Welcome')]"));
        System.out.println(getTextMsg);
        Assert.assertEquals(getTextMsg,"Welcome Test");



    }
}
