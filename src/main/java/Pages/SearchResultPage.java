package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import java.io.IOException;

import static ExtentReports.ExtentTestManager.getTest;

public class SearchResultPage extends BaseStepMethod {
    String a;
    private static final Logger LOGGER= LogManager.getLogger(SearchResultPage.class);

    private static final By TXT_SEARCHRESULTPAGE_SearchResultSummary =By.cssSelector(".searchResultSummaryBar-CbyZhv5896ASVcYBLKmx");
    private static final By BTN_SEARCHRESULTPAGE_FIRST_PRODUCT = By.xpath("//li[@id='i0']");
    private static final By TXT_SEARCHRESULTPAGE_FIRST_PRODUCT_NAME = By.xpath("(//h3)[1]");




    public void SearchResultSummary(String ResultText){
      ContainsText(TXT_SEARCHRESULTPAGE_SearchResultSummary,ResultText);
      LOGGER.info("Search Results contains "+ResultText);
        getTest().info("Search Results contains "+ResultText);

    }
    public void selectProduct() throws IOException {
        csvWriter(TXT_SEARCHRESULTPAGE_FIRST_PRODUCT_NAME);

        clickElement(BTN_SEARCHRESULTPAGE_FIRST_PRODUCT);
        LOGGER.info("User click first product in search result page");
        getTest().info("User click first product in search result page");
        switchToWindow();
        LOGGER.info("User switch to product details page");
        getTest().info("User switch to product details page");

    }




}
