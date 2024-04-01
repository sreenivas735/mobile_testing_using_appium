package Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class Hooks {

    static AndroidDriver driver;

    @Before
    public void beforemethod() throws Exception {
        File file = new File("C:\\Users\\sreenu\\IdeaProjects\\Mobile_Automation\\mobile.properties");
        FileReader reader = new FileReader(file);
        Properties properties = new Properties();
        properties.load(reader);

        String emulator = properties.getProperty("emulator_name");
        String platfomename = properties.getProperty("platformName");
        String devicename = properties.getProperty("deviceName");
        String Version = properties.getProperty("platformVersion");
        String automatiorname = properties.getProperty("automationName");
        String app_url = properties.getProperty("app_path");
        String app_activity = properties.getProperty("appActivity");

        String ip_and_port = properties.getProperty("ip_address_and_port");

        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid(emulator).setPlatformName(platfomename).setPlatformVersion(Version).setDeviceName(devicename).setAutomationName(automatiorname)
                .setApp("C:\\Users\\sreenu\\IdeaProjects\\mobile_auto\\src\\main\\resources\\" + app_url).setAppActivity(app_activity);

        driver = new AndroidDriver(new URL(ip_and_port), options);

    }

    @After
    public void aftermothod() throws Exception {
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=Chrome]")).click();
        driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
        driver.findElement(By.id("com.android.chrome:id/negative_button")).click();
        driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("ntr" + Keys.ENTER);
        String ntr = driver.findElement(By.xpath("//android.view.View[@text=N. T. Rama Rao Jr.]")).getText();
        System.out.println(ntr);

        driver.findElement(By.xpath("//android.widget.Button[@text=How many languages can Jr. NTR speak?]")).click();

        driver.findElement(By.className("android.widget.TextView")).click();
        Thread.sleep(10000);

        TakesScreenshot screenshot = driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\sreenu\\IdeaProjects\\Mobile_Automation\\target\\screenshot.jpg");
        FileUtils.copyFile(source, dest);

        driver.quit();
    }
}
