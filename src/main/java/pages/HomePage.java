package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/1/2017.
 */
public class HomePage extends ParentPage {
    @FindBy(xpath = ".//*[@id='root']/div[4]/div/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/a/img ")
    WebElement userProfile;

    public HomePage(WebDriver webDriver) {
        super(webDriver);

    }


    public boolean isUserProfilePresent(){
        return actionWithOurElements.isElementPresent(userProfile);
    }

    public void clickOnUserProfile(){
        actionWithOurElements.clickOnElement(userProfile);
    }
}
