package exam.by.wildberries_project.functional.entities.pages.login;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;
import org.openqa.selenium.WebElement;

public class WBConfirmPage extends AbstractPage {
    private static String title = "//*[@id=\"body-layout\"]/div/div/div/form/div/div[2]/h2";

    public boolean getWbConfirmPage() {
        waitForElementVisible(getElementBy(title));
        WebElement titl = getElement(title);
        if (titl == null) {
            return false;
        } else
            return titl.isDisplayed();
    }
}