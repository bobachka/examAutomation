package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBYoutubePage;

public class WBYoutubeHelper extends AbstractHelper {
    private WBYoutubePage youtubePage = new WBYoutubePage();

    public boolean checkYoutubeLogo() {
        return youtubePage.isYoutubeLogoPresent();
    }
}
