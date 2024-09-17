package alfTest;

import alfPages.NewVehiclePage;
import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class NewVehicleTest extends BaseLibrary {

    NewVehiclePage ob;
    ActionUtils actionUtils = new ActionUtils();
    @Step
    @Test(priority = 1)
    public void fillDealDetailNew() throws InterruptedException {
        ob = new NewVehiclePage();
        ob.fillDealDetailForNew();
        actionUtils.screenshot();
    }

    @Step
    @Test(priority = 2)
    public void fillCollateralInformationNew() throws InterruptedException {
        ob.fillCollateralInformationForNew();
        actionUtils.screenshot();
    }
    @Step
    @Test(priority = 3)
    public void selectAdditionalProductNew() throws InterruptedException {
        ob.addAdditionalProduct();
        actionUtils.screenshot();
    }
}
