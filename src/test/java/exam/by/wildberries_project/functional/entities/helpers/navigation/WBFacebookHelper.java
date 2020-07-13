package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBFacebookPage;

public class WBFacebookHelper extends AbstractHelper {
    private WBFacebookPage facebookPage = new WBFacebookPage();

    public boolean checkFacebookLogo() {
        return facebookPage.isFacebookLogoPresent();
    }
}
