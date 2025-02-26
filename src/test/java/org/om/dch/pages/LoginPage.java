package org.om.dch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "username")
    private WebElement loginUsername;

    @FindBy(id = "password")
    private WebElement loginPassword;

    @FindBy(css = "button[value='Log in']")
    private WebElement loginButton;


    public LoginPage() {
        super();
    }




    public LoginPage getUserName(String userName) {
        loginUsername.sendKeys(userName);
        return new LoginPage();
    }

    public LoginPage getPassword(String password) {
        loginPassword.sendKeys(password);
        return this;
    }

    public LoginPage getLoginButton() {
        loginButton.click();
        return this;
    }
}
