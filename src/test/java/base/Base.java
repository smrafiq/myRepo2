package base;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Base {
    public static WebDriver driver;


    //get url method:
    public static void navigateUrl(String url) {
        driver.get(url);
    }

    //click method
    public static void click(By locators) {
        driver.findElement(locators).click();
    }


    //send keys method
    public static void sendkeys(By locators, String keys) {
        driver.findElement(locators).sendKeys(keys);
    }

    // get text method
    public static String getText(By locators) {
        String textValue = driver.findElement(locators).getText();
        //System.out.println(textValue);
        return textValue;
    }

    // get textCheck method
    public static void getTextCheck(String xpath, String text) {
        WebElement textElement = driver.findElement(By.xpath(xpath));
        String getTextElement = textElement.getText();
        if (getTextElement.equals(text))
            System.out.println("pass");
        else
            System.out.println("fail");

    }


}
