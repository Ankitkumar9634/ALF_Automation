package alfTest;

import alfPages.FillApplicantDetailsPage;
import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class FillApplicantDetailsTest extends BaseLibrary
{

    FillApplicantDetailsPage ob;
    ActionUtils actionUtils = new ActionUtils();

    @Step
    @Test(priority = 1)
    public void fillApplicantDetails() throws InterruptedException {
        ob = new FillApplicantDetailsPage();
        ob.applicantInformation();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 2)
    public void fillPhysicalAddressDetails() throws InterruptedException {
        ob.physicalAddress();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 3)
    public void fillPreviousPhysicalAddressDetails() throws InterruptedException {
        ob.previousPhysicalAddress();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 4)
    public void fillEmploymentInformationDetails() throws InterruptedException {
        ob.employmentInformation();
        actionUtils.screenshot();
    }
    @Step
    @Test(priority = 5)
    public void verifyDeleteAddEmployment() throws InterruptedException {
        ob.deleteAddEmploymentInformation();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 6)
    public void fillAddEmploymentInformationDetails() throws InterruptedException {
        ob.addEmploymentInformation();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 7)
    public void fillAdditionalMonthlyIncomeDetails() throws InterruptedException {
        ob.additionalMonthlyIncome();
        actionUtils.screenshot();
    }
}
