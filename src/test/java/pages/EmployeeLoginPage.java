package pages;

import base.Base;

import org.openqa.selenium.By;

public class EmployeeLoginPage extends Base {
    //locators
    public static By MenueEmpLogin = By.partialLinkText("Employee");
    public static By TextEmpUserID = By.name("mailuid");
    public static By TextEmpUserPwd = By.xpath("//input[@name='pwd']");
    public static By ButtonEmpUserLogin = By.cssSelector("input[name='login-submit']");



    // actions
    public static void loginAsEmployee(){

        //click on login menue
        click(LandingPage.Menuelogin);
        //click employee login menue
        click(EmployeeLoginPage.MenueEmpLogin);

        //enter userName
        sendkeys(EmployeeLoginPage.TextEmpUserID,"testpilot@gmail.com");
        //enter employee password
        sendkeys(EmployeeLoginPage.TextEmpUserPwd,"1234");
        //click on login button
        click(EmployeeLoginPage.ButtonEmpUserLogin);
    }

}
