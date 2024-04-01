package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class FirstMobileTest {


    public static void main(String[] args) throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554").setPlatformName("Android").setDeviceName("Pixel 8")
                .setPlatformVersion("12.0").setAutomationName("UiAutomator2")
                .setAppActivity(".MainActivity")
                .setApp("C:\\Users\\sreenu\\IdeaProjects\\mobile_auto\\src\\main\\resources\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://192.168.0.112:4723"), options);

//        options.setApp("src\\main\\resources\\android.wdio.native.app.v1.0.8.apk");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc='Login']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign up']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-email']")).sendKeys("vasudev@gmail.com");
//        driver.findElement(By.AccessibilityId("input-email")).sendKeys("example@email.com");
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-password']")).sendKeys("vasudev735");
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-repeat-password']")).sendKeys("vasudev735");
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='button-SIGN UP']/android.view.ViewGroup")).click();

        String s = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(s);

        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.xpath("(//android.widget.TextView[@text='Login'])[1]")).click();

        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-email']")).sendKeys("vasudev@gmail.com");
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-password']")).sendKeys("vasudev735");
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup")).click();
        String d = driver.findElement(By.id("android:id/message")).getText();
        System.out.println(d);
        driver.findElement(By.id("android:id/button1")).click();

        Thread.sleep(3000);

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

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

        driver.close();
    }
}