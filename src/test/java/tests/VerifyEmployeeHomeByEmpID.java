package tests;

import base.Base;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeHomePage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class VerifyEmployeeHomeByEmpID extends Base {
    @Test(priority = 1)
    public void verifyEmployeeHomeByEmpID() {
        // BaseClass.startUp();
        navigateUrl("https://it.microtechlimited.com/");
        //calling loginAsEmployee() from EmployeeLoginPage
        EmployeeLoginPage.loginAsEmployee();

        // ____________________ EMPLOYEE HOME PAGE _______________________
        //verify test's home page
        //verify employee home page by employee id:
        String verifyEmpID = getText(By.xpath("//h2[text()='Employee Id: 102 ']"));
        System.out.println("actual message: " + verifyEmpID);
        Assert.assertEquals(verifyEmpID, "Employee Id: 102");
    }

    @Test(priority = 2)
    public void verifyEmployeeHomeByWelcomeMessage(){
        System.out.println("test priority 2");
    }


    //______________________EMPLOYEE LANDING PAGE _________________
    //click on login menue
    //click(By.partialLinkText("LOG"));
    // click(LandingPage.Menuelogin);


    // ____________EMPLOYEE LOGIN PAGE ________________________-
    //click employee login menue
    // click(By.partialLinkText("Employee"));
    //click(EmployeeLoginPage.MenueEmpLogin);
    //enter userName
    //sendkeys(EmployeeLoginPage.TextEmpUserID,"testpilot@gmail.com");

    //enter employee password
    // sendkeys(EmployeeLoginPage.TextEmpUserPwd,"1234");
    //click on login button
    // click(EmployeeLoginPage.ButtonEmpUserLogin);


    // ____________________ EMPLOYEE HOME PAGE _______________________
    //verify test's home page
    //verify employee home page by employee id:
//        String verifyText = getText(By.xpath("//h2[text()='Employee Id: 102 ']"));
//        System.out.println(verifyText);
//        if (verifyText.equals("Employee Id: 102"))
//            System.out.println("pass");
//        else
//            System.out.println("fail");
//        }


}
