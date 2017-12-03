package pages;

import libs.ActionWithOurElements;
import libs.ConfigData;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Marina on 11/18/2017.
 */
public class ParentPage {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    ActionWithOurElements actionWithOurElements;

    public ParentPage(WebDriver webDriver){
        this.webDriver = webDriver;
        actionWithOurElements = new ActionWithOurElements(webDriver);
        PageFactory.initElements(webDriver,this);
    }

    public void openPage(String url) throws Exception {
        webDriver.get(url);
    }
}
