package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBKidsPage extends AbstractPage {
    private static String wbKidsTitle = "//a[@href='https://kids.wildberries.ru/adventures']";

    public static WBKidsPage getWildberriesKidsPage() {
        WBKidsPage kidsPage = new WBKidsPage();
        System.out.println("Wildberries kids page is opened!");
        return kidsPage;
    }

    public boolean isWbKidsTitlePresent() {
        return getElement(wbKidsTitle).isDisplayed();
    }
}
