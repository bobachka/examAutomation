package exam.by.wildberries_project.functional.entities.helpers.navigation;

import exam.by.wildberries_project.functional.entities.helpers.AbstractHelper;
import exam.by.wildberries_project.functional.entities.pages.navigation.WBPaymentOptionsPage;

public class WBPaymentOptionsHelper extends AbstractHelper {
    private WBPaymentOptionsPage paymentOptionsPage = new WBPaymentOptionsPage();

    public boolean checkVisaPaymentOptionPresent() {
        return paymentOptionsPage
                .clickBankCardDropdown()
                .isVisaLogoPresent();
    }
}
