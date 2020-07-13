package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBPaymentOptionsPage extends AbstractPage {
    private static String paymentOptionsTitle = "//h1[@class='title-main']";
    private static String bankCardDropdown = "//h2[(contains(text(),'Банковская карта'))]";
    private static String visaLogo = "//span[@class='block-cards-item card-visa-37']";

    public static WBPaymentOptionsPage getPaymentOptionsPage() {
        WBPaymentOptionsPage paymentOptionsPage = new WBPaymentOptionsPage();
        waitForElementVisible(getElementBy(paymentOptionsTitle));
        System.out.println("Payment options page is opened");
        return paymentOptionsPage;
    }

    public WBPaymentOptionsPage clickBankCardDropdown() {
        getElement(bankCardDropdown).click();
        return getPaymentOptionsPage();
    }

    public boolean isVisaLogoPresent() {
        wait(500);
        return getElement(visaLogo).isDisplayed();
    }
}
