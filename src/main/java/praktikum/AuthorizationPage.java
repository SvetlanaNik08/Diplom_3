package praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.time.Duration.ofSeconds;

import io.qameta.allure.Step;

import java.util.List;

public class AuthorizationPage {

    @FindBy(how = How.XPATH, using = ".//a[@href='/register']")
    private SelenideElement registrationLink;
    @FindBy(how = How.XPATH, using = ".//input[@name='name']")
    private List<SelenideElement> nameOrEmailField;
    @FindBy(how = How.XPATH, using = ".//input[@name='Пароль']")
    private SelenideElement passwordField;
    @FindBy(how = How.XPATH, using = ".//button[text()='Зарегистрироваться']")
    private SelenideElement registerButton;
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти']")
    private SelenideElement enterButton;
    @FindBy(how = How.XPATH, using = ".//p[text()='Некорректный пароль']")
    private SelenideElement passwordErrorMessage;
    @FindBy(how = How.XPATH, using = ".//button[text()='Выход']")
    private SelenideElement logoutButton;
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement enterLink;
    @FindBy(how = How.XPATH, using = ".//a[text()='Восстановить пароль']")
    private SelenideElement restorePasswordLink;
    @FindBy(how = How.XPATH, using = ".//a[text()='Профиль']")
    private SelenideElement profileLink;

    @Step("Click registration link")
    public void clickRegistrationLink() {
        registrationLink.click();
    }

    @Step("Click registration button from registration_form")
    public void clickRegisterButton() {
        registerButton.click();
    }

    @Step("Click button to enter in account")
    public void clickEnterButton() {
        enterButton.click();
    }

    @Step("Click button to logout")
    public void clickLogoutButton() {
        logoutButton.click();
    }

    @Step("Click link to login from restore_password_form")
    public void clickEnterLink() {
        enterLink.click();
    }

    @Step("Click link to restore password")
    public void clickRestorePasswordLink() {
        restorePasswordLink.click();
    }

    @Step("Filling first text field")
    public void fillNameField(String nameValue) {
        nameOrEmailField.get(0).clear();
        nameOrEmailField.get(0).val(nameValue);
    }

    @Step("Filling email field")
    public void fillEmailField(String emailValue) {
        nameOrEmailField.get(1).clear();
        nameOrEmailField.get(1).val(emailValue);
    }

    @Step("Filling password field")
    public void fillPasswordField(String passwordValue) {
        passwordField.clear();
        passwordField.val(passwordValue);
    }

    @Step("Button_to_enter is visible")
    public boolean enterButtonIsVisible() {
        enterButton.shouldBe(Condition.visible, ofSeconds(8));
        return enterButton.isDisplayed();
    }

    @Step("Message 'Incorrect password' is visible")
    public boolean passwordErrorMessageIsVisible() {
        passwordErrorMessage.shouldBe(Condition.visible, ofSeconds(8));
        return passwordErrorMessage.isDisplayed();
    }

    @Step("Text 'Profile' is visible")
    public boolean profileLinkIsVisible() {
        profileLink.shouldBe(Condition.visible, ofSeconds(8));
        return profileLink.isDisplayed();
    }
}
