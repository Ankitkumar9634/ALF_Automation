package alfPages;

import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import static alfPages.FillApplicantDetailsPage.*;
import static alfPages.NewVehiclePage.*;

public class SaveSubmitPage extends BaseLibrary {

    ActionUtils actionUtils = new ActionUtils();
    FillApplicantDetailsPage fill = new FillApplicantDetailsPage();
    public SaveSubmitPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//button[contains(text(),'Submit')])[1]")
    WebElement Submit;
    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
    WebElement Save;
    @FindBy(xpath = "//div[contains(text(),'Do you want to save this application as draft?')]")
    WebElement saveAlert;
    @FindBy(xpath = "//button[contains(text(),'Yes, save as draft!')]")
    WebElement yesSave;
    @FindBy(xpath = "//div[contains(text(),'Application saved in draft successfully')]")
    WebElement saveSuccessfully;
    @FindBy(xpath = "//div[contains(text(),'Application submitted successfully')]")
    WebElement submitSuccessfully;
    @FindBy(xpath = "(//p[@class='value-name'])[1]")
    WebElement getDataValue;
    public void save() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        ActionUtils.scroll_till_element(Save);
        ActionUtils.click(Save);
        String SaveAlert = ActionUtils.get_text(saveAlert);
        soft.assertEquals(SaveAlert,"Do you want to save this application as draft?");
        ActionUtils.click(yesSave);
        ActionUtils.visibilityOfElement(saveSuccessfully);
        String confirmSave = ActionUtils.get_text(saveSuccessfully);
        soft.assertEquals(confirmSave,"Application saved in draft successfully");
        System.out.println(confirmSave);
        actionUtils.screenshot();
        ActionUtils.waitFor(10);
        soft.assertAll();
    }

    public void editInDraft() throws InterruptedException {
        ActionUtils.scroll_till_element(SSN);
        ActionUtils.clear(SSN);
        ActionUtils.set_text(SSN,"666870267 ");
        ActionUtils.scroll_till_element(applicantDateOfBirth);
        ActionUtils.clear(applicantDateOfBirth);
        ActionUtils.set_text(applicantDateOfBirth,"09/12/2004");
        ActionUtils.click(first_name);
        ActionUtils.waitFor(10);
    }

    public void submitAndFinanceCalculation() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        ActionUtils.scroll_till_element(salesPrice);
        String SalesPrice = salesPrice.getAttribute("value");
        String DownPayment = downPayment.getAttribute("value");
        String Insurance = insurance.getAttribute("value");
        String Net_Trade_In = netTradeIn.getAttribute("value");
        ActionUtils.scroll_till_element(APSalesPrice1);
        String apSalesPrice1 = APSalesPrice1.getAttribute("value");
        String apSalesPrice2 = APSalesPrice2.getAttribute("value");
        ActionUtils.scroll_till_bottom_page();
        ActionUtils.waitFor(5);
        ActionUtils.click(Submit);
        ActionUtils.visibilityOfElement(submitSuccessfully);
        String confirmSubmit = ActionUtils.get_text(submitSuccessfully);
        soft.assertEquals(confirmSubmit,"Application submitted successfully");
        System.out.println(confirmSubmit);
        float amountValue = Float.parseFloat(SalesPrice.replaceAll(",",""))
                + Float.parseFloat(Insurance.replaceAll(",",""))
                + Float.parseFloat(apSalesPrice1) + Float.parseFloat(apSalesPrice2.replaceAll(",",""))
                - Float.parseFloat(DownPayment.replaceAll(",",""))
                -Float.parseFloat(Net_Trade_In.replaceAll(",",""));
        float getAmountValue = Float.parseFloat(ActionUtils.get_text(getDataValue).replaceAll("[,$]",""));
        System.out.println("The Amount is : " + amountValue);
        System.out.println("The getAmount is :"+getAmountValue);
        soft.assertEquals(amountValue,getAmountValue);
        soft.assertAll();
    }
}
