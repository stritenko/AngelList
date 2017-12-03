package editProfileTest;

import libs.ConfigData;
import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by Marina on 12/2/2017.
 */
public class EditProfileTest extends ParentTest {
    public EditProfileTest(String browser) {
        super(browser);
    }

    @Test
    public void editProfileTest() {
        try {
            loginPage.openPage(ConfigData.getCfgValue("base_url") + "/login");
            loginPage.enterEmailIntoInputEmail("stritenko@gmail.com");
            loginPage.enterPassIntoInputPass("1qazxsw2");
            loginPage.clickOnSubmitButton();
            homePage.clickOnUserProfile();
            profilePage.clickOnEditButton();
            editProfilePage.enterTextInToInputLocation("Israel");
            editProfilePage.isSelectedLocationPresent();


        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error while opening login page: " + e.getMessage());
        }
    }
}
