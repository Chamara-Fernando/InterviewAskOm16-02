package org.om.dch.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("I am on the askom store login page")
    public void i_am_on_the_askom_store_login_page() {
        System.out.println("I am on the askom store login page");
        
    }
    @When("I enter a username  {string}")
    public void i_enter_a_username(String string) {
        System.out.println("I enter a username " + string);

    }
    @And("I enter a password {string}")
    public void i_enter_a_password(String string) {

        System.out.println("I enter a password " + string);

    }
    @And("I click on login")
    public void i_click_on_login() {

        System.out.println("I click on login");

    }
    @Then("I should be logged on")
    public void i_should_be_logged_on() {
        System.out.println("I should be logged on");
    }

}
