package Test;

import Page.pageclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {


    pageclass page = new pageclass(Hooks.driver);

    @When("click login button user able to see the login page")
    public void clickLoginButtonUserAbleToSeeTheLoginPage() {
        page.waittime();
        page.clicklogin();

    }

    @Then("user click signup button and enter username {string} and password {string} and confirm password {string}")
    public void userClickSignupButtonAndEnterUsernameAndPasswordAndConfirmPassword(String uname, String pass, String conform_pass) {
        page.clicksignupbutton();
        page.waittime();
        page.usernamebox(uname);
        page.passwordbox(pass);
        page.confirmpassword(conform_pass);

    }

    @And("click the signup button and take screenshot {string} verify user successfully login {string}")
    public void clickTheSignupButtonAndVerifyUserSuccessfullyLogin(String screenshot, String input) throws Exception{
        page.signupbuttoblink();
        Thread.sleep(3000);
        page.screenshotmethos(screenshot);
        page.waittime();
        page.verifytext(input);
        page.clickokalert();
    }

    @When("click the login button and enter username {string} and password {string}")
    public void clickTheLoginButtonAndEnterUsernameAndPassword(String uname, String pass) {
        page.clickloginbutton();
        page.waittime();
        page.loginuser(uname);
        page.loginpass(pass);
    }

    @Then("click the login button and take screenshot {string} verify user successfully login {string}")
    public void clickTheLoginButtonAndtakescreenshotVerifyUserSuccessfullyLogin(String screenshot2, String input) throws Exception {
        page.clickloginbuttonbox();
        Thread.sleep(3000);
        page.screenshotmethos(screenshot2);
        page.waittime();
        page.getlogintext(input);
        page.clickloginokalert();
    }

}
