package exam.by.wildberries_project.functional.entities.helpers.login;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.login.WBConfirmPage;
import exam.by.wildberries_project.functional.entities.pages.login.WBLoginPage;

public class WBLoginHelper extends AbstractHelper {
    WBLoginPage loginPage = new WBLoginPage();

    public WBConfirmPage fillInPhoneField(String phoneKey) {
        loginPage
                .fillPhoneField(phoneKey)
                .clickGetCodeButton1();
        return new WBConfirmPage();
    }

    public WBLoginPage getValue() {
        loginPage.getValue();
        return WBLoginPage.getWbLoginPage();
    }

    public boolean isErrorMessageDisplayed() {
        return loginPage.displayErrorMessage();
    }
}
