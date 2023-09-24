package tests;

import base.Base;

import org.testng.annotations.Test;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;

public class VerifyCustomerLoginByWelcomeMsg extends Base {
    @Test
    public void verifyCustomerLoginByWelcomeMsg(){
        //BaseClass.startUp();
        navigateUrl("https://it.microtechlimited.com/");
        //calling loginAsCustomer() from CustomerLoginPage
        CustomerLoginPage.loginAsCustomer();

        //_______________CUSTOMER HOME PAGE ___________________________________
        //verify test's home page
        // getText(By.xpath("//h2[contains(text(),'Welcome')]"));
        String getTextMsg = getText(CustomerHomePage.labelCustomerWelcomeMsg);
        System.out.println(getTextMsg);
        if (getTextMsg.contains("David"))
            System.out.println("pass");
        else
            System.out.println("fail");

    }




//        // ______________ LANDING PAGE _________________________
//        //click on login menue
//        //click(By.partialLinkText("LOG"));
//        click(LandingPage.Menuelogin);


        //____________________CUSTOMER LOGIN PAGE________________________
//        //click customer login menue
//        click(CustomerLoginPage.menueCustomerLogin);
//        //enter customer userName
//        sendkeys(CustomerLoginPage.textCustomerUserID,"david@gmail.com");
//        //enter customer password
//        sendkeys(CustomerLoginPage.textCustomerUserPwd,"1234");
//        //click on customer login button
//        click(CustomerLoginPage.buttonCustomerLogin);


//        //_______________CUSTOMER HOME PAGE ___________________________________
//        //verify test's home page
//        // getText(By.xpath("//h2[contains(text(),'Welcome')]"));
//        String getTextMsg = getText(CustomerHomePage.labelCustomerWelcomeMsg);
//        System.out.println(getTextMsg);
//        if (getTextMsg.contains("David"))
//            System.out.println("pass");
//        else
//            System.out.println("fail");
//    }



}
