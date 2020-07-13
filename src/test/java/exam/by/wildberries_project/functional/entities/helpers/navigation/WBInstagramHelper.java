package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBInstagramPage;

public class WBInstagramHelper extends AbstractHelper {
    private WBInstagramPage instagramPage = new WBInstagramPage();

    public boolean checkInstagramLogo() {
        return instagramPage.isInstagramLogoPresent();
    }
}
