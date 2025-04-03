package Factory;

import Constants.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static DriverManagerAbstract initializeDriverManager(String browser) {

       //String browser = System.getProperty("browser");

       switch (DriverType.DriverEnumType.valueOf(browser)) {

           case chrome -> {
               return new ChromeDriverAbstract();
           }

           case firefox -> {
               return new FireFoxDriverAbstract();
           }

           case edge -> {
               return new EdgeDriverAbstract();
           }

           default -> throw new IllegalStateException("No browser existed: " + browser);
       }


    }


    public static DriverManagerAbstract quitDriverManager() {
          return null;
    }
}
