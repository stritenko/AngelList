package pages;

import libs.ConfigData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 12/2/2017.
 */
public class SignUpPage extends ParentPage {

    @FindBy(xpath = ".//*[@id='user_name']")
    WebElement inputUsername;

    @FindBy(xpath = ".//*[@id='user_email']")
    WebElement inputUserEmail;

    @FindBy(xpath = ".//*[@id='user_password']")
    WebElement inputPassword;

    @FindBy(xpath = ".//*[@name = 'commit']")
    WebElement signUpSumbitButton;

    public SignUpPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterFullNameIntoInputFullName(String fullName){
        actionWithOurElements.enterTextIntoInput(inputUsername, fullName);
    }

    public void enetrEmailIntoInputEmail(String email){
        actionWithOurElements.enterTextIntoInput(inputUserEmail,email);
    }

    public void enterPasswopdIntoInputPassword(String pass){
        actionWithOurElements.enterTextIntoInput(inputPassword, pass);
    }

    public void clickOnSubmitButton(){
        actionWithOurElements.clickOnElement(signUpSumbitButton);
    }
}
