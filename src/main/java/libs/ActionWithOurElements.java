package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Marina on 11/18/2017.
 */
public class ActionWithOurElements {
    WebDriver webDriver;
    Logger logger;
    WebDriverWait webDriverWait20;

    public ActionWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        webDriverWait20 = new WebDriverWait(webDriver, 20);
    }

    public void enterTextIntoInput(WebElement input, String text) {
        try {
            input.clear();
            input.sendKeys(text);
            logger.info(text + "was inputed to input");

        } catch (Exception e) {
            logger.error("Can not work with input: " + text + " element: " + input.getTagName());
            Assert.fail("Can not work with input: " + text + " element: " + input.getTagName());
        }

    }

    public void clickOnElement(WebElement element) {
        try {
            webDriverWait20.until(ExpectedConditions.visibilityOf(element));
            element.click();
            logger.info("Element was clicked");

        } catch (Exception e) {
            logger.error("Can not work with element " + element.getText(), e);
            Assert.fail("Can not work with element " + element.getText());
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed() && element.isEnabled();
        } catch (Exception e) {
            return false;
        }

    }

    public void selectItemInDropDownByVisibleText(WebElement elementDD, String textForSelect) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByVisibleText(textForSelect);
            logger.info(textForSelect + " was selected in DD");
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }

    }
    public void selectItemInDropDownByValue(WebElement elementDD,String valueInDD) {
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByValue(valueInDD);
            logger.info(valueInDD + " was selected in DD");
        } catch (Exception e) {
            logger.error("Can not work with element ");
            Assert.fail("Can not work with element");
        }
    }
}

