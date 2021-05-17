package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    @BeforeTest
    public void beforeTestMethod(){

    }
    @BeforeMethod
    @Parameters(value={"browserName"})//get from testng.xml
    public void beforeMethod(String browserName){
    setupDriver(browserName);
    driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    driver.get(Constants.url);

        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void afterMethod(){
    driver.quit();
    }
    @AfterTest
    public void afterTestMethod(){

    }
    public void setupDriver(String browserName){
        if (browserName.equalsIgnoreCase("chrome")
        ) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator+"drivers"+File.separator+"chromedriver");
            driver=new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ File.separator+"drivers"+File.separator+"geckodriver");
            driver=new FirefoxDriver();
        }
        else{
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator+"drivers"+File.separator+"chromedriver");
            driver=new ChromeDriver();
        }
    }
}
