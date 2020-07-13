package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;
import exam.by.wildberries_project.functional.entities.pages.WBHomePage;

public class WBVkPage extends AbstractPage {
    private static String vkWildberriesBackLink = "//a[@href='/away.php?to=http%3A%2F%2Fwww.wildberries.by&cc_key=']";

    public static WBVkPage getVkWildberriesPage(){
        WBVkPage vkPage = new WBVkPage();
        System.out.println("Vk wildberries page is opened");
        return vkPage;
    }
    public WBHomePage clickWildberriesBackLink(){
        changeWindow();
        getElement(vkWildberriesBackLink).click();
        return WBHomePage.getHomePage();
    }
}
