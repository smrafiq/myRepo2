package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Base {
    // alt ctrl l : to auto formate the lines
    @Before
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        //WebDriver driver;
        driver = new ChromeDriver();
    }


    @After
    public static void tearDown(){
        //driver.close(); // to close the current tab of browser
        driver.quit(); // to close browser application or window
    }

}
