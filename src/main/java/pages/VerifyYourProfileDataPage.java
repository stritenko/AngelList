package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/3/2017.
 */
public class VerifyYourProfileDataPage extends ParentPage {

    @FindBy(xpath=".//*/a[text()='Skip' and @class = 'c-button c-button--gray c-button--lg u-widthFull'] ")
    WebElement skipPublikProfileData;
    public VerifyYourProfileDataPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void clickOnskipPublikProfileDataButton(){
        actionWithOurElements.clickOnElement(skipPublikProfileData);
    }

}
