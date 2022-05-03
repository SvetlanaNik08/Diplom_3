package praktikum;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import org.junit.Assert;
import io.qameta.allure.junit4.DisplayName;

public class GoToConstructorTest {

    @Test
    @DisplayName("User can go to constructer after click constructor_button")
    public void testClickConstructorFromPersonalAccount() {
        Header header = open(Header.URL, Header.class);
        header.clickPersonalAccount();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.fillNameField("olga08@yandex.ru");
        authPage.fillPasswordField("OlgaOlga");
        authPage.clickEnterButton();
        Header header1 = page(Header.class);
        header1.clickPersonalAccount();
        header1.clickConstructorButton();
        MainPage mainPage = page(MainPage.class);
        Assert.assertTrue("Не отображается кнопка 'Оформить заказ'", mainPage.makeOrderButtonIsVisible());

        Header header3 = page(Header.class);
        header3.clickPersonalAccount();
        AuthorizationPage authPage1 = page(AuthorizationPage.class);
        authPage1.clickLogoutButton();
    }

    @Test
    @DisplayName("User can go to constructor after click logo")
    public void testClickLogoFromPersonalAccount() {
        Header header = open(Header.URL, Header.class);
        header.clickPersonalAccount();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.fillNameField("olga08@yandex.ru");
        authPage.fillPasswordField("OlgaOlga");
        authPage.clickEnterButton();
        Header header1 = page(Header.class);
        header1.clickPersonalAccount();
        header1.clickStellarBurgerLogo();
        MainPage mainPage = page(MainPage.class);
        Assert.assertTrue("Не отображается кнопка 'Оформить заказ'", mainPage.makeOrderButtonIsVisible());

        Header header3 = page(Header.class);
        header3.clickPersonalAccount();
        AuthorizationPage authPage1 = page(AuthorizationPage.class);
        authPage1.clickLogoutButton();
    }
}
