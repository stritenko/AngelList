package pages;

import libs.ActionWithOurElements;
import libs.ConfigData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/2/2017.
 */
public class ProfilePage extends ParentPage {

    @FindBy(xpath = ".//*[@id='root']/div[4]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/h1/span/span/a[2]/i")
    WebElement editButton;
    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }
    public void clickOnEditButton() {
        actionWithOurElements.clickOnElement(editButton);
    }
}
