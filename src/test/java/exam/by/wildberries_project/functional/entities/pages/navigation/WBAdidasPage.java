package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBAdidasPage extends AbstractPage {
    private static String adidasLogo = "//img[@alt='adidas']";

    public static WBAdidasPage getWildberriesAdidasPage() {
        WBAdidasPage adidasPage = new WBAdidasPage();
        System.out.println("Wildberries adidas page is opened");
        return adidasPage;
    }

    public boolean isAdidasLogoPresent() {
        return getElement(adidasLogo).isDisplayed();
    }
}
