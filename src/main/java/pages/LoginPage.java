package pages;

import libs.ConfigData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 11/27/2017.
 */
public class LoginPage extends ParentPage {
    @FindBy(id = "user_email")
    WebElement inputEmail;

    @FindBy(id = "user_password")
    WebElement inputPassword;

    @FindBy(name = "commit")
    WebElement submitButton;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }




    public void enterEmailIntoInputEmail(String email) {
        actionWithOurElements.enterTextIntoInput(inputEmail, email);
    }

    public void enterPassIntoInputPass(String pass){
        actionWithOurElements.enterTextIntoInput(inputPassword,pass);
    }
    public void clickOnSubmitButton(){
        actionWithOurElements.clickOnElement(submitButton);
    }



}
