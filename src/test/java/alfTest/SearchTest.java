package alfTest;

import alfPages.SearchPage;
import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class SearchTest extends BaseLibrary {

    SearchPage searchpage;
    ActionUtils actionUtils = new ActionUtils();

    @Step
    @Test(priority = 1)
    public void verifyApplicationId() throws InterruptedException {
        searchpage = new SearchPage();
        searchpage.byApplicationId();
    }

    @Step
    @Test(priority = 2)
    public void verifyByName() throws InterruptedException {
        searchpage.byName();
    }

    @Step
    @Test(priority = 3)
    public void verifyByDraft() throws InterruptedException {
        searchpage.byDraftStatus();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 4)
    public void verifyByApproved() throws InterruptedException {
        searchpage.byApprovedStatus();
        actionUtils.screenshot();
    }
}
