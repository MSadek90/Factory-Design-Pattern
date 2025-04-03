package Base;

import Constants.DriverType;
import Factory.DriverFactory;
import Factory.DriverManagerAbstract;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;

import static Factory.DriverFactory.initializeDriverManager;
import static Factory.DriverFactory.quitDriverManager;


public class BaseTest {


    protected WebDriver driver;
    protected DriverManagerAbstract driverManager;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) {

        driverManager = initializeDriverManager(browser);
        driver = driverManager.getDriver();
        driver.get("https://askomdch.com/");

    }



    @AfterTest
    public void tearDown() {
       driverManager.quitDriver();
    }
}
