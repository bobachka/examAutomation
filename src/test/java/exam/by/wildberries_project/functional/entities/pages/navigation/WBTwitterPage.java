package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBTwitterPage extends AbstractPage {
    public static String twitterLogo = "//h1[@role=\"heading\"]";

    public static WBTwitterPage getTwitterPage(){
        WBTwitterPage twitterPage = new WBTwitterPage();
        System.out.println("Twitter page is opened");
        return twitterPage;
    }

    public boolean isTwitterLogoPresent(){
        changeWindow();
        return getElement(twitterLogo).isDisplayed();
    }
}
