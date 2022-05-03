package praktikum;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import org.junit.Assert;
import io.qameta.allure.junit4.DisplayName;

public class GoToPersonalAccountTest {

    @Test
    @DisplayName("Authorized user gets personal_account_form after click personal_account_button")
    public void testGoToPersonalAccount() {
        Header header = open(Header.URL, Header.class);
        header.clickPersonalAccount();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.fillNameField("olga08@yandex.ru");
        authPage.fillPasswordField("OlgaOlga");
        authPage.clickEnterButton();
        Header header1 = page(Header.class);
        header1.clickPersonalAccount();
        AuthorizationPage authPage1 = page(AuthorizationPage.class);
        Assert.assertTrue("Не отображается ссылка 'Профиль'", authPage1.profileLinkIsVisible());

        authPage1.clickLogoutButton();
    }
}
