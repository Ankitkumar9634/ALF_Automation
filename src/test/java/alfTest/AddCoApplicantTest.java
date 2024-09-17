package alfTest;

import alfPages.AddCoApplicantPage;
import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class AddCoApplicantTest extends BaseLibrary
{

    AddCoApplicantPage ob;
    ActionUtils actionUtils = new ActionUtils();
    @Step
    @Test(priority = 1)
    public void fillCoApplicantDetails() throws InterruptedException {
        ob = new AddCoApplicantPage();
        ob.coApplicantDetails();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 2)
    public void fillCoApplicantPhysicalAddressDetails() throws InterruptedException {
        ob.coApplicantPhysicalAddress();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 3)
    public void fillCoApplicantPreviousPhysicalAddressDetails() throws InterruptedException {
        ob.coPreviousPhysicalAddress();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 4)
    public void fillCoApplicantEmploymentInformation() throws InterruptedException {
        ob.coApplicantEmploymentInformation();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 5)
    public void verifyDeleteAddCoEmployment() throws InterruptedException {
        ob.deleteAddCoEmploymentInformation();
    }

    @Step
    @Test(priority = 6)
    public void fillAddCoEmploymentInformation() throws InterruptedException {
        ob.addCoEmploymentInformation();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 7)
    public void fillCoApplicantAdditionalMonthlyIncome() throws InterruptedException {
        ob.coApplicantAdditionalMonthlyIncome();
        actionUtils.screenshot();
    }
}
