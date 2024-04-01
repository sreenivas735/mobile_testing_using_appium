package Page;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.time.Duration;

public class commonMethods {
    AndroidDriver driver;

    commonMethods(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickmethod(By element) {
        driver.findElement(element).click();
    }

    public void sendkeysmethod(By element, String input) {
        driver.findElement(element).sendKeys(input);
    }

    public String gettextmethos(By element) {
        return driver.findElement(element).getText();
    }

    public void screenshotmethos(String input) throws Exception {
        TakesScreenshot screenshot = driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\sreenu\\IdeaProjects\\Mobile_Automation\\target\\screenshot\\" + input + ".jpg");
        FileUtils.copyFile(source, dest);
    }

    public void waittime() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
