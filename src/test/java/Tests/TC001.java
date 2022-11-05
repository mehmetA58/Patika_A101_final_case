package Tests;

import Base.BaseTest;
import Listener.Listener;
import Pages.AllPages;
import Utilities.ConfigReader;
import com.opencsv.exceptions.CsvException;
import io.qameta.allure.*;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import org.apache.logging.log4j.Logger;
import static ExtentReports.ExtentTestManager.startTest;

@Listeners({Listener.class})
@Epic("e2e Tests")
@Feature("Kullanici Girisi ile")
public class TC001 extends BaseTest {


private static final Logger logger= LogManager.getLogger(TC001.class.getName());

@Test(description = "Kullanıcı girişi yapılarak sepete ürün eklenmesi")
@Severity(SeverityLevel.BLOCKER)
@Description("Test Description: Kullanıcı girişi yapılarak sepete ürün eklenmesi")
@Story("")
    public void Test01(Method method) throws IOException, InterruptedException, CsvException {
        startTest(method.getName(),"Kullanıcı girişi yapılarak sepete ürün eklenmesi");
        AllPages allPages=new AllPages();
        allPages.mainPage().goTo_HepsiBurada();
        allPages.loginPage().login_HepsiBurada(ConfigReader.getProperty("UserMail"),ConfigReader.getProperty("UserPassword"));
        allPages.homePage().AssertLogin("test test");
        allPages.homePage().search_To_Product("robot süpürge");
        allPages.searchResultPage().SearchResultSummary("robot süpürge");
        allPages.searchResultPage().selectProduct();
        allPages.productDetailPage().add_To_Cart();
        allPages.cartPage().go_To_Cart();
        allPages.cartPage().verify_To_ProductsOnCart();

    }
}
