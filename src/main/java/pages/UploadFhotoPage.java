package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/3/2017.
 */
public class UploadFhotoPage extends ParentPage {
    @FindBy(xpath = ".//*[@id='root']/div[4]/div/div[2]/div[4]/div/a")
    WebElement skipUploadFhotoLink;
    public UploadFhotoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickSkipUploadPhotoLink(){
        actionWithOurElements.clickOnElement(skipUploadFhotoLink);
    }
}
