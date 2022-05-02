package praktikum;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static java.time.Duration.ofSeconds;

import io.qameta.allure.Step;

public class MainPage {
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти в аккаунт']")
    private SelenideElement enterAccountButton;
    @FindBy(how = How.XPATH, using = ".//button[text()='Оформить заказ']")
    private SelenideElement makeOrderButton;
    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
    private SelenideElement bunsLink;
    @FindBy(how = How.XPATH, using = ".//span[text()='Соусы']")
    private SelenideElement saucesLink;
    @FindBy(how = How.XPATH, using = ".//span[text()='Начинки']")
    private SelenideElement fillingsLink;
    @FindBy(how = How.XPATH, using = ".//h2[text()='Булки']")
    private SelenideElement bunsUnitName;
    @FindBy(how = How.XPATH, using = ".//h2[text()='Соусы']")
    private SelenideElement saucesUnitName;
    @FindBy(how = How.XPATH, using = ".//h2[text()='Начинки']")
    private SelenideElement fillingsUnitName;
    @FindBy(how = How.XPATH, using = ".//p[text()='Соус Spicy-X']")
    private SelenideElement sauceIngredient;

    @Step("Click button on main page to enter account")
    public void clickEnterAccountButton() {
        enterAccountButton.click();
    }

    @Step("Click link 'Buns'")
    public void clickBunsLink() {
        sauceIngredient.scrollIntoView(true);
        bunsLink.click();
    }

    @Step("Click link 'Sauces'")
    public void clickSaucesLink() {
        saucesLink.click();
    }

    @Step("Click link 'Fillings'")
    public void clickFillingsLink() {
        fillingsLink.click();
    }

    @Step("Button for making order is visible")
    public boolean makeOrderButtonIsVisible() {
        makeOrderButton.shouldBe(Condition.visible, ofSeconds(8));
        return makeOrderButton.isDisplayed();
    }

    @Step("Unit 'Buns' is visible")
    public boolean bunsUnitNameIsVisible() {
        bunsUnitName.shouldBe(Condition.visible, ofSeconds(8));
        return bunsUnitName.isDisplayed();
    }

    @Step("Unit 'Sauces' is visible")
    public boolean saucesUnitNameIsVisible() {
        saucesUnitName.shouldBe(Condition.visible, ofSeconds(8));
        return saucesUnitName.isDisplayed();
    }

    @Step("Unit 'Fillings' is visible")
    public boolean fillingsUnitNameIsVisible() {
        fillingsUnitName.shouldBe(Condition.visible, ofSeconds(8));
        return fillingsUnitName.isDisplayed();
    }
}
