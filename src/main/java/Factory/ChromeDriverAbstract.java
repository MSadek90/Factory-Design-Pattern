package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class ChromeDriverAbstract extends DriverManagerAbstract {


    @Override
    public WebDriver initializeDriver() {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
    }



}
