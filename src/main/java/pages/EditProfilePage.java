package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/2/2017.
 */
public class EditProfilePage extends ParentPage {

    @FindBy(xpath = ".//*[@placeholder='Add Location']")
    WebElement location;


    @FindBy(xpath = ".//*/a[text()='Israel' and @target = '_blank'] ")
    WebElement locationPresent;

    public EditProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterTextInToInputLocation(String text) {
        actionWithOurElements.enterTextIntoInput(location, text);
    }




    public boolean isSelectedLocationPresent() {
       return actionWithOurElements.isElementPresent(locationPresent);
    }


}
