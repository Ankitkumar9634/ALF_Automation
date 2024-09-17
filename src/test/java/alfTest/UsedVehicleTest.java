package alfTest;

import alfPages.UsedVehiclePage;
import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class UsedVehicleTest extends BaseLibrary {

    UsedVehiclePage ob;
    ActionUtils actionUtils = new ActionUtils();

    @Step
    @Test(priority = 1)
    public void fillDealDetailUsed() throws InterruptedException {
        ob = new UsedVehiclePage();
        ob.fillDealDetailForUsed();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 2)
    public void fillCollateralInformationUsed() throws InterruptedException {
        ob.fillCollateralInformationForUsed();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 3)
    public void selectAdditionalProductUsed() throws InterruptedException {
        ob.addAdditionalProduct();
        actionUtils.screenshot();
    }
}
