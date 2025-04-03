package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverAbstract extends DriverManagerAbstract{

    @Override
    public WebDriver initializeDriver() {

            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
    }
}
