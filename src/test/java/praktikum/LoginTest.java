package praktikum;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import org.junit.Assert;
import io.qameta.allure.junit4.DisplayName;

public class LoginTest {

    @Test
    @DisplayName("User can login with button on main page")
    public void testLoginWithEnterAccountButton() {
        Header header = open(Header.URL, Header.class);
        MainPage mainPage = page(MainPage.class);
        mainPage.clickEnterAccountButton();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.fillNameField("olga08@yandex.ru");
        authPage.fillPasswordField("OlgaOlga");
        authPage.clickEnterButton();
        MainPage mainPage1 = page(MainPage.class);
        Assert.assertTrue("Не отображается кнопка 'Оформить заказ'", mainPage1.makeOrderButtonIsVisible());

        Header header1 = page(Header.class);
        header1.clickPersonalAccount();
        AuthorizationPage authPage1 = page(AuthorizationPage.class);
        authPage1.clickLogoutButton();
    }

    @Test
    @DisplayName("User can login from header with personal_account_button")
    public void testLoginWithPersonalAccountButton() {
        Header header = open(Header.URL, Header.class);
        header.clickPersonalAccount();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.fillNameField("olga08@yandex.ru");
        authPage.fillPasswordField("OlgaOlga");
        authPage.clickEnterButton();
        MainPage mainPage1 = page(MainPage.class);
        Assert.assertTrue("Не отображается кнопка 'Оформить заказ'", mainPage1.makeOrderButtonIsVisible());

        Header header1 = page(Header.class);
        header1.clickPersonalAccount();
        AuthorizationPage authPage1 = page(AuthorizationPage.class);
        authPage1.clickLogoutButton();
    }

    @Test
    @DisplayName("User can login from registration_page")
    public void testLoginFromRegistrationPage() {
        Header header = open(Header.URL, Header.class);
        header.clickPersonalAccount();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.clickRegistrationLink();
        authPage.clickEnterLink();
        authPage.fillNameField("olga08@yandex.ru");
        authPage.fillPasswordField("OlgaOlga");
        authPage.clickEnterButton();
        MainPage mainPage1 = page(MainPage.class);
        Assert.assertTrue("Не отображается кнопка 'Оформить заказ'", mainPage1.makeOrderButtonIsVisible());

        Header header1 = page(Header.class);
        header1.clickPersonalAccount();
        AuthorizationPage authPage1 = page(AuthorizationPage.class);
        authPage1.clickLogoutButton();
    }

    @Test
    @DisplayName("User can login from restore_password_form")
    public void testLoginWithRestorePasswordLink() {
        Header header = open(Header.URL, Header.class);
        header.clickPersonalAccount();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.clickRestorePasswordLink();
        authPage.clickEnterLink();
        authPage.fillNameField("olga08@yandex.ru");
        authPage.fillPasswordField("OlgaOlga");
        authPage.clickEnterButton();
        MainPage mainPage1 = page(MainPage.class);
        Assert.assertTrue("Не отображается кнопка 'Оформить заказ'", mainPage1.makeOrderButtonIsVisible());

        Header header1 = page(Header.class);
        header1.clickPersonalAccount();
        AuthorizationPage authPage1 = page(AuthorizationPage.class);
        authPage1.clickLogoutButton();
    }

}
