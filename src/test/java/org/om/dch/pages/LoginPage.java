package org.om.dch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.om.dch.factory.DriverFactory.initializeDriver;

public class LoginPage {

    private @FindBy(css = "input#username")
    WebElement loginUsername;

    private @FindBy(id = "password")
    WebElement loginPassword;

    private @FindBy(css = "button[value='Log in']")
    WebElement loginButton;


     public LoginPage getUserName(String username){
        loginUsername.clear();
        loginUsername.sendKeys(username);
        return this;
        
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
