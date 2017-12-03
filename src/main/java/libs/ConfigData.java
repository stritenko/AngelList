package libs;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Marina on 11/28/2017.
 */
public class ConfigData {
    public static String cfgFile = "src/config.properties";
    public static String uiMappingFile = "src/UIMapping.properties";

    public static String getValueFromFile(String key, String fileName) throws IOException {
        Properties p = new Properties();
        FileInputStream cfg = new FileInputStream(fileName);
        p.load(cfg);
        cfg.close();
        return (p.getProperty(key));
    }

    public static String getUiMappingValue(String key) throws IOException {

        return (getValueFromFile(key, uiMappingFile));
    }

    public static String getCfgValue(String key) throws IOException {

        return (getValueFromFile(key, cfgFile));
    }

    public static By ui(String key) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        String[] partsOfLocator = getValueFromFile(key, uiMappingFile).split("\"");
        String findMethod = partsOfLocator[0].substring(0, partsOfLocator[0].length() - 1);
        String target = partsOfLocator[1];

               if (findMethod.equals("id")) {
            return By.id(target);
        } else {
            if (findMethod.equals("xpath")) {
                return By.xpath(target);
            } else {
                if (findMethod.equals("name")) {
                    return By.name(target);
                } else {
                    if (findMethod.equals("linkText")) {
                        return By.linkText(target);
                    } else {
                        if (findMethod.equals("tagName")) {
                            return By.tagName(target);
                        } else {
                            if (findMethod.equals("className")) {
                                return By.className(target);
                            } else {
                                if (findMethod.equals("cssSelector")) {
                                    return By.cssSelector(target);
                                } else {
                                    return By.partialLinkText(target);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}
