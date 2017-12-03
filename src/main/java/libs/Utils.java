package libs;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {
    private Logger log;

    public Utils(){
        log = Logger.getLogger(getClass());
    }

    /**
     * Taking screenshot into .//target// + pathToScreenShot
     * @param pathToScreenShot
     * @param driver
     */
    public void screenShot(String pathToScreenShot, WebDriver driver){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(pathToScreenShot));
            log.info("ScreenShot: " + pathToScreenShot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveUserToFile(String filepath, String username, String email) {
        createFile(filepath);
        try(FileWriter fileWriter = new FileWriter(filepath)){
            String line = username + "," + email;
            fileWriter.append(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile(String filePath) {
        File f = new File(filePath);
        if(!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String generateUserCredentials() {
        String name = generateRandomName();
        String lastname = generateRandomName();
        return name + " " + lastname;
    }

    public static String generateEmail(String username) {
        String email = username.replace(" ", ".");
        email += "@foo.com";
        return email;
    }

    public static String generateRandomName() {
        String[] capital = {"A","B", "C", "D", "E", "F", "G", "H"};
        String[] lower = {"a", "b", "c", "e", "d", "f", "g", "h", "k", "l", "m", "n"};

        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        int index = rnd.nextInt(capital.length);

        sb.append(capital[index]);
        for(int i=0; i<4; i++) {
            index = rnd.nextInt(lower.length);
            sb.append(lower[i]);
        }
        return sb.toString();
    }


    public static String[] readUsersCsv(String filePath) {
        String line = "";
        String cvsSplitBy = ",";
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

            Random rand = new Random();
            int index = rand.nextInt(lines.size());
            String userdata = lines.get(index);
            String[] splitted = userdata.split(cvsSplitBy);
            return splitted;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
