package praktikum;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderPage {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    @FindBy(how = How.XPATH,using = ".//p[text()='Личный Кабинет']")
    private SelenideElement buttonPersonalAccount;

    //локатор логотипа Яндекс
 //   @FindBy(how = How.CLASS_NAME,using = "Header_LogoYandex__3TSOI")
 //   private SelenideElement logoYandex;
 //   //локатор кнопки Статус заказа
 //   @FindBy(how = How.XPATH,using = ".//button[text()='Статус заказа']")
 //   private SelenideElement buttonOrderStatus;

    //метод клика по кнопке Статус заказа
 //   public void clickButtonOrderStatus() {
 //       buttonOrderStatus.click();}
    //метод заполнения поля номера заказа
 //   public void setOrderNumber(String orderNumber) {
 //       orderNumberField.setValue(orderNumber);
 //   }
    //методы для вопроса-8
//    public void scrollUntilQuestion8IsVisible() {
 //       question8.scrollIntoView(true);}
 //   public void clickQuestion8() {
 //       question8.click();}
 //   public boolean checkIsAnswer8Visible() {
  //      return answer8.isDisplayed();}


    public void clickPersonalAccount() {
        buttonPersonalAccount.click();}
}
