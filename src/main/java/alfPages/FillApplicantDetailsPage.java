package alfPages;
import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import excelUtility.ExcelUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class FillApplicantDetailsPage extends BaseLibrary
{
    public FillApplicantDetailsPage(){
        PageFactory.initElements(driver,this);
    }
    ActionUtils actionUtils = new ActionUtils();

    @FindBy(xpath = "//input[@id='socialSecurityNumber']")
    static WebElement SSN;
    @FindBy(xpath = "//input[@id='dateOfBirth']")
    static WebElement applicantDateOfBirth;
    @FindBy(xpath = "//select[@id='citizenship']")
    WebElement citizenship;
    @FindBy(xpath = "//select[@id='maritalStatus']")
    WebElement marital_status;
    @FindBy(xpath = "//select[@id='gender']")
    WebElement gender;
    @FindBy(xpath = "//input[@id='firstName']")
    static WebElement first_name;
    @FindBy(xpath = "//input[@id='middleName']")
    WebElement middleName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='motherMaidenName']")
    WebElement motherName;
    @FindBy(xpath = "//select[@id='idType']")
    WebElement idType;
    @FindBy(xpath = "//input[@id='idNumber']")
    WebElement idNumber;
    @FindBy(xpath = "//select[@id='country']")
    WebElement country;
    @FindBy(xpath = "//select[@id='state']")
    WebElement state;
    @FindBy(xpath = "//select[@id='primaryNumberType']")
    WebElement primaryNumberType;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='homePhone']")
    WebElement homePhone;
    @FindBy(xpath = "//input[@id='idExpirationDate']")
    WebElement applicantIdExpirationDate;
    @FindBy(xpath = "//input[@id='mobilePhone']")
    WebElement mobilePhone;
    @FindBy(xpath = "//select[@id='countryPhyAddress']")
    WebElement countryPhy;
    @FindBy(xpath = "//select[@id='stateAPhyddress']")
    WebElement statePhy;
    @FindBy(xpath = "//select[@id='city']")
    WebElement cityPhy;
    @FindBy(xpath = "//select[@id='postalCode']")
    WebElement postalCodePhy;
    @FindBy(xpath = "//input[@id='line1']")
    WebElement line_1_Phy;
    @FindBy(xpath = "//input[@id='line2']")
    WebElement line_2_Phy;
    @FindBy(xpath = "//select[@id='residenceType']")
    WebElement residenceType_Phy;
    @FindBy(xpath = "//input[@id='monthlyPayment']")
    WebElement monthlyPayment_Phy;
    @FindBy(xpath = "//input[@id='yearsInResidence']")
    WebElement yearInResidence_Phy;
    @FindBy(xpath = "//input[@id='monthsInResidence']")
    WebElement monthInResidence_Phy;
    @FindBy(xpath = "//select[@id='previousCountryPhyAddress']")
    WebElement previousCountryPhy;
    @FindBy(xpath = "//select[@id='previousStateAPhyddress']")
    WebElement previousStatePhy;
    @FindBy(xpath = "//select[@id='previousCity']")
    WebElement previousCityPhy;
    @FindBy(xpath = "//select[@id='previousPostalCode']")
    WebElement previousPostalCode_Phy;
    @FindBy(xpath = "//input[@id='previousLine1']")
    WebElement previousLine1_Phy;
    @FindBy(xpath = "//input[@id='previousLine2']")
    WebElement previousLine2_Phy;
    @FindBy(xpath = "//select[@id='previousResidenceType']")
    WebElement previousResidenceType_Phy;
    @FindBy(xpath = "//input[@id='mailingCheckbox']//..")
    WebElement samePhysicalAddress;
    public void applicantInformation() throws InterruptedException {
        ActionUtils.set_text(SSN, ExcelUtility.excel("ApplicantDetails",0));
        ActionUtils.waitFor(2);
        ActionUtils.set_text(applicantDateOfBirth, ExcelUtility.excel("ApplicantDetails",1));
        ActionUtils.click(SSN);
        ActionUtils.select_by_value(citizenship, "Resident");
        ActionUtils.select_by_value(marital_status, "Married");
        ActionUtils.select_by_value(gender, "M");
        ActionUtils.click(first_name);
        ActionUtils.set_text(first_name, ExcelUtility.excel("ApplicantDetails",2));
        ActionUtils.set_text(middleName, ExcelUtility.excel("ApplicantDetails",3));
        ActionUtils.set_text(lastName, ExcelUtility.excel("ApplicantDetails",4));
        ActionUtils.set_text(motherName, ExcelUtility.excel("ApplicantDetails",5));
        ActionUtils.select_by_value(idType, "Passport");
        ActionUtils.set_text(idNumber, ExcelUtility.excel("ApplicantDetails",6));
        ActionUtils.select_by_value(country, "US");
        ActionUtils.select_by_value(state, "PR");
        ActionUtils.select_by_value(primaryNumberType, "Mobile");
        actionUtils.screenshot();
//        String PrimeryNubertype = ActionUtils.get_text(primaryNumberType);
//        System.out.println(PrimeryNubertype);
        ActionUtils.scroll_till_element(applicantIdExpirationDate);
        ActionUtils.set_text(applicantIdExpirationDate, ExcelUtility.excel("ApplicantDetails",7));
        ActionUtils.click(homePhone);
        ActionUtils.set_text(homePhone, ExcelUtility.excel("ApplicantDetails",8));
        ActionUtils.set_text(mobilePhone, ExcelUtility.excel("ApplicantDetails",9));
        ActionUtils.set_text(email, ExcelUtility.excel("ApplicantDetails",10));
    }

    public void physicalAddress() {
        ActionUtils.select_by_value(countryPhy, "US");
        ActionUtils.select_by_value(statePhy, "PR");
        ActionUtils.select_by_value(cityPhy, "Aibonito");
        ActionUtils.select_by_value(postalCodePhy, "00705");
        ActionUtils.set_text(line_1_Phy, ExcelUtility.excel("ApplicantDetails",11));
        ActionUtils.set_text(line_2_Phy, ExcelUtility.excel("ApplicantDetails",12));
        ActionUtils.select_by_value(residenceType_Phy, "Owner");
        ActionUtils.set_text(monthlyPayment_Phy, ExcelUtility.excel("ApplicantDetails",13));
        ActionUtils.set_text(yearInResidence_Phy, ExcelUtility.excel("ApplicantDetails",14));
        ActionUtils.set_text(monthInResidence_Phy, ExcelUtility.excel("ApplicantDetails",15));
    }

    public void previousPhysicalAddress() throws InterruptedException {
        ActionUtils.select_by_value(previousCountryPhy,"US");
        ActionUtils.select_by_value(previousStatePhy,"PR");
        ActionUtils.select_by_value(previousCityPhy,"Florida");
        ActionUtils.select_by_value(previousPostalCode_Phy,"00650");
        ActionUtils.set_text(previousLine1_Phy, ExcelUtility.excel("ApplicantDetails",16));
        ActionUtils.set_text(previousLine2_Phy, ExcelUtility.excel("ApplicantDetails",17));
        ActionUtils.select_by_value(previousResidenceType_Phy,"Renter");
        actionUtils.screenshot();
        ActionUtils.scroll_till_element(samePhysicalAddress);
        ActionUtils.click(samePhysicalAddress);
    }

    @FindBy(xpath = "//select[@id='employmentType']")
    WebElement EmploymentType;
    @FindBy(xpath = "//input[@id='employerName']")
    WebElement employerName;
    @FindBy(xpath = "//input[@id='supervisor']")
    WebElement supervisor;
    @FindBy(xpath = "//select[@id='position']")
    WebElement position;
    @FindBy(xpath = "//select[@id='industry']")
    WebElement industry;
    @FindBy(xpath = "//input[@id='employerPhone']")
    WebElement employerPhone;
    @FindBy(xpath = "//input[@id='otherEmployerPhone']")
    WebElement otherEmployerPhone;
    @FindBy(xpath = "//select[@id='paymentMethod']")
    WebElement paymentMethod;
    @FindBy(xpath = "//input[@id='years']")
    WebElement employerYears;
    @FindBy(xpath = "//input[@id='months']")
    WebElement employerMonths;
    @FindBy(xpath = "//input[@id='salary']")
    WebElement employerSalary;
    @FindBy(xpath = "//input[@id='workEmail']")
    WebElement workEmail;
    @FindBy(xpath = "//select[@id='countryWork']")
    WebElement workCountry;
    @FindBy(xpath = "//select[@id='stateWork']")
    WebElement workState;
    @FindBy(xpath = "//select[@id='employmentCity']")
    WebElement employmentCity;
    @FindBy(xpath = "//select[@id='employmentPostalCode']")
    WebElement employmentPostalCode;
    @FindBy(xpath = "//input[@id='line1Work']")
    WebElement line1Work;
    @FindBy(xpath = "//input[@id='line2Work']")
    WebElement line2Work;
    @FindBy(xpath = "//button[@id='btnAddNewAdditional']")
    WebElement AddNewAdditional;
    @FindBy(xpath = "//select[@id='additionalIncomeType']")
    WebElement additionalIncomeType;
    @FindBy(xpath = "//input[@id='additionalAmount-0-0-0']")
    WebElement additionalAmount;
    @FindBy(xpath = "//select[@id='additionalSource']")
    WebElement additionalSource;
    @FindBy(xpath = "//button[@id='addNewEmployInfo']")
    WebElement addNewEmployInfo;
    @FindBy(xpath = "//select[@id='employmentStatus']")
    WebElement employmentStatus;
    @FindBy(xpath = "//select[@id='employmentType2']")
    WebElement employmentType2;
    @FindBy(xpath = "//input[@id='employerName2']")
    WebElement employerName2;
    @FindBy(xpath = "//input[@id='supervisor2']")
    WebElement supervisor2;
    @FindBy(xpath = "//select[@id='position2']")
    WebElement position2;
    @FindBy(xpath = "//select[@id='industry2']")
    WebElement industry2;
    @FindBy(xpath = "//input[@id='employerPhone2']")
    WebElement employerPhone2;
    @FindBy(xpath = "//input[@id='otherEmployerPhone2']")
    WebElement otherEmployerPhone2;
    @FindBy(xpath = "//select[@id='paymentMethod2']")
    WebElement paymentMethod2;
    @FindBy(xpath = "//input[@id='years2']")
    WebElement addEmploymentYears2;
    @FindBy(xpath = "//input[@id='months2']")
    WebElement addEmploymentMonths2;
    @FindBy(xpath = "//input[@id='salary2']")
    WebElement salary2;
    @FindBy(xpath = "//input[@id='workEmail2']")
    WebElement workEmail2;
    @FindBy(xpath = "//select[@id='countryWork2']")
    WebElement countryWork2;
    @FindBy(xpath = "//select[@id='stateWork2']")
    WebElement stateWork2;
    @FindBy(xpath = "//select[@id='employmentCity2']")
    WebElement employmentCity2;
    @FindBy(xpath = "//select[@id='employmentPostalCode2']")
    WebElement employmentPostalCode2;
    @FindBy(xpath = "//input[@id='line1Work2']")
    WebElement line1Work2;
    @FindBy(xpath = "//input[@id='line2Work2']")
    WebElement line2Work2;
    @FindBy(xpath = "//div[contains(text(),'Max 2 records can be added')]")
    WebElement warning;
    @FindBy(xpath = "(//i[@class='fa fa-trash delete-row text-dark'])[2]")
    WebElement deleteAdd;
    public void employmentInformation(){
        ActionUtils.select_by_value(EmploymentType, "Permanent");
        ActionUtils.set_text(employerName, ExcelUtility.excel("EmpInfo",0));
        ActionUtils.set_text(supervisor, ExcelUtility.excel("EmpInfo",1));
        ActionUtils.select_by_value(position, "8");
        actionUtils.screenshot();
        ActionUtils.select_by_value(industry, "Finance");
        ActionUtils.set_text(employerPhone, ExcelUtility.excel("EmpInfo",2));
        ActionUtils.set_text(otherEmployerPhone, ExcelUtility.excel("EmpInfo",3));
        ActionUtils.select_by_value(paymentMethod, "Check");
        ActionUtils.set_text(employerYears, ExcelUtility.excel("EmpInfo",4));
        ActionUtils.set_text(employerMonths, ExcelUtility.excel("EmpInfo",5));
        ActionUtils.set_text(employerSalary, ExcelUtility.excel("EmpInfo",6));
        ActionUtils.set_text(workEmail, ExcelUtility.excel("EmpInfo",7));
        ActionUtils.select_by_value(workCountry, "US");
        ActionUtils.select_by_value(workState, "PR");
        ActionUtils.select_by_value(employmentCity, "Garrochales");
        ActionUtils.select_by_value(employmentPostalCode, "00652");
        ActionUtils.set_text(line1Work, ExcelUtility.excel("EmpInfo",8));
        ActionUtils.set_text(line2Work, ExcelUtility.excel("EmpInfo",9));
    }

    @FindBy(xpath = "//div[@id='employInfo2']//label[contains(text(),'Employment Status')]")
    WebElement conformAddEmployment;
    @FindBy(xpath = "//button[@id='removeNewEmployInfo']")
    WebElement employmentDelete;

    public void deleteAddEmploymentInformation() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        ActionUtils.scroll_till_element(addNewEmployInfo);
        ActionUtils.click(addNewEmployInfo);
        String conformAdd = ActionUtils.get_text(conformAddEmployment);
        soft.assertEquals(conformAdd,"Employment Status\n*");
        ActionUtils.scroll_till_element(employmentDelete);
        ActionUtils.click(employmentDelete);
        soft.assertAll();
    }

    public void addEmploymentInformation() throws InterruptedException {
        ActionUtils.scroll_till_element(addNewEmployInfo);
        ActionUtils.click(addNewEmployInfo);
        ActionUtils.select_by_value(employmentStatus, "P");
        ActionUtils.select_by_value(employmentType2, "Temporary");
        ActionUtils.set_text(employerName2, ExcelUtility.excel("EmpInfo",10));
        ActionUtils.set_text(supervisor2, ExcelUtility.excel("EmpInfo",11));
        ActionUtils.select_by_value(position2, "5");
        ActionUtils.select_by_value(industry2, "Government");
        ActionUtils.set_text(employerPhone2, ExcelUtility.excel("EmpInfo",12));
        ActionUtils.set_text(otherEmployerPhone2, ExcelUtility.excel("EmpInfo",13));
        ActionUtils.select_by_value(paymentMethod2, "Cash");
        ActionUtils.set_text(addEmploymentYears2, ExcelUtility.excel("EmpInfo",14));
        ActionUtils.set_text(addEmploymentMonths2, ExcelUtility.excel("EmpInfo",15));
        ActionUtils.set_text(salary2, ExcelUtility.excel("EmpInfo",16));
        ActionUtils.set_text(workEmail2, ExcelUtility.excel("EmpInfo",17));
        ActionUtils.select_by_value(countryWork2, "US");
        ActionUtils.select_by_value(stateWork2, "PR");
        ActionUtils.select_by_value(employmentCity2, "Adjuntas");
        ActionUtils.select_by_value(employmentPostalCode2, "00601");
        ActionUtils.set_text(line1Work2, ExcelUtility.excel("EmpInfo",18));
        ActionUtils.set_text(line2Work2, ExcelUtility.excel("EmpInfo",19));
    }

    public void additionalMonthlyIncome() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        ActionUtils.scroll_till_element(AddNewAdditional);
        ActionUtils.click(AddNewAdditional);
        ActionUtils.click(AddNewAdditional);
        ActionUtils.click(AddNewAdditional);
        String Warning = ActionUtils.get_text(warning);
        soft.assertEquals(Warning,"Max 2 records can be added");
        actionUtils.screenshot();
        ActionUtils.waitFor(2);
        ActionUtils.click(deleteAdd);
        ActionUtils.select_by_value(additionalIncomeType,"7");
        ActionUtils.set_text(additionalAmount, ExcelUtility.excel("EmpInfo",20));
        ActionUtils.select_by_value(additionalSource,"1");
        soft.assertAll();
    }
}
