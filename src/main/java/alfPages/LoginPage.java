package alfPages;

import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import excelUtility.ExcelUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.File;

public class LoginPage extends BaseLibrary
{

    ActionUtils actionUtils = new ActionUtils();
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),'Login into your account')]")
    WebElement verifyLoginPage;
    @FindBy(xpath = "//a[contains(text(),'Did you forget your password?')]")
    WebElement forgetPassword;
    @FindBy(xpath = "//div[contains(text(),'Reset password')]")
    WebElement verifyResetPage;
    @FindBy(xpath = "//button[contains(text(),' Send email ')]")
    WebElement sendEmail;
    @FindBy(xpath = "//LI[contains(text(),'The email does not exist.')]")
    WebElement resetPageError;
    @FindBy(xpath = "//img[@src='https://alfosv2-dev.americasleading.com/alf_images/arrow_left_alt.svg']")
    WebElement goBack;
    @FindBy(xpath = "//input[@type='email']")
    WebElement userName;
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    @FindBy(xpath = "//li[@class='dropdown language language-menu']")  ////div[@class='profile-details']//..//..//..//a[@class='dropdown-toggle']
    WebElement change_language;
    @FindBy(xpath = "//a[contains(text(),'EN')]")
    WebElement english;
    @FindBy(xpath = "//span[contains(text(),'Home')]")
    WebElement Home;
    @FindBy(xpath = "(//a[@class='menu-link'])[2]")
    WebElement FinanceApplications;
    @FindBy(xpath = "//li[contains(text(),'Email not found. Please contact support team for further assistance.')]")
    WebElement loginError;
    @FindBy(xpath = "//h1[contains(text(),'Create Finance Application')]")
    WebElement verifyApplicationPage;
    @FindBy(xpath = "(//a[@class='menu-link'])[4]") //(//ul[@class='treeview-menu  menu-open']//li[2])
    WebElement create_application;
    @FindBy(xpath = "//li[@class='dropdown dropdown-width']")
    WebElement userProfile;
    @FindBy(xpath = "//i[@class='fa fa-sign-out fa-fw']")
    WebElement logout;
    @FindBy(xpath = "//p[@title='Ferrari 1']")
    WebElement byDefaultLot;
    @FindBy(xpath = "//a[@data-rooftopid='79']")
    WebElement Ferrari2;


    public void deleteAllure(){
        String pathFolder = "C:\\Project\\ALF\\allure-results";

        File folder = new File(pathFolder);
        if(folder.exists()){
            boolean deletionResult = deleteFolder(folder);
            if(deletionResult) {
                System.out.println("Allure Report Folder deleted successfully.");
            }
            else {
                System.out.println("Failed to delete the folder.");
            }
        }
        else {
            System.out.println("Folder does not exist.");
        }
    }

    private boolean deleteFolder(File folder) {

        if(folder.isDirectory()){
            File[] files = folder.listFiles();
            if(files != null){
                for(File file: files ){
                    if (!deleteFolder(file)) {
                        return false;
                    }
                }
            }
        }
        return folder.delete();
    }

    public void forgetPassword(){
        SoftAssert soft = new SoftAssert();
        ActionUtils.click(change_language);
        ActionUtils.click(english);
        ActionUtils.click(forgetPassword);
        String screen_title = ActionUtils.get_text(verifyResetPage);
        soft.assertEquals(screen_title,"Reset password");
        ActionUtils.set_text(userName, ExcelUtility.excel("Login",0));
        ActionUtils.click(sendEmail);
        String pageError = ActionUtils.get_text(resetPageError);
        soft.assertEquals(pageError,"The email does not exist.");
        actionUtils.screenshot();
        ActionUtils.click(goBack);
        soft.assertAll();
    }

    public void inputUserInValidLogin(){
        SoftAssert soft = new SoftAssert();
        String screen_title = ActionUtils.get_text(verifyLoginPage);
        soft.assertEquals(screen_title,"Login into your account");
        ActionUtils.set_text(userName, ExcelUtility.excel("Login",0));
        ActionUtils.set_text(password, ExcelUtility.excel("Login",2));
        ActionUtils.click(submit);
        String page_error = ActionUtils.get_text(loginError);
        soft.assertEquals(page_error,"Email not found. Please contact support team for further assistance.");
        soft.assertAll();
    }

    public void inputUserValidLogin(){
        SoftAssert soft = new SoftAssert();
        ActionUtils.set_text(userName, ExcelUtility.excel("Login", 1));
        ActionUtils.set_text(password, ExcelUtility.excel("Login", 2));
        ActionUtils.click(submit);
        String homePage = ActionUtils.get_text(Home);
        soft.assertEquals(homePage,"Home");
        soft.assertAll();
    }

    public void selectLot(){
        SoftAssert soft = new SoftAssert();
        String lots = ActionUtils.get_text(byDefaultLot);
        soft.assertEquals(lots,"Ferrari 1");
        ActionUtils.click(byDefaultLot);
        ActionUtils.click(Ferrari2);
        soft.assertAll();
    }

    public void clickOnCreateApplication() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
//        ActionUtils.visibilityOfElement(FinanceApplications);
        ActionUtils.waitFor(2);
        ActionUtils.click(FinanceApplications);
        ActionUtils.visibilityOfElement(create_application);
        ActionUtils.click(create_application);
        String createApplicationPage = ActionUtils.get_text(verifyApplicationPage);
        soft.assertEquals(createApplicationPage,"Create Finance Application");
        soft.assertAll();
    }

    public void logOut() throws InterruptedException {
        ActionUtils.visibilityOfElement(userProfile);
        ActionUtils.scroll_till_element(userProfile);
        ActionUtils.click(userProfile);
        ActionUtils.click(logout);
        System.out.println("Logout successfully");
    }
}
