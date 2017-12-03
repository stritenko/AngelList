package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/3/2017.
 */
public class LookingForNewJobPage extends ParentPage {

    @FindBy(xpath=".//*[@id='root']/div[4]/div/div[2]/div/a[2]")
    WebElement noButton;

    public LookingForNewJobPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void clickOnNoButton (){
        actionWithOurElements.clickOnElement(noButton);
    }
}
