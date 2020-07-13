package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBRentPage extends AbstractPage {
    private static String rentLogo = "//h2[(contains(text(),'Аренда нежилых помещений'))]";

    public static WBRentPage getWildberriesRentPage() {
        WBRentPage rentPage = new WBRentPage();
        System.out.println("Wildberries rent page is opened");
        return rentPage;
    }

    public boolean isWbRentPageLogoIsPresent() {
        return getElement(rentLogo).isDisplayed();
    }
}
