package Tests;

import Base.BaseTest;
import Listener.Listener;
import Pages.AllPages;
import io.qameta.allure.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static ExtentReports.ExtentTestManager.startTest;

@Listeners({Listener.class})
@Epic("e2e Tests")
@Feature("Without Kullanici Girisi")
public class TC002 extends BaseTest {

    private static final Logger logger= LogManager.getLogger(TC002.class.getName());

    @Test(description = "Kullanıcı girişi yapılmadan sepete ürün eklenmesi")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Kullanıcı girişi yapılmadan sepete ürün eklenmesi")
    @Story("")
    public void Test02(Method method) throws IOException, InterruptedException {
        startTest(method.getName(),"Kullanıcı girişi yapılmadan sepete ürün eklenmesi");
        AllPages allPages=new AllPages();
        allPages.mainPage().goTo_HepsiBurada();
        allPages.homePage().search_To_Product("robot süpürge");
        allPages.searchResultPage().SearchResultSummary("robot süpürge");
        allPages.searchResultPage().selectProduct();
        allPages.productDetailPage().add_To_Cart();
        allPages.cartPage().go_To_Cart();


    }

    }
