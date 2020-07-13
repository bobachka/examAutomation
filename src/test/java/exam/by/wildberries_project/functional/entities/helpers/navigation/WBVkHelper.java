package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.helpers.WBHomeHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBVkPage;

public class WBVkHelper extends AbstractHelper {
    private WBVkPage vkPage = new WBVkPage();

    public WBHomeHelper goToHomePage() {
        vkPage.clickWildberriesBackLink();
        System.out.println("User is re-directed back to Wildberries site!");
        return new WBHomeHelper();
    }
}
