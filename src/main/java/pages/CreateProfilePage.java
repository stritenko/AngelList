package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/3/2017.
 */
public class CreateProfilePage extends ParentPage {

    @FindBy(xpath=".//*[@id='basic_profile_role']")
    WebElement currentRoleDD;

    @FindBy(xpath=".//*[@id='basic_profile_role']/option[8]")
    WebElement currentRoleOther;

    @FindBy(xpath=".//*[@id='basic_profile_company']")
    WebElement companyFiled;

    @FindBy(xpath=".//*[@id='basic_profile_job_title']")
    WebElement jobTitleFiled;

    @FindBy(xpath=".//*[@id='root']/div[4]/div/div/div/div[2]/div[1]/div/div[2]/button")
    WebElement createProfileButton;


    public CreateProfilePage(WebDriver webDriver) {
        super(webDriver);
    }
    public void clickOnCurrentRoleDD(){
        actionWithOurElements.clickOnElement(currentRoleDD);
    }

    public void selectRoleInCurrentRoleDD(String roleForSelect){
        actionWithOurElements.selectItemInDropDownByValue(currentRoleDD,roleForSelect);
    }

    public void enterCompanyName(String company){
        actionWithOurElements.enterTextIntoInput(companyFiled,company);
    }

    public void ckickOnCreateProfilePage(){
        actionWithOurElements.clickOnElement(createProfileButton);
    }
}
