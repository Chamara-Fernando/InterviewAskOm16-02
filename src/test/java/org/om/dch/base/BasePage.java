//package org.om.dch.base;
//
//import org.om.dch.factory.DriverFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import static java.sql.DriverManager.getDriver;
//import static org.om.dch.base.TimeOuts.DEFAULT_EXPLICIT_TIMEOUT;
//
//public class BasePage {
//
//
//    public BasePage() {
//        PageFactory.initElements(getDriver(), this);
//    }
//
//    public WebDriver getDriver() {
//
//        return DriverFactory.initializeDriver("chrome");
//    }
//
//    public void sendKeys(WebElement element, String textToType) {
//        WebDriverWait wait = new WebDriverWait(getDriver(),5);
//        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textToType);
//
//
//    }
//}
