package TEST;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.an.E;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class automobile {

   static AndroidDriver driver;

   @Before
    public void methodbefore() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554").setPlatformName("Android").setDeviceName("Pixel 8")
                .setPlatformVersion("12.0").setAutomationName("UiAutomator2")
                .setAppActivity(".MainActivity")
                .setApp("C:\\Users\\sreenu\\IdeaProjects\\mobile_auto\\src\\main\\resources\\android.wdio.native.app.v1.0.8.apk");
        this.driver = new AndroidDriver(new URL("http://192.168.0.123:4723"), options);
    }

    @Test
    public void Test() throws Exception {
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

    }

    @After
    public void methodafter(){
        driver.quit();
    }
}
