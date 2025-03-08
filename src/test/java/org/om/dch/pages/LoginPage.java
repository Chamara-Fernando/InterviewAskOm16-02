package org.om.dch.pages;

import org.om.dch.utils.Global_Vars;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private @FindBy(id = "username")
    WebElement loginUsername;

    private @FindBy(id = "password")
    WebElement loginPassword;

    private @FindBy(css = "button[value='Log in']")
    WebElement loginButton;

    public LoginPage() {
        super();
    }


    public void navigateToAsk_Om_Login_Page() {
        navigateTo_URL(Global_Vars.ASK_OM_DCH_ACCOUNT_PAGE_URL);

    }

    public void setUsername(String userName) {
        sendKeys(loginUsername, userName);

    }


      public void setPassword(String password) {
        sendKeys(loginPassword, password);
    }

    public void getLoginButton() {
        loginButton.click();

    }
}
