package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBFacebookPage extends AbstractPage {
    public static String facebookLogo = "//i[@class='fb_logo img sp_dd_tYGNcdGJ sx_6058d3']";

    public static WBFacebookPage getFacebookPage() {
        WBFacebookPage facebookPage = new WBFacebookPage();
        System.out.println("Facebook page is opened");
        return facebookPage;
    }

    public boolean isFacebookLogoPresent() {
        changeWindow();
        return getElement(facebookLogo).isDisplayed();
    }
}
