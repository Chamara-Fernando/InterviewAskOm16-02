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

    WebDriver driver = new ChromeDriver();

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void getUserName(String username) {
        loginUsername.sendKeys(username);

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
