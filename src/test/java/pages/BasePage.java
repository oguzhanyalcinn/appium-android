package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;
    private int WAIT_TIME = 15;

    public BasePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void click(AndroidElement element) {
        wait = new WebDriverWait(driver, WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void isDisplayed(AndroidElement element) {
        wait = new WebDriverWait(driver, WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public String getText(AndroidElement element) {
        return element.getText();
    }

    public void isTextDisplayed(AndroidElement element, String text) {
        wait = new WebDriverWait(driver, WAIT_TIME);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }
}