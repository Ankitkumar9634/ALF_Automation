package alfPages;

import applicationUtility.ActionUtils;
import baselibrary.BaseLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class SearchPage extends BaseLibrary {
    ActionUtils actionUtils = new ActionUtils();
    public SearchPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[@class='menu-link'])[3]")
    WebElement applicationList;
    @FindBy(xpath = "//input[@id='appId']")
    WebElement applicationId;
    @FindBy(xpath = "//button[@id='btnSubmit']")
    WebElement Search;
    @FindBy(xpath = "//div[@class='left-sec']//a")
    WebElement getId;
    @FindBy(xpath = "//i[@class='fa fa-long-arrow-right ']")
    WebElement scrollRight;
    @FindBy(xpath = "//h1[contains(text(),'Application List')]")
    WebElement verifyListPage;

    public void byApplicationId() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        ActionUtils.click(applicationList);
        String applicationList = ActionUtils.get_text(verifyListPage);
        soft.assertEquals(applicationList,"Application List");
        ActionUtils.set_text(applicationId,"99712");
        ActionUtils.click(Search);
//        boolean applicationId=false;
//        List<WebElement> elements = driver.findElements(By.xpath("//p[@class='num mb-0']"));
////        List<String> texts = new ArrayList<>();
//
////        for (WebElement element : elements) {
////            texts.add(element.getText());
////        }
////        for (String text : texts) {
////            System.out.println(text);
////        }
//
//        for (int i=0;i<=elements.size();i++){
////            elements.get(i).getText();
//            ActionUtils.waitFor(3);
//            if(elements.get(i).getText().equals("1")){
//                ActionUtils.waitFor(3);
//                String idNum = ActionUtils.get_text(getId);
//                ActionUtils.waitFor(3);
//                if (idNum.contains("99712")) {
//                    System.out.println("Id Number is : " + idNum);
//                    applicationId = true;
//                }
//                else {
//                    System.out.println("Error in search Application Id");
//                }
//                break;
//            }
//            else {
//                ActionUtils.click(scrollRight);
//            }
//        }
//        if (applicationId=false){
//            System.out.println("This Application id is not existing in this user");
//        }
        for (int i=0;i<=7;i++){
            ActionUtils.waitFor(3);
            if (getId.isDisplayed()) {
                ActionUtils.waitFor(3);
                String idNum = ActionUtils.get_text(getId);
                ActionUtils.waitFor(3);
                if (idNum.contains("99712")) {
                    System.out.println("Id Number is : " + idNum);
                }
                else {
                    System.out.println("Error in search Application Id");
                }
                break;
            }
            else {
                ActionUtils.click(scrollRight);
            }
        }
        actionUtils.screenshot();
        ActionUtils.clear(applicationId);
        soft.assertAll();
    }

    @FindBy(xpath = "//select[@id='status']")
    WebElement status;
    @FindBy(xpath = "(//p[@class='num mb-0'])[1]")
    WebElement draftApplications;
    @FindBy(xpath = "(//p[@class='num mb-0'])[5]")
    WebElement approvedApplications;
    @FindBy(xpath = "(//p[@class='lbl mb-0 text-capitalize'])[1]")
    WebElement draftStatus;
    @FindBy(xpath = "(//p[@class='lbl mb-0 text-capitalize'])[5]")
    WebElement approvedStatus;
    @FindBy(xpath = "//input[@id='solicitante']")
    WebElement applicant;
    @FindBy(xpath = "(//span[@class='profile-name text-end']//a)[1]")
    WebElement firstApplicant;

    public void byName() throws InterruptedException {
        ActionUtils.set_text(applicant,"ISABEL ALVIRA");
        ActionUtils.click(Search);
//        WebElement elements = driver.findElement(By.xpath("//span[@class='profile-name text-end']//a"));
//        System.out.println("Total Applicant of this Name :"+ elements.getSize());
        ActionUtils.waitFor(3);
        String getApplicantName = ActionUtils.get_text(firstApplicant);
        ActionUtils.waitFor(3);
        if(getApplicantName.contains("ISABEL")){
            System.out.println("Applicant is available :"+getApplicantName);
        }
        else System.out.println("Applicant is not available :"+getApplicantName);
        actionUtils.screenshot();
        ActionUtils.clear(applicant);
    }
    public void byDraftStatus() throws InterruptedException {
        ActionUtils.select_by_value(status, "draft");
        ActionUtils.click(Search);
//        WebElement elements = driver.findElement(By.xpath("(//p[@class='lbl mb-0 text-capitalize'])[1]"));
//        for (int i = 0; i <= elements.size(); i++) {
////            elements.get(i).getText();
//            ActionUtils.waitFor(3);
//            if (elements.get(i).getText().contains("draft")) {
//                ActionUtils.waitFor(3);
//                String AppNum = applicationNumber.getText();
//                ActionUtils.waitFor(3);
//                System.out.println(AppNum);
//                break;
//            } else {
//                ActionUtils.click(scrollRight);
//            }
//        }
        ActionUtils.waitFor(3);
        String titalName = ActionUtils.get_text(draftStatus);
        ActionUtils.waitFor(3);
        if (titalName.contains("Draft")){
            String AppNum = draftApplications.getText();
            ActionUtils.waitFor(3);
            System.out.println("In Draft Applications is = " + AppNum);
        }
        else {
            System.out.println("Getting error of Application count");
        }
    }

    public void byApprovedStatus() throws InterruptedException {
        ActionUtils.select_by_value(status, "approved");
        ActionUtils.click(Search);
        ActionUtils.waitFor(3);
        for(int i = 0;i<=7;i++) {
            if (approvedStatus.isDisplayed()) {
                ActionUtils.waitFor(3);
                String statusName = ActionUtils.get_text(approvedStatus);
                if (statusName.contains("Approved")) {
                    String AppNum = approvedApplications.getText();
                    ActionUtils.waitFor(3);
                    System.out.println("In Approved Applications is = " + AppNum);
                }
                else {
                    System.out.println("Getting error of Status");
                }
                break;
            }
            else {
                ActionUtils.click(scrollRight);
            }
        }
    }
}
