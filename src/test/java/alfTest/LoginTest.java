package alfTest;

import alfPages.LoginPage;
import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import io.qameta.allure.Step;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseLibrary
{
    LoginPage loginPage;
    ActionUtils actionUtils = new ActionUtils();

    @BeforeTest
    public void launchURL(){
        getLaunchUrl("chrome");
        loginPage = new LoginPage();
        loginPage.deleteAllure();
    }

    @Step
    @Test(priority = 1)
    public void passwordForget() {
        loginPage.forgetPassword();
    }

    @Step
    @Test(priority = 2)
    public void invalidLogin(){
        loginPage.inputUserInValidLogin();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 3)
    public void userLogin(){
        loginPage.inputUserValidLogin();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 4)
    public void clickSelectLot() throws InterruptedException {
        loginPage.selectLot();
        ActionUtils.waitFor(2);
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 5)
    public void clickCreateApplication() throws InterruptedException {
        loginPage.clickOnCreateApplication();
        actionUtils.screenshot();
    }

    @Step
    @AfterTest
    public void userLogout() throws InterruptedException {
        ActionUtils.waitFor(5);
        loginPage.logOut();
        actionUtils.screenshot();
//        driver.quit();
    }
}
