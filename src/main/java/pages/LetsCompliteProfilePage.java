package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/3/2017.
 */
public class LetsCompliteProfilePage extends ParentPage {

    @FindBy(xpath=".//*[@id='root']/div[4]/div/div/div/div[4]/a")
    WebElement skipForNowLink;

    public LetsCompliteProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnskipForNowLink (){
        actionWithOurElements.clickOnElement(skipForNowLink);
    }
}
