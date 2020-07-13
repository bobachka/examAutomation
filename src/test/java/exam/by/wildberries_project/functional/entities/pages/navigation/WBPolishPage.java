package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;
import org.openqa.selenium.interactions.Actions;

public class WBPolishPage extends AbstractPage {
    public static String polishPageSign = "//div[(contains(text(),'2020 © pl.wildberries.eu'))]";

    public static WBPolishPage getWildberriesPolishPage() {
        WBPolishPage polishPage = new WBPolishPage();
        System.out.println("Wildberries Polish page is opened");
        return polishPage;
    }

    public boolean checkPageIsPolish() {
        Actions scroll = new Actions(getDriver());
        scroll.moveToElement(getElement(polishPageSign));
        scroll.perform();
        return getElement(polishPageSign).isDisplayed();
    }
}
