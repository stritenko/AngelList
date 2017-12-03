package signUpTest;

import libs.ConfigData;
import libs.Utils;
import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by Marina on 12/2/2017.
 */
public class SignUpTest extends ParentTest {


    public SignUpTest(String browser) {
        super(browser);
    }
    @Test
    public void SignUpTest() {
        try {

            mainPage.openPage(ConfigData.getCfgValue("base_url"));
            mainPage.clickOnSignUpLink();
            String user = Utils.generateUserCredentials();
            String email = Utils.generateEmail(user);
            String password = "1qazxsw2";
            signUpPage.enterFullNameIntoInputFullName(user);
            signUpPage.enetrEmailIntoInputEmail(email);
            signUpPage.enterPasswopdIntoInputPassword(password);
            signUpPage.clickOnSubmitButton();
            welcomeToAngelPage.clickOnSkipLocatinButtom();
            interestedInPage.clickOnskipButton();
            lookingForNewJobPage.clickOnNoButton();
            letsCompliteProfilePage.clickOnskipForNowLink();
            uploadFhotoPage.clickSkipUploadPhotoLink();
            createResumePage.clickOnskipCreateResumeLink();
            checkAcceptanceCriteria("UserProfile is not present",
                    homePage.isUserProfilePresent(), true);

            String usersFile = ConfigData.getCfgValue("users");
            Utils.saveUserToFile(usersFile, user, email);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error while opening login page: " + e.getMessage());
        }
    }
}
