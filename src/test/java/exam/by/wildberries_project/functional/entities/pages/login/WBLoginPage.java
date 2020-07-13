package exam.by.wildberries_project.functional.entities.pages.login;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;
import org.openqa.selenium.WebElement;

public class WBLoginPage extends AbstractPage {
    private static String phoneField = "//*[@id=\"phoneMobile\"]";
    private static String getCodeButton = "//*[@id=\"body-layout\"]/div/div/div/form/div/div[3]/div[5]/div/button";
    private static String errorMessage = "//*[@id=\"body-layout\"]/div/div/div/form/div/div[3]/div[6]/span[1]/span";
    private static String value = "//*[@id=\"phoneInput_FullPhoneMobile\"]";

    public static WBLoginPage getWbLoginPage() {
        WBLoginPage wbLoginPage = new WBLoginPage();
        waitForElementVisible(getElementBy(phoneField));
        System.out.println("Login page is opened!");
        return wbLoginPage;
    }

    public WBLoginPage fillPhoneField(String phoneKey) {
        waitForElementVisible(getElementBy(phoneField));
        getElement(phoneField).sendKeys(phoneKey);
        return getWbLoginPage();
    }

    public WBLoginPage clickGetCodeButton1() {
        getElement(getCodeButton).click();
        return getWbLoginPage();
    }

    public WBLoginPage getValue() {
        getElement(value);
        return getWbLoginPage();
    }

    public boolean displayErrorMessage() {
        System.out.println("Error message is displayed");
        WebElement message = getElement(errorMessage);
        if (message == null) {
            return false;
        } else
            return message.isDisplayed();
    }
}