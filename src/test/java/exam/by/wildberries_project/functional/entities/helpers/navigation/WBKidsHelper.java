package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBKidsPage;

public class WBKidsHelper extends AbstractHelper {
    private WBKidsPage kidsPage = new WBKidsPage();

    public boolean checkKidsLogo() {
        return kidsPage.isWbKidsTitlePresent();
    }
}
