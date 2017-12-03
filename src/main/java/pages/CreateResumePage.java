package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/3/2017.
 */
public class CreateResumePage extends ParentPage {

    @FindBy(xpath = ".//*[@id='root']/div[4]/div/div[2]/div[4]/div/a")
    WebElement skipCreateResumeLink;
    public CreateResumePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnskipCreateResumeLink(){
        actionWithOurElements.clickOnElement(skipCreateResumeLink);
    }
}
