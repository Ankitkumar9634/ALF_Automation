package alfPages;

import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import excelUtility.ExcelUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class UsedVehiclePage extends BaseLibrary {
    public UsedVehiclePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='salesPrice']")
    WebElement salesPrice;
    @FindBy(xpath = "//input[@id='downPayment']")
    WebElement downPayment;
    @FindBy(xpath = "//select[@id='insuranceType']")
    WebElement insuranceType;
    @FindBy(xpath = "//input[@id='insurance']")
    WebElement Insurance;
    @FindBy(xpath = "//input[@id='tradeInValue']")
    WebElement tradeInValue;
    @FindBy(xpath = "//input[@id='tradeInDebt']")
    WebElement tradeInDebt;
    @FindBy(xpath = "//input[@id='netTradeIn']")
    WebElement netTradeIn;
    @FindBy(xpath = "//select[@id='vehicleType']")
    WebElement Vehicle_type;
    @FindBy(xpath = "//select[@id='term']")
    WebElement term;
    @FindBy(xpath = "//input[@id='mileage']")
    WebElement Mileage;
    @FindBy(xpath = "//input[@id='vin']")
    WebElement VIN;
    @FindBy(xpath = "//select[@id='series']")
    WebElement series;
    @FindBy(xpath = "//select[@id='style']")
    WebElement style;
    @FindBy(xpath = "//select[@id='imported']")
    WebElement imported;
    @FindBy(xpath = "//input[@id='color']")
    WebElement color;
    @FindBy(xpath = "//small[@data-fv-for='color']")
    WebElement colorError;
    @FindBy(xpath = "//input[@id='licensePlate']")
    WebElement licensePlate;
    @FindBy(xpath = "//small[@data-fv-for='licensePlate' and @data-fv-validator='regexp']")
    WebElement licensePlateError;
    @FindBy(xpath = "//tr[@class='on  GV ']//input[@type='checkbox']")
    WebElement Additional_Equipment_1;
    @FindBy(xpath = "//tr[@class='on  9L ']//input[@type='checkbox']")
    WebElement Additional_Equipment_2;
    @FindBy(xpath = "//label[@for='additionalProduct5']")
    WebElement APBox1;
    @FindBy(xpath = "//select[@id='coverageProductType5']")
    WebElement APCoverage1;
    @FindBy(xpath = "//input[@id='priceCoverageProductType5']")
    WebElement APSalesPrice1;
    @FindBy(xpath = "//label[@for='additionalProduct6']")
    WebElement APBox2;
    @FindBy(xpath = "//select[@id='coverageProductType6']")
    WebElement APCoverage2;
    @FindBy(xpath = "//input[@id='priceCoverageProductType6']")
    WebElement APSalesPrice2;

    public void fillDealDetailForUsed() throws InterruptedException {
        ActionUtils.set_value(salesPrice, ExcelUtility.excel("VehicleType",0));
        ActionUtils.set_value(downPayment, ExcelUtility.excel("VehicleType", 1));
        ActionUtils.select_by_value(insuranceType, "Double Interest");
        ActionUtils.set_text(Insurance, ExcelUtility.excel("VehicleType",2));
        ActionUtils.set_value(tradeInValue,ExcelUtility.excel("VehicleType",3));
        ActionUtils.waitFor(2);
        ActionUtils.set_value(tradeInDebt, ExcelUtility.excel("VehicleType",4));
        ActionUtils.waitFor(2);
        ActionUtils.click(tradeInValue);
        tradeInValue.sendKeys(Keys.BACK_SPACE);
        ActionUtils.waitFor(3);
        ActionUtils.select_by_value(Vehicle_type,"Used");
        ActionUtils.visibilityOfElement(term);
        ActionUtils.select_by_value(term,"60");
    }

    public void fillCollateralInformationForUsed() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        ActionUtils.set_text(Mileage, ExcelUtility.excel("VehicleType",5));
        ActionUtils.set_text(VIN, ExcelUtility.excel("VehicleType",6));
        ActionUtils.waitFor(10);
        ActionUtils.visibilityOfElement(series);
        ActionUtils.waitFor(5);
        ActionUtils.select_by_value(series,"SE");
        ActionUtils.waitFor(3);
        ActionUtils.visibilityOfElement(style);
        ActionUtils.select_by_value(style,"4D Hatchback 6sp");
        ActionUtils.waitFor(5);
        ActionUtils.select_by_value(imported, "0");
        ActionUtils.set_text(color,"123455");
        String ColorError = ActionUtils.get_text(colorError);
        soft.assertEquals(ColorError,"Please enter a valid string");
        ActionUtils.clear(color);
        ActionUtils.set_text(color, ExcelUtility.excel("VehicleType",8));
        ActionUtils.set_text(licensePlate,"!@#$123");
        String licenseError = ActionUtils.get_text(licensePlateError);
        soft.assertEquals(licenseError,"Please enter a valid string");
        ActionUtils.clear(licensePlate);
        ActionUtils.set_text(licensePlate, ExcelUtility.excel("VehicleType",9));
//        Application_Uitility.scroll_till_element(Additional_Equipment_1);
//        Application_Uitility.click(Additional_Equipment_1);
//        Application_Uitility.scroll_till_element(Additional_Equipment_2);
//        Application_Uitility.click(Additional_Equipment_2);
        soft.assertAll();
    }

    public void addAdditionalProduct() throws InterruptedException {

        ActionUtils.scroll_till_element(APBox1);
        ActionUtils.click(APBox1);
        ActionUtils.select_by_value(APCoverage1,"17");
        ActionUtils.set_text(APSalesPrice1,"599");
        ActionUtils.scroll_till_element(APBox2);
        ActionUtils.click(APBox2);
        ActionUtils.select_by_value(APCoverage2,"36");
        ActionUtils.set_text(APSalesPrice2,"699");
    }
}
