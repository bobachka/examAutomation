package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBYoutubePage extends AbstractPage {
    public static String youtubeLogo = "//div[@id='logo-icon-container']";

    public static WBYoutubePage getYoutubePage(){
        WBYoutubePage youtubePage = new WBYoutubePage();
        System.out.println("Youtube page is opened");
        return youtubePage;
    }

    public boolean isYoutubeLogoPresent(){
        changeWindow();
        return getElement(youtubeLogo).isDisplayed();
    }
}
