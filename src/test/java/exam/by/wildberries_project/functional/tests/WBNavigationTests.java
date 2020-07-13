package exam.by.wildberries_project.functional.tests;

import exam.by.wildberries_project.functional.entities.helpers.*;
import exam.by.wildberries_project.functional.entities.helpers.navigation.*;
import exam.by.wildberries_project.functional.entities.helpers.search.WBSearchHelper;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class WBNavigationTests {
    private WBHomeHelper homeHelper = new WBHomeHelper();
    private WBSearchHelper searchHelper = new WBSearchHelper();
    private WBTheoryOfEverythingHelper theoryOfEverythingHelper = new WBTheoryOfEverythingHelper();
    private WBCartHelper cartHelper = new WBCartHelper();
    private WBFaqHelper faqHelper = new WBFaqHelper();
    private WBKidsHelper kidsHelper = new WBKidsHelper();
    private WBPolishHelper polishHelper = new WBPolishHelper();
    private WBRentHelper rentHelper = new WBRentHelper();
    private WBAllBrandsHelper allBrandsHelper = new WBAllBrandsHelper();
    private WBAdidasHelper adidasHelper = new WBAdidasHelper();
    private WBPaymentOptionsHelper paymentOptionsHelper = new WBPaymentOptionsHelper();
    private WBVkHelper vkHelper = new WBVkHelper();
    private WBFacebookHelper facebookHelper = new WBFacebookHelper();
    private WBTwitterHelper twitterHelper = new WBTwitterHelper();
    private WBYoutubeHelper youtubeHelper = new WBYoutubeHelper();
    private WBInstagramHelper instagramHelper = new WBInstagramHelper();

    private String bookSearchKey = "Теория всего";
    private String faqSearchKey = "Регистрация";
    private String citySearchKey = "Лида";

    @Test
    @Description(value = "Тест проверяет поиск и добавление товара в корзину")
    public void buyTheBookTest(){
        homeHelper.navigateToHomePage();
        homeHelper.searchBook(bookSearchKey);
        searchHelper.goToTheoryOfEverythingPage();
        theoryOfEverythingHelper.addBook();
        Assert.assertTrue(cartHelper.checkTheoryOfEverythingPresentInCart(),"Book is not found in the cart: ");
    }

    @Test
    @Description(value = "Тест проверяет поиск на странице FAQ")
    public void faqSearchTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToFaqPage();
        int faqResults = faqHelper.faqSearch(faqSearchKey);
        Assert.assertTrue(faqResults > 0, "No results were found: ");
    }

    @Test
    @Description(value = "Тест проверяет смену города")
    public void locationChangeTest(){
        homeHelper.navigateToHomePage();
        Assert.assertTrue(homeHelper.checkLocationChange(citySearchKey),"New location is not set: ");
    }


    @Test
    @Description(value = "Тест проверяет смену страны")
    public void countryChangeTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToPolishPage();
        Assert.assertTrue(polishHelper.checkPolishLogo(), "Polish page is not opened: ");
    }

    @Test
    @Description(value = "Тест проверяет переход на сайт wbkids")
    public void kidsPageTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToKidsPage();
        Assert.assertTrue(kidsHelper.checkKidsLogo(),"Kids page is not opened: ");
    }

    @Test
    @Description(value = "Тест проверяет переход на страницу Аренды")
    public void rentPageTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToRentPage();
        Assert.assertTrue(rentHelper.checkRentLogo(), "Rest page is not opened: ");
    }

    @Test
    @Description(value = "Тест проверяет переход на страницу бренда")
    public void adidasBrandTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToAllBrandsPage();
        allBrandsHelper.goAdidasPage();
        Assert.assertTrue(adidasHelper.checkAdidasLogo(), "Adidas page is not opened: ");
    }

    @Test
    @Description(value = "Тест проверяет возможность оплаты Visa")
    public void visaPaymentOptionTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToPaymentOptionsPage();
        Assert.assertTrue(paymentOptionsHelper.checkVisaPaymentOptionPresent(), "Visa payment option is not present: ");
    }

    @Test
    @Description(value = "Тест проверяет переход по ВК-ссылке и возврат назад")
    public void vkLinkTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToVkPage();
        vkHelper.goToHomePage();
        boolean logoPresent = homeHelper.checkHomeLogo();
        Assert.assertTrue(logoPresent,"Home page is not opened: ");
    }

    @Test
    @Description(value = "Тест проверяет переход по ФБ-ссылке")
    public void facebookLinkTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToFacebookPage();
        Assert.assertTrue(facebookHelper.checkFacebookLogo(),"Facebook page is not opened: ");
    }

    @Test
    @Description(value = "Тест проверяет переход по Твиттер-ссылке")
    public void twitterLinkTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToTwitterPage();
        Assert.assertTrue(twitterHelper.checkTwitterLogo(),"Twitter page is not opened: ");
    }

    @Test
    @Description(value = "Тест проверяет переход по Ютуб-ссылке")
    public void youtubeLinkTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToYoutubePage();
        Assert.assertTrue(youtubeHelper.checkYoutubeLogo(),"Youtube page is not opened: ");
    }

    @Test
    @Description(value = "Тест проверяет переход по Инста-ссылке")
    public void instagramLinkTest(){
        homeHelper.navigateToHomePage();
        homeHelper.goToInstagramPage();
        Assert.assertTrue(instagramHelper.checkInstagramLogo(),"Instagram page is not opened: ");
    }

    @AfterSuite
    public void tearDown(){
        cartHelper.quit();
    }
}
