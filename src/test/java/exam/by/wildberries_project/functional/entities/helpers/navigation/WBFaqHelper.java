package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBFaqPage;

public class WBFaqHelper extends AbstractHelper {
    WBFaqPage faqPage = new WBFaqPage();

    public int faqSearch(String searchKey) {
        return faqPage
                .fillInputFaqLine(searchKey)
                .getFaqResults();
    }
}
