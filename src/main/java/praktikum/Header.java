package praktikum;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import io.qameta.allure.Step;

public class Header {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    private SelenideElement personalAccountButton;
    @FindBy(how = How.XPATH, using = ".//p[text()='Конструктор']")
    private SelenideElement constructorButton;
    @FindBy(how = How.XPATH, using = ".//*[@id='root']/div/header/nav/div/a")
    private SelenideElement stellarBurgerLogo;

    @Step("Click personal account button")
    public void clickPersonalAccount() {
        personalAccountButton.click();
    }

    @Step("Click constructor button")
    public void clickConstructorButton() {
        constructorButton.click();
    }

    @Step("Click logo")
    public void clickStellarBurgerLogo() {
        stellarBurgerLogo.click();
    }
}
