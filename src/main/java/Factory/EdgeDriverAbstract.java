package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverAbstract extends DriverManagerAbstract{



    @Override
    public WebDriver initializeDriver() {

            driver = new EdgeDriver();
            driver.manage().window().maximize();
            return driver;
    }
}
