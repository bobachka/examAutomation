package exam.by.wildberries_project.functional.entities.pages.navigation;

import exam.by.wildberries_project.functional.entities.pages.AbstractPage;

public class WBFaqPage extends AbstractPage {
    private static String logoFaq = "//div[@class='faq-result']";
    private static String inputFaqLine = "//input[@class='faq-search-input tooltipstered']";
    private static String resultsFaq = "//span[@class='faq-result-count']";

    public static WBFaqPage getFAQPage() {
        WBFaqPage faqPage = new WBFaqPage();
        waitForElementVisible(getElementBy(logoFaq));
        System.out.println("FAQ page is opened!");
        return faqPage;
    }

    public WBFaqPage fillInputFaqLine(String searchKey) {
        getElement(inputFaqLine).sendKeys(searchKey);
        return getFAQPage();
    }

    public int getFaqResults() {
        wait(500);
        return Integer.parseInt(getElement(resultsFaq).getText());
    }
}
