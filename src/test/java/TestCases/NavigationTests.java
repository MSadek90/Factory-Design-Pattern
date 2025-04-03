package TestCases;

import Base.BaseTest;
import Pages.HomePage;
import Pages.StorePage;

import org.testng.annotations.Test;

public class NavigationTests extends BaseTest {

    @Test
    public void navigationFromHomePageToStorePage() {
       StorePage storePage = new HomePage(driver)
               .getEndPoint()
               .navigateToStorePage();

    }
}
