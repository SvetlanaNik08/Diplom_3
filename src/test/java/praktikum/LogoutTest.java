package praktikum;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import org.junit.Assert;
import io.qameta.allure.junit4.DisplayName;

public class LogoutTest {

    @Test
    @DisplayName("User can logout")
    public void testLogoutFromPersonalAccount() {
        Header header = open(Header.URL, Header.class);
        header.clickPersonalAccount();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.fillNameField("olga08@yandex.ru");
        authPage.fillPasswordField("OlgaOlga");
        authPage.clickEnterButton();
        Header header1 = page(Header.class);
        header1.clickPersonalAccount();
        AuthorizationPage authPage1 = page(AuthorizationPage.class);
        authPage1.clickLogoutButton();
        Assert.assertTrue("Не отображается кнопка 'Войти'", authPage.enterButtonIsVisible());
    }
}
