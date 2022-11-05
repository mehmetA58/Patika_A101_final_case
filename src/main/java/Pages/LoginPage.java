package Pages;

import Base.BaseStepMethod;
import Utilities.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static ExtentReports.ExtentTestManager.getTest;
import static ExtentReports.ExtentTestManager.startTest;

public class LoginPage extends BaseStepMethod {
    private static final Logger LOGGER= LogManager.getLogger(MainPage.class);


    private static final By HOVER_MAINPAGE_GIRIS_YAP = By.cssSelector("#myAccount");
    private static final By BTN_MAINPAGE_GirisYap = By.cssSelector("#login");
    private static final By INPUT_MAINPAGE_USERNAME = By.cssSelector("#txtUserName");
    private static final By BTN_MAINPAGE_LOGIN_BUTTON = By.cssSelector("#btnLogin");
    private static final By INPUT_MAINPAGE_PASSWORD = By.xpath("//input[@id='txtPassword']");
    private static final By BTN_MAINPAGE_EMAIL_BUTTON = By.cssSelector("#btnEmailSelect");

    public void login_HepsiBurada(String UsereMail,String UserPassword){
        LOGGER.info("User go to " + ConfigReader.getProperty("baseURL"));

        hoverElement(HOVER_MAINPAGE_GIRIS_YAP,3);
        LOGGER.info("User hover to 'Giris Yap Buton'");
        getTest().info("User hover to 'Giris Yap Buton'");

        clickElement(BTN_MAINPAGE_GirisYap);
        LOGGER.info("User click to 'Giris Yap Buton' ");
        getTest().info("User click to 'Giris Yap Buton' ");

        setTextElement(INPUT_MAINPAGE_USERNAME,UsereMail);
        LOGGER.info("User send to "+UsereMail);
        getTest().info("User send to "+UsereMail);

        clickElement(BTN_MAINPAGE_LOGIN_BUTTON);
        LOGGER.info("User click to Login Button after send to UserEmail");
        getTest().info("User click to Login Button after send to UserEmail");

        setTextElement(INPUT_MAINPAGE_PASSWORD,UserPassword);
        LOGGER.info("User send to USER PASSWORD");
        getTest().info("User send to USER PASSWORD");

        clickElement(BTN_MAINPAGE_EMAIL_BUTTON);
        LOGGER.info("User click to Login Button after send to Password ");
        getTest().info("User click to Login Button after send to Password ");

    }
}
