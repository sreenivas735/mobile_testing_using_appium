package Page;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class pageclass extends commonMethods {


    public pageclass(AndroidDriver driver){
        super(driver);
        this.driver = driver;

    }
    By loginicon = By.xpath("//android.view.View[@content-desc='Login']");

    By signupbutton = By.xpath("//android.widget.TextView[@text='Sign up']");

    By username = By.xpath("//android.widget.EditText[@content-desc='input-email']");

    By password = By.xpath("//android.widget.EditText[@content-desc='input-password']");

    By confirm_password = By.xpath("//android.widget.EditText[@content-desc='input-repeat-password']");
    By signupbuttonlink = By.xpath("//android.view.ViewGroup[@content-desc='button-SIGN UP']/android.view.ViewGroup");

    By signupalerttext = By.id("android:id/message");

    By signupalertok = By.id("android:id/button1");

    By loginbutton = By.xpath("(//android.widget.TextView[@text='Login'])[1]");

    By userlogin = By.xpath("//android.widget.EditText[@content-desc='input-email']");

    By passwordlogin = By.xpath("//android.widget.EditText[@content-desc='input-password']");

    By loginclick = By.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup");
    By loginalerttext = By.id("android:id/message");
    By loginalertok = By.id("android:id/button1");



    public void clicklogin() {
        clickmethod(loginicon);
    }

    public void clicksignupbutton() {
        clickmethod(signupbutton);
    }

    public void usernamebox(String uname) {
        sendkeysmethod(username, uname);
    }

    public void passwordbox(String pass) {
        sendkeysmethod(password, pass);
    }

    public void confirmpassword(String conformPass) {
        sendkeysmethod(confirm_password, conformPass);
    }

    public void verifytext(String input) {
      String text =  gettextmethos(signupalerttext);
        System.out.println(text);
        Assert.assertEquals(input,text);
    }

    public void signupbuttoblink() {
        clickmethod(signupbuttonlink);
    }

    public void clickloginbutton() {
        clickmethod(loginbutton);
    }

    public void clickokalert() {
        clickmethod(signupalertok);
    }

    public void loginpass(String pass) {
        sendkeysmethod(passwordlogin, pass );
    }

    public void loginuser(String uname) {

        sendkeysmethod(userlogin, uname);
    }

    public void clickloginbuttonbox() {
        clickmethod(loginclick);

    }

    public void getlogintext(String input) {
        String text = gettextmethos(loginalerttext);
        System.out.println(text);
        Assert.assertEquals(input, text);
    }

    public void clickloginokalert() {
        clickmethod(loginalertok);
    }
}
