package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/2/2017.
 */
public class MainPage extends ParentPage {

    @FindBy(xpath = ".//*[@href ='/login']")
    WebElement loginLink;

    @FindBy(xpath = ".//*[@href='/join']")
    WebElement signUpLink;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnLogInLink() {
        actionWithOurElements.clickOnElement(loginLink);
    }

    public void clickOnSignUpLink(){
        actionWithOurElements.clickOnElement(signUpLink);
    }
}
