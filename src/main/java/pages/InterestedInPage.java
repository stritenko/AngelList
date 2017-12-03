package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/3/2017.
 */
public class InterestedInPage extends ParentPage {
    @FindBy(xpath=".//*[@id='root']/div[4]/div/form/div/div[6]/a")
    WebElement skipButton;


    public InterestedInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnskipButton(){
        actionWithOurElements.clickOnElement(skipButton);
    }


    }


