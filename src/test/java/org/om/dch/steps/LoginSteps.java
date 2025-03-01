package org.om.dch.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.om.dch.base.BasePage;
import org.om.dch.factory.DriverFactory;
import org.om.dch.pages.LoginPage;


public class LoginSteps extends BasePage {

    private LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }


    @Given("I am on the askom store login page")
    public void i_am_on_the_askom_store_login_page() throws InterruptedException {
        getDriver().get("https://askomdch.com/account/");

        //driver.get("https://askomdch.com/account/");
        
    }
    @When("I enter a username  {string}")
    public void i_enter_a_username(String userName) {
        loginPage.getUserName(userName);
    }
    @And("I enter a password {string}")
    public void i_enter_a_password(String password) {
        loginPage.getPassword(password);

   }
    @And("I click on login")
    public void i_click_on_login() {
        loginPage.getLoginButton();

    }
    @Then("I should be logged on")
    public void i_should_be_logged_on() {
        System.out.println("I should be logged on");
        getDriver().quit();
    }

}
