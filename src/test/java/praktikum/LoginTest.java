package praktikum;
import org.junit.Test;
import org.apache.commons.lang3.RandomStringUtils;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import org.junit.Assert;

public class EntranceTest {

    @Test
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

}
