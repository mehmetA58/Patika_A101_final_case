package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static Base.BaseTest.driver;
import static ExtentReports.ExtentTestManager.getTest;

public class HomePage extends BaseStepMethod {
    private static final Logger LOGGER= LogManager.getLogger(HomePage.class);

    private static final By TXT_HOMEPAGE_KULLANICI_NAME = By.xpath("//span[@class='sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR']");
    private static final By INPUT_HOMEPAGE_SEARCHBOX = By.xpath("//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']");


    public void AssertLogin(String text){
        AssertText(TXT_HOMEPAGE_KULLANICI_NAME,text);
        LOGGER.info("User login is verified in HomePage ");
        getTest().info("User login is verified in HomePage ");

    }
    public void search_To_Product(String product){
        setTextElement(INPUT_HOMEPAGE_SEARCHBOX,product+ Keys.ENTER);
        LOGGER.info("User searches for "+product);
        getTest().info("User searches for "+product);

    }
}
