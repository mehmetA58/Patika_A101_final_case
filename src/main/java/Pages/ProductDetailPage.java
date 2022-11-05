package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static ExtentReports.ExtentTestManager.getTest;

public class ProductDetailPage extends BaseStepMethod {
    private static final Logger LOGGER= LogManager.getLogger(ProductDetailPage.class);

    private static final By BTN_PRODUCTDETAILPAGE_SEPETE_EKLE_SATICI1 =By.xpath("(//button[@class='add-to-basket button small'])[1]");
    private static final By BTN_PRODUCTDETAILPAGE_ONARIM_PAKETI_RED_BUTTON = By.xpath("(//a[contains(text(),'Onarım paketi istemiyorum')])[1]");
    private static final By BTN_PRODUCTDETAILPAGE_SEPETE_EKLE_SATICI2 =By.xpath("(//button[@class='add-to-basket button small'])[2]");
    private static final By BTN_PRODUCTDETAILPAGE_SEPETE_GIT_BUTTON = By.xpath("(//button[contains(text(),'Sepete git')])");


    public void add_To_Cart(){
        clickElement(BTN_PRODUCTDETAILPAGE_SEPETE_EKLE_SATICI1);
        LOGGER.info("User click sepete ekle button for satici1");
        getTest().info("User click sepete ekle button for satici1");

        clickElement(BTN_PRODUCTDETAILPAGE_ONARIM_PAKETI_RED_BUTTON);
        LOGGER.info("User click onarim paketi red button for satici1");
        getTest().info("User click onarim paketi red button for satici1");

        clickElement(BTN_PRODUCTDETAILPAGE_SEPETE_EKLE_SATICI2);
        LOGGER.info("User click sepete ekle button for satici2");
        getTest().info("User click sepete ekle button for satici2");

        clickElement(BTN_PRODUCTDETAILPAGE_ONARIM_PAKETI_RED_BUTTON);
        LOGGER.info("User click onarim paketi red button for satici2");
        getTest().info("User click onarim paketi red button for satici2");

    }

}
