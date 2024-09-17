package alfTest;

import alfPages.SaveSubmitPage;
import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class SaveSubmitTest extends BaseLibrary {

    SaveSubmitPage ob;
    ActionUtils actionUtils = new ActionUtils();

    @Step
    @Test(priority = 1)
    public void applicationSave() throws InterruptedException {
        ob = new SaveSubmitPage();
        ob.save();
    }

    @Step
    @Test(priority = 2)
    public void verifyEditDraft() throws InterruptedException {
        ob.editInDraft();
        actionUtils.screenshot();
    }
    @Step
    @Test(priority = 3)
    public void applicationSubmit() throws InterruptedException {
//        ob = new SaveSubmitPage();
        ob.submitAndFinanceCalculation();
        actionUtils.screenshot();
    }
}
