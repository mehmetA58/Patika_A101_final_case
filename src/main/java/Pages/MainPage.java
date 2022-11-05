package Pages;

import Base.BaseStepMethod;
import Utilities.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import java.io.IOException;

import static Base.BaseTest.driver;
import static ExtentReports.ExtentTestManager.getTest;

public class MainPage extends BaseStepMethod {
    private static final By BTN_MAINPAGE_COOKIES_ACCEPT = By.xpath("//button[@id='onetrust-accept-btn-handler']");
    private static final Logger LOGGER= LogManager.getLogger(MainPage.class);

    public void goTo_HepsiBurada() throws IOException {
        LOGGER.info("User go to " + ConfigReader.getProperty("baseURL"));
        getTest().info("User go to " + ConfigReader.getProperty("baseURL"));
        driver.get(ConfigReader.getProperty("baseURL"));
        LOGGER.info("User is on Hepsiburada Home Page.");
        getTest().info("User is on Hepsiburada Home Page.");
        clickElement(BTN_MAINPAGE_COOKIES_ACCEPT);
        LOGGER.info("User accept cookies on Home Page.");
        getTest().info("User accept cookies on Home Page.");
        AssertURL(ConfigReader.getProperty("baseURL"));
        LOGGER.info("User assert BaseURL");
        getTest().info("User assert BaseURL");
    }

}
