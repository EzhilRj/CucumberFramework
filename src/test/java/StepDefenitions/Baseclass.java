package StepDefenitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class Baseclass {

    public WebDriver driver;

    public static String randomestring() {

        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return (generatedString);
    }

}