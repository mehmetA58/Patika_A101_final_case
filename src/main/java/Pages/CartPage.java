package Pages;

import Base.BaseStepMethod;
import com.opencsv.exceptions.CsvException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static ExtentReports.ExtentTestManager.getTest;

public class CartPage extends BaseStepMethod {
    private static final Logger LOGGER= LogManager.getLogger(CartPage.class);

    private static final By TXT_CARTPAGE_SEPETIM_TITLE= By.xpath("//h1");
    private static final By TXT_CARTPAGE_PRODUCTS1_TITLES = By.xpath("((//div[@class='product_name_3Lh3t'])//a)[1]");
    private static final By TXT_CARTPAGE_PRODUCTS2_TITLES = By.xpath("((//div[@class='product_name_3Lh3t'])//a)[2]");


    public void go_To_Cart(){

        go_To_HepsiBuradaSepetim();
        AssertText(TXT_CARTPAGE_SEPETIM_TITLE,"Sepetim");
        LOGGER.info("User verify to "+getTextElement(TXT_CARTPAGE_SEPETIM_TITLE)+" on Cart PAGE");
        getTest().info("User verify to "+getTextElement(TXT_CARTPAGE_SEPETIM_TITLE)+" on Cart PAGE");

    }
    public void verify_To_ProductsOnCart() throws IOException, CsvException {

        AssertText(TXT_CARTPAGE_PRODUCTS1_TITLES,csvReader());
        LOGGER.info("User verify to for store-1"+getTextElement(TXT_CARTPAGE_PRODUCTS1_TITLES)+" on Cart PAGE "+csvReader());
        getTest().info("User verify to for store-1 "+getTextElement(TXT_CARTPAGE_PRODUCTS1_TITLES)+" on Cart PAGE "+csvReader());
        AssertText(TXT_CARTPAGE_PRODUCTS2_TITLES,csvReader());
        LOGGER.info("User verify to for store-2"+getTextElement(TXT_CARTPAGE_PRODUCTS2_TITLES)+" on Cart PAGE with "+csvReader());
        getTest().info("User verify to for store-2"+getTextElement(TXT_CARTPAGE_PRODUCTS2_TITLES)+" on Cart PAGE "+csvReader());



    }
}
