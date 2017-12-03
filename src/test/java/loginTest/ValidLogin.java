package loginTest;

import libs.ConfigData;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import parentTest.ParentTest;

/**
 * Created by Marina on 11/28/2017.
 */
public class ValidLogin extends ParentTest {

    public ValidLogin(String browser) {
        super(browser);
    }

    @Test
    public void validLogin() {
        try {
            loginPage.openPage(ConfigData.getCfgValue("base_url") + "/login");
            loginPage.enterEmailIntoInputEmail("stritenko@gmail.com");
            loginPage.enterPassIntoInputPass("1qazxsw2");
            loginPage.clickOnSubmitButton();

            checkAcceptanceCriteria("UserProfile is not present",
                    homePage.isUserProfilePresent(),true);



        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error while opening login page: " + e.getMessage());
        }
    }
}
