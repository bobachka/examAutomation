package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBInstagramPage extends AbstractPage {
    public static String instagramLogo = "//img[@alt='Instagram']";

    public static WBInstagramPage getInstagramPage() {
        WBInstagramPage instagramPage = new WBInstagramPage();
        System.out.println("Instagram page is opened");
        return instagramPage;
    }

    public boolean isInstagramLogoPresent() {
        changeWindow();
        return getElement(instagramLogo).isDisplayed();
    }
}
