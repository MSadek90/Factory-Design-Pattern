package TestCases;

import Base.BaseTest;
import Pages.StorePage;
import org.testng.annotations.Test;


public class SearchTest extends BaseTest {


    @Test
    public void searchWithPartialText() {
        new StorePage(driver)
                .getEndPoint()
                .searchFunc("blue");
    }
}
