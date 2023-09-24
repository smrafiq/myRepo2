package pages;


import base.Base;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Base {
    //locators
    public static By menueCustomerLogin = By.partialLinkText("Customer");
    public static By textCustomerUserID = By.name("mailuid");

    public static By textCustomerUserPwd = By.xpath("//input[@name='pwd']");
    public static By buttonCustomerLogin = By.cssSelector("input[name='login-submit']");


    //actions

    public static void loginAsCustomer() {
        //click on login menue
        //click(By.partialLinkText("LOG"));
        click(LandingPage.Menuelogin);
        //____________________CUSTOMER LOGIN PAGE________________________
        //click customer login menue
        click(CustomerLoginPage.menueCustomerLogin);
        //enter customer userName
        sendkeys(CustomerLoginPage.textCustomerUserID, "david@gmail.com");
        //enter customer password
        sendkeys(CustomerLoginPage.textCustomerUserPwd, "1234");
        //click on customer login button
        click(CustomerLoginPage.buttonCustomerLogin);
    }


}
