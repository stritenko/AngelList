package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/3/2017.
 */
public class WelcomeToAngelPage extends ParentPage {

    @FindBy(xpath = ".//*[@href = 'https://angel.co/onboarding/skip_location']")
    WebElement skipLocationButton;
    public WelcomeToAngelPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnSkipLocatinButtom (){
        actionWithOurElements.clickOnElement(skipLocationButton);
    }
}
