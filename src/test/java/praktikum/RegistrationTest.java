package praktikum;

import org.junit.Test;
import org.apache.commons.lang3.RandomStringUtils;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import org.junit.Assert;
import io.qameta.allure.junit4.DisplayName;

public class RegistrationTest {

    @Test
    @DisplayName("User can register with valid credentials")
    public void testUserCanRegister() {
        Header header = open(Header.URL, Header.class);
        header.clickPersonalAccount();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.clickRegistrationLink();
        String nameValue = RandomStringUtils.randomAlphabetic(10);
        String emailValue = RandomStringUtils.randomAlphabetic(10).toLowerCase() + "@yandex.ru";
        String passwordValue = RandomStringUtils.randomAlphabetic(10);
        authPage.fillNameField(nameValue);
        authPage.fillEmailField(emailValue);
        authPage.fillPasswordField(passwordValue);
        authPage.clickRegisterButton();
        Assert.assertTrue("После регистрации не видна кнопка Войти", authPage.enterButtonIsVisible());
    }

    @Test
    @DisplayName("User cannot register with incorrect password")
    public void testUserCannotRegisterWithIncorrectPassword() {
        Header header = open(Header.URL, Header.class);
        header.clickPersonalAccount();
        AuthorizationPage authPage = page(AuthorizationPage.class);
        authPage.clickRegistrationLink();
        String nameValue = RandomStringUtils.randomAlphabetic(10);
        String emailValue = RandomStringUtils.randomAlphabetic(10).toLowerCase() + "@yandex.ru";
        String passwordValue = RandomStringUtils.randomAlphabetic(2);
        authPage.fillNameField(nameValue);
        authPage.fillEmailField(emailValue);
        authPage.fillPasswordField(passwordValue);
        authPage.clickRegisterButton();
        Assert.assertTrue("Нет сообщения 'Некорректный пароль'", authPage.passwordErrorMessageIsVisible());
    }


}
