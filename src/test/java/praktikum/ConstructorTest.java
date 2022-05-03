package praktikum;

import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import org.junit.Assert;
import io.qameta.allure.junit4.DisplayName;

public class ConstructorTest {

    @Test
    @DisplayName("After click buns_link - unit 'Buns' is visible")

    public void testGoToBunsUnitAfterClickBunsLink() {
        Header header = open(Header.URL, Header.class);
        MainPage mainPage = page(MainPage.class);
        mainPage.clickBunsLink();
        Assert.assertTrue("Не отображается название раздела 'Булки'", mainPage.bunsUnitNameIsVisible());
    }

    @Test
    @DisplayName("After click sauces_link - unit 'Sauces' is visible")
    public void testGoSaucesUnitAfterClickSaucesLink() {
        Header header = open(Header.URL, Header.class);
        MainPage mainPage = page(MainPage.class);
        mainPage.clickSaucesLink();
        Assert.assertTrue("Не отображается название раздела 'Соусы'", mainPage.saucesUnitNameIsVisible());
    }

    @Test
    @DisplayName("After click fillings_link - unit 'Fillings' is visible")
    public void testGoToFillingsUnitAfterClickFillingsLink() {
        Header header = open(Header.URL, Header.class);
        MainPage mainPage = page(MainPage.class);
        mainPage.clickFillingsLink();
        Assert.assertTrue("Не отображается название раздела 'Начинки'", mainPage.fillingsUnitNameIsVisible());
    }
}
