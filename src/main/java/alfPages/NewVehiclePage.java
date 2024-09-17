package alfPages;
import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import excelUtility.ExcelUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class NewVehiclePage extends BaseLibrary {

    ActionUtils actionUtils = new ActionUtils();
    public NewVehiclePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='salesPrice']")
    public static WebElement salesPrice;
    @FindBy(xpath = "//input[@id='downPayment']")
    public static WebElement downPayment;
    @FindBy(xpath = "//select[@id='insuranceType']")
    WebElement insuranceType;
    @FindBy(xpath = "//input[@id='insurance']")
    public static WebElement insurance;
    @FindBy(xpath = "//input[@id='tradeInValue']")
    WebElement tradeInValue;
    @FindBy(xpath = "//input[@id='tradeInDebt']")
    WebElement tradeInDebt;
    @FindBy(xpath = "//input[@id='netTradeIn']")
    public static WebElement netTradeIn;
    @FindBy(xpath = "//select[@id='vehicleType']")
    WebElement vehicleType;
    @FindBy(xpath = "//option[@value='New']")
    WebElement New;
    @FindBy(xpath = "//select[@id='term']")
    WebElement term;
    @FindBy(xpath = "//input[@id='mileage']")
    WebElement Mileage;
    @FindBy(xpath = "//input[@id='vin']")
    WebElement VIN;
    @FindBy(xpath = "//input[@id='year']")
    WebElement year;
    @FindBy(xpath = "//span[@aria-labelledby='select2-make-container']")
    WebElement make;
    @FindBy(xpath = "//li[contains(text(),'NISSAN')]")
    WebElement makeNISSAN;
    @FindBy(xpath = "//span[@aria-labelledby='select2-model-container']")
    WebElement model;
    @FindBy(xpath = "//li[contains(text(),'ALTIMA')]")
    WebElement modelALTIMA;
    @FindBy(xpath = "//span[@aria-labelledby='select2-series-container']")
    WebElement series;
    @FindBy(xpath = "//li[contains(text(),'SV')]")
    WebElement seriesSV;
    @FindBy(xpath = "//span[@aria-labelledby='select2-manufacturerCode-container']")
    WebElement manufacturerCode;
    @FindBy(xpath = "//input[@id='style']")
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
    @FindBy(xpath = "//input[@id='value']")
    WebElement value;
    @FindBy(xpath = "//label[@for='additionalProduct5']")
    WebElement APBox1;
    @FindBy(xpath = "//select[@id='coverageProductType5']")
    WebElement APCoverage1;
    @FindBy(xpath = "//input[@id='priceCoverageProductType5']")
    public static WebElement APSalesPrice1;
    @FindBy(xpath = "//label[@for='additionalProduct6']")
    WebElement APBox2;
    @FindBy(xpath = "//select[@id='coverageProductType6']")
    WebElement APCoverage2;
    @FindBy(xpath = "//input[@id='priceCoverageProductType6']")
    public static WebElement APSalesPrice2;

    public void fillDealDetailForNew() throws InterruptedException {
        ActionUtils.set_value(salesPrice, ExcelUtility.excel("VehicleType",0));
        ActionUtils.set_value(downPayment, ExcelUtility.excel("VehicleType", 1));
        ActionUtils.select_by_value(insuranceType, "Double Interest");
        ActionUtils.set_text(insurance, ExcelUtility.excel("VehicleType",2));
        ActionUtils.set_value(tradeInValue,ExcelUtility.excel("VehicleType",3));
        ActionUtils.waitFor(2);
        ActionUtils.set_value(tradeInDebt, ExcelUtility.excel("VehicleType",4));
        ActionUtils.waitFor(2);
        ActionUtils.click(tradeInValue);
        tradeInValue.sendKeys(Keys.BACK_SPACE);
        ActionUtils.waitFor(3);
        ActionUtils.select_by_value(vehicleType,"New");
//        ApplicationUtility.click(Vehicle_type);
//        ApplicationUtility.waitFor(2);
//        ApplicationUtility.click(New);
        ActionUtils.waitFor(5);
        ActionUtils.select_by_value(term,"60");
    }

    public void fillCollateralInformationForNew() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        ActionUtils.set_text(Mileage, ExcelUtility.excel("VehicleType",5));
        ActionUtils.set_text(VIN, ExcelUtility.excel("VehicleType",6));
        ActionUtils.waitFor(3);
        ActionUtils.set_text(year,ExcelUtility.excel("VehicleType",7));
        ActionUtils.waitFor(5);
        ActionUtils.click(make);
        ActionUtils.click(makeNISSAN);
        ActionUtils.waitFor(2);
        ActionUtils.click(model);
        ActionUtils.click(modelALTIMA);
        ActionUtils.waitFor(2);
        ActionUtils.click(series);
        ActionUtils.click(seriesSV);
        ActionUtils.waitFor(2);
        String mCode = ActionUtils.get_text(manufacturerCode);
        System.out.printf("The Manufacturer Code is "+mCode);
        ActionUtils.waitFor(2);
//        String Style = ApplicationUtility.get_text(style);
//        System.out.printf("The Style is "+ Style);

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
        ActionUtils.clear(VIN);
//        ApplicationUtility.visibilityOfElement(value);
//        ApplicationUtility.scroll_till_element(value);
//        String value_of_vehicle = ApplicationUtility.get_text(value);
//        System.out.println("The Value of Vehicle is "+value_of_vehicle);
        soft.assertAll();
    }

    public void addAdditionalProduct() throws InterruptedException {

        ActionUtils.scroll_till_element(APBox1);
        ActionUtils.click(APBox1);
        ActionUtils.waitFor(2);
        ActionUtils.select_by_value(APCoverage1,"17");
        ActionUtils.set_text(APSalesPrice1,"599");
        actionUtils.screenshot();
        ActionUtils.scroll_till_element(APBox2);
        ActionUtils.click(APBox2);
        ActionUtils.waitFor(2);
        ActionUtils.select_by_value(APCoverage2,"36");
        ActionUtils.set_text(APSalesPrice2,"699");
    }
}
