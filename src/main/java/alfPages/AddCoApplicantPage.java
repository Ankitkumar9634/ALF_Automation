package alfPages;

import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import excelUtility.ExcelUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class AddCoApplicantPage extends BaseLibrary
{
    ActionUtils actionUtils = new ActionUtils();
    public AddCoApplicantPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='hasCoApplicant']")
    WebElement add_co_applicant_check_box;
    @FindBy(xpath = "//input[@id='cosocialSecurityNumber']")
    WebElement co_SSN;
    @FindBy(xpath = "//input[@id='codateOfBirth']")
    WebElement coDateOfBirth;
    @FindBy(xpath = "//select[@id='cocitizenship']")
    WebElement coCitizenship;
    @FindBy(xpath = "//select[@id='comaritalStatus']")
    WebElement comaritalStatus;
    @FindBy(xpath = "//select[@id='cogender']")
    WebElement coGender;
    @FindBy(xpath = "//input[@id='cofirstName']")
    WebElement coFirstName;
    @FindBy(xpath = "//input[@id='comiddleName']")
    WebElement coMiddleName;
    @FindBy(xpath = "//input[@id='colastName']")
    WebElement coLastName;
    @FindBy(xpath = "//input[@id='comotherMaidenName']")
    WebElement coMotherMaidenName;
    @FindBy(xpath = "//select[@id='coidType']")
    WebElement coIdType;
    @FindBy(xpath = "//input[@id='coidNumber']")
    WebElement coIdNumber;
    @FindBy(xpath = "//select[@id='cocountry']")
    WebElement coCountry;
    @FindBy(xpath = "//select[@id='costate']")
    WebElement coState;
    @FindBy(xpath = "//select[@id='coprimaryNumberType']")
    WebElement coPrimaryNumberType;
    @FindBy(xpath = "//input[@id='cohomePhone']")
    WebElement coHomePhone;
    @FindBy(xpath = "//input[@id='comobilePhone']")
    WebElement coMobilePhone;
    @FindBy(xpath = "//input[@id='coemail']")
    WebElement coEmail;
    @FindBy(xpath = "//select[@id='cocountryPhyAddress']")
    WebElement coCountryPhyAddress;
    @FindBy(xpath = "//select[@id='costateAPhyddress']")
    WebElement coStatePhyAddress;
    @FindBy(xpath = "//select[@id='cocity']")
    WebElement coCity;
    @FindBy(xpath = "//select[@id='copostalCode']")
    WebElement coPostalCode;
    @FindBy(xpath = "//input[@id='coline1']")
    WebElement coline1;
    @FindBy(xpath = "//input[@id='coline2']")
    WebElement coline2;
    @FindBy(xpath = "//select[@id='coresidenceType']")
    WebElement coResidenceType;
    @FindBy(xpath = "//input[@id='comonthlyPayment']")
    WebElement coMonthlyPayment;
    @FindBy(xpath = "//input[@id='coyearsInResidence']")
    WebElement coYearsInResidence;
    @FindBy(xpath = "//input[@id='comonthsInResidence']")
    WebElement coMonthsInResidence;
    @FindBy(xpath = "//select[@id='copreviousCountryPhyAddress']")
    WebElement coPreviousCountryPhyAddress;
    @FindBy(xpath = "//select[@id='copreviousStateAPhyddress']")
    WebElement coPreviousStatePhyAddress;
    @FindBy(xpath = "//select[@id='copreviousCity']")
    WebElement coPreviousCity;
    @FindBy(xpath = "//select[@id='copreviousPostalCode']")
    WebElement coPreviousPostalCode;
    @FindBy(xpath = "//input[@id='copreviousLine1']")
    WebElement coPreviousLine1;
    @FindBy(xpath = "//input[@id='copreviousLine2']")
    WebElement coPreviousLine2;
    @FindBy(xpath = "//select[@id='copreviousResidenceType']")
    WebElement coPreviousResidenceType;
    @FindBy(xpath = "//input[@id='comailingCheckbox']//..")
    WebElement coMailingCheckbox;
    @FindBy(xpath = "//input[@id='coidExpirationDate']")
    WebElement coIdExpirationDate;
    public void coApplicantDetails() throws InterruptedException {
//        SoftAssert soft = new SoftAssert();
        ActionUtils.scroll_till_element(add_co_applicant_check_box);
        ActionUtils.click(add_co_applicant_check_box);
        add_co_applicant_check_box.isSelected();
//        soft.assertTrue(add_co_applicant_check_box.isSelected());
        actionUtils.screenshot();
        ActionUtils.set_text(co_SSN, ExcelUtility.excel("CoApplicant",0));
        ActionUtils.waitFor(2);
        ActionUtils.set_text(coDateOfBirth, ExcelUtility.excel("CoApplicant",1));
        ActionUtils.click(co_SSN);
        ActionUtils.select_by_value(coCitizenship, "Resident");
        ActionUtils.select_by_value(comaritalStatus, "Married");
        ActionUtils.select_by_value(coGender, "F");
        ActionUtils.set_text(coFirstName, ExcelUtility.excel("CoApplicant",2));
        ActionUtils.set_text(coMiddleName, ExcelUtility.excel("CoApplicant",3));
        ActionUtils.set_text(coLastName, ExcelUtility.excel("CoApplicant",4));
        ActionUtils.set_text(coMotherMaidenName, ExcelUtility.excel("CoApplicant",5));
        ActionUtils.select_by_value(coIdType, "DTOP ID");
        ActionUtils.set_text(coIdNumber, ExcelUtility.excel("CoApplicant",6));
        ActionUtils.select_by_value(coCountry, "US");
        ActionUtils.select_by_value(coState, "PR");
        ActionUtils.select_by_value(coPrimaryNumberType, "Residential");
        actionUtils.screenshot();
        ActionUtils.scroll_till_element(coIdExpirationDate);
        ActionUtils.set_text(coIdExpirationDate, ExcelUtility.excel("CoApplicant",7));
        ActionUtils.click(coHomePhone);
        ActionUtils.set_text(coHomePhone, ExcelUtility.excel("CoApplicant",8));
        ActionUtils.set_text(coMobilePhone, ExcelUtility.excel("CoApplicant",9));
        ActionUtils.set_text(coEmail, ExcelUtility.excel("CoApplicant",10));
//        soft.assertAll();
    }

    public void coApplicantPhysicalAddress() {
        ActionUtils.select_by_value(coCountryPhyAddress, "US");
        ActionUtils.select_by_value(coStatePhyAddress, "PR");
        ActionUtils.select_by_value(coCity, "Aibonito");
        ActionUtils.select_by_value(coPostalCode, "00705");
        ActionUtils.set_text(coline1, ExcelUtility.excel("CoApplicant",11));
        ActionUtils.set_text(coline2, ExcelUtility.excel("CoApplicant",12));
        ActionUtils.select_by_value(coResidenceType, "Family");
        ActionUtils.set_text(coMonthlyPayment, ExcelUtility.excel("CoApplicant",13));
        ActionUtils.set_text(coYearsInResidence, ExcelUtility.excel("CoApplicant",14));
        ActionUtils.set_text(coMonthsInResidence, ExcelUtility.excel("CoApplicant",15));
    }

    public void coPreviousPhysicalAddress() throws InterruptedException {
        ActionUtils.select_by_value(coPreviousCountryPhyAddress,"US");
        ActionUtils.select_by_value(coPreviousStatePhyAddress,"PR");
        ActionUtils.select_by_value(coPreviousCity,"Isabela");
        ActionUtils.select_by_value(coPreviousPostalCode,"00622");
        ActionUtils.set_text(coPreviousLine1,ExcelUtility.excel("CoApplicant",16));
        ActionUtils.set_text(coPreviousLine2, ExcelUtility.excel("CoApplicant",17));
        ActionUtils.select_by_value(coPreviousResidenceType,"Others");
        ActionUtils.scroll_till_element(coMailingCheckbox);
        ActionUtils.click(coMailingCheckbox);
    }

    @FindBy(xpath = "//select[@id='coemploymentType']")
    WebElement coEmploymentType;
    @FindBy(xpath = "//input[@id='coemployerName']")
    WebElement coEmployerName;
    @FindBy(xpath = "//input[@id='cosupervisor']")
    WebElement coSupervisor;
    @FindBy(xpath = "//select[@id='coposition']")
    WebElement coPosition;
    @FindBy(xpath = "//select[@id='coindustry']")
    WebElement coIndustry;
    @FindBy(xpath = "//input[@id='coemployerPhone']")
    WebElement coEmployerPhone;
    @FindBy(xpath = "//input[@id='cootherEmployerPhone']")
    WebElement coOtherEmployerPhone;
    @FindBy(xpath = "//select[@id='copaymentMethod']")
    WebElement coPaymentMethod;
    @FindBy(xpath = "//input[@id='coyears']")
    WebElement coEmployerYears;
    @FindBy(xpath = "//input[@id='comonths']")
    WebElement coEmployerMonth;
    @FindBy(xpath = "//input[@id='cosalary']")
    WebElement coEmployerSalary;
    @FindBy(xpath = "//input[@id='coworkEmail']")
    WebElement coEmploymentWorkEmail;
    @FindBy(xpath = "//select[@id='cocountryWork']")
    WebElement coCountryWork;
    @FindBy(xpath = "//select[@id='costateWork']")
    WebElement coStateWork;
    @FindBy(xpath = "//select[@id='coemploymentCity']")
    WebElement coEmploymentCity;
    @FindBy(xpath = "//select[@id='coemploymentPostalCode']")
    WebElement coEmploymentPostalCode;
    @FindBy(xpath = "//input[@id='coline1Work']")
    WebElement coline1Work;
    @FindBy(xpath = "//input[@id='coline2Work']")
    WebElement coline2Work;
    @FindBy(xpath = "//button[@id='coaddNewEmployInfo']")
    WebElement coAddNewEmployInfo;
    @FindBy(xpath = "//select[@id='coemploymentStatus']")
    WebElement coEmploymentStatus;
    @FindBy(xpath = "//select[@id='coemploymentType2']")
    WebElement coEmploymentType2;
    @FindBy(xpath = "//input[@id='coemployerName2']")
    WebElement coEmployerName2;
    @FindBy(xpath = "//input[@id='cosupervisor2']")
    WebElement coSupervisor2;
    @FindBy(xpath = "//select[@id='coposition2']")
    WebElement coPosition2;
    @FindBy(xpath = "//select[@id='coindustry2']")
    WebElement coIndustry2;
    @FindBy(xpath = "//input[@id='coemployerPhone2']")
    WebElement coEmployerPhone2;
    @FindBy(xpath = "//input[@id='cootherEmployerPhone2']")
    WebElement coOtherEmployerPhone2;
    @FindBy(xpath = "//select[@id='copaymentMethod2']")
    WebElement coPaymentMethod2;
    @FindBy(xpath = "//input[@id='coyears2']")
    WebElement coOtherEmployerYears2;
    @FindBy(xpath = "//input[@id='comonths2']")
    WebElement coOtherEmployerMonths2;
    @FindBy(xpath = "//input[@id='cosalary2']")
    WebElement coSalary2;
    @FindBy(xpath = "//input[@id='coworkEmail2']")
    WebElement coWorkEmail2;
    @FindBy(xpath = "//select[@id='cocountryWork2']")
    WebElement coCountryWork2;

    @FindBy(xpath = "//select[@id='costateWork2']")
    WebElement coStateWork2;

    @FindBy(xpath = "//select[@id='coemploymentCity2']")
    WebElement coEmploymentCity2;

    @FindBy(xpath = "//select[@id='coemploymentPostalCode2']")
    WebElement coEmploymentPostalCode2;
    @FindBy(xpath = "//input[@id='coline1Work2']")
    WebElement coline1Work2;
    @FindBy(xpath = "//input[@id='coline2Work2']")
    WebElement coline2Work2;
    @FindBy(xpath = "//button[@id='cobtnAddNewAdditional']")
    WebElement coAddNewAdditionalIncome;
    @FindBy(xpath = "//select[@id='coadditionalIncomeType']")
    WebElement coAdditionalIncomeType;
    @FindBy(xpath = "//input[@id='coadditionalAmount-0-1']")
    WebElement coAdditionalAmount;
    @FindBy(xpath = "//select[@id='coadditionalSource']")
    WebElement coAdditionalSource;
    public void coApplicantEmploymentInformation() throws InterruptedException {
        ActionUtils.select_by_value(coEmploymentType, "Self Employed");
        ActionUtils.set_text(coEmployerName, ExcelUtility.excel("CoEmpInfo",0));
        ActionUtils.set_text(coSupervisor, ExcelUtility.excel("CoEmpInfo",1));
        ActionUtils.select_by_value(coPosition, "55");
        ActionUtils.select_by_value(coIndustry, "Leisure and hospitality");
        ActionUtils.set_text(coEmployerPhone, ExcelUtility.excel("CoEmpInfo",2));
        ActionUtils.set_text(coOtherEmployerPhone, ExcelUtility.excel("CoEmpInfo",3));
        ActionUtils.select_by_value(coPaymentMethod, "Direct Deposit");
        ActionUtils.set_text(coEmployerYears, ExcelUtility.excel("CoEmpInfo",4));
        ActionUtils.set_text(coEmployerMonth, ExcelUtility.excel("CoEmpInfo",5));
        ActionUtils.set_text(coEmployerSalary, ExcelUtility.excel("CoEmpInfo",6));
        ActionUtils.set_text(coEmploymentWorkEmail, ExcelUtility.excel("CoEmpInfo",7));
        ActionUtils.select_by_value(coCountryWork, "US");
        ActionUtils.select_by_value(coStateWork, "PR");
        ActionUtils.select_by_value(coEmploymentCity, "Aguas Buenas");
        ActionUtils.select_by_value(coEmploymentPostalCode, "00703");
        ActionUtils.set_text(coline1Work, ExcelUtility.excel("CoEmpInfo",8));
        ActionUtils.set_text(coline2Work, ExcelUtility.excel("CoEmpInfo",9));
    }

    @FindBy(xpath = "//div[@id='coemployInfo2']//label[contains(text(),'Employment Status')]")
    WebElement conformAddCoEmployment;
    @FindBy(xpath = "//button[@id='coremoveNewEmployInfo']")
    WebElement coEmploymentDelete;

    public void deleteAddCoEmploymentInformation() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        ActionUtils.scroll_till_element(coAddNewEmployInfo);
        ActionUtils.click(coAddNewEmployInfo);
        String conformAdd = ActionUtils.get_text(conformAddCoEmployment);
        soft.assertEquals(conformAdd,"Employment Status\n*");
        ActionUtils.scroll_till_element(coEmploymentDelete);
        ActionUtils.click(coEmploymentDelete);
        soft.assertAll();
    }

    public void addCoEmploymentInformation() throws InterruptedException {
        ActionUtils.scroll_till_element(coAddNewEmployInfo);
        ActionUtils.click(coAddNewEmployInfo);
        ActionUtils.select_by_value(coEmploymentStatus, "P");
        ActionUtils.select_by_value(coEmploymentType2, "Self Employed");
        ActionUtils.set_text(coEmployerName2, ExcelUtility.excel("CoEmpInfo",10));
        ActionUtils.set_text(coSupervisor2, ExcelUtility.excel("CoEmpInfo",11));
        ActionUtils.select_by_value(coPosition2, "55");
        actionUtils.screenshot();
        ActionUtils.select_by_value(coIndustry2, "Information");
        ActionUtils.set_text(coEmployerPhone2, ExcelUtility.excel("CoEmpInfo",12));
        ActionUtils.set_text(coOtherEmployerPhone2, ExcelUtility.excel("CoEmpInfo",13));
        ActionUtils.select_by_value(coPaymentMethod2, "Check");
        ActionUtils.set_text(coOtherEmployerYears2, ExcelUtility.excel("CoEmpInfo",14));
        ActionUtils.set_text(coOtherEmployerMonths2, ExcelUtility.excel("CoEmpInfo",15));
        ActionUtils.set_text(coSalary2, ExcelUtility.excel("CoEmpInfo",16));
        ActionUtils.set_text(coWorkEmail2, ExcelUtility.excel("CoEmpInfo",17));
        ActionUtils.select_by_value(coCountryWork2, "US");
        ActionUtils.select_by_value(coStateWork2, "PR");
        ActionUtils.select_by_value(coEmploymentCity2, "Patillas");
        ActionUtils.select_by_value(coEmploymentPostalCode2, "00723");
        ActionUtils.set_text(coline1Work2, ExcelUtility.excel("CoEmpInfo",18));
        ActionUtils.set_text(coline2Work2, ExcelUtility.excel("CoEmpInfo",19));
    }
    @FindBy(xpath = "//div[contains(text(),'Max 2 records can be added')]")
    WebElement warningCo;
    @FindBy(xpath = "(//i[@class='fa fa-trash delete-row text-dark'])[2]")
    WebElement deleteCoAdd;

    public void coApplicantAdditionalMonthlyIncome() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        ActionUtils.scroll_till_element(coAddNewAdditionalIncome);
        ActionUtils.click(coAddNewAdditionalIncome);
        ActionUtils.click(coAddNewAdditionalIncome);
        ActionUtils.click(coAddNewAdditionalIncome);
        String Warning = ActionUtils.get_text(warningCo);
        soft.assertEquals(Warning,"Max 2 records can be added");
        actionUtils.screenshot();
        ActionUtils.waitFor(2);
        ActionUtils.click(deleteCoAdd);
        ActionUtils.select_by_value(coAdditionalIncomeType,"7");
        ActionUtils.set_text(coAdditionalAmount, ExcelUtility.excel("CoEmpInfo",20));
        ActionUtils.select_by_value(coAdditionalSource,"2");
        soft.assertAll();
    }
}
