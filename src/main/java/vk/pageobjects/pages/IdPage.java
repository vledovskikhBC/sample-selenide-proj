package vk.pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class IdPage extends BasePage {

    SelenideElement vkLogo = $(".vkc__StepInfo__avatar");
    SelenideElement enterPasswordInfoText = $(".vkc__EnterPasswordNoUserInfo__highlightLogin");
    SelenideElement passwordInput = $x("//input[@name='password']");
    SelenideElement passwordViewIcon = $x("//*[@class='vkc__Password__ViewIcon']");

    SelenideElement backButton = $("button .vkc__ContentHeader__navigationIconWrapper");
    SelenideElement forgotPasswordButton = $(".vkc__EnterPasswordNoUserInfo__link");
    SelenideElement continueButton = $x("//button[@type='submit']");

    private String password;
    private String login;
    private String telephoneNumber;

    public IdPage(){

    }

    public IdPage(String number) {
        setLogin(number);
        //setPassword(password);
        setTelephoneNumber(number);
    }

    private void setLogin(String value){
        this.login = value;
    }
    private void setPassword(String value){
        this.password = value;
    }

    private void setTelephoneNumber(String number){
        StringBuilder sb = new StringBuilder(number);
        sb.insert(2, ' ');
        sb.insert(6, ' ');
        sb.insert(10, '-');
        sb.insert(13, '-');
        this.telephoneNumber = sb.toString();
    }

    private String getTelephoneNumber(){
        return telephoneNumber;
    }
    private String getLogin(){
        return login;
    }
    private String getPassword(){
        return password;
    }

    @Step("Checking if VK logo is displayed")
    public IdPage checkVkLogoDisplayed(){
        assertElementVisible(vkLogo);
        return this;
    }

    @Step("Checking if password info text is displayed")
    public IdPage checkPasswordInfoTextDisplayed(){
        assertElementVisible(enterPasswordInfoText);
        //Проверяю скриншоты
        enterPasswordInfoText.shouldHave(exactText("Введите ваш текущий пароль, привязанный к " + getTelephoneNumber()));
        return this;
    }

    @Step("Checking if password view icon is displayed")
    public IdPage checkPasswordViewIconDisplayed(){
        assertElementVisible(passwordViewIcon);
        return this;
    }

    @Step("Checking if forgot password button text is displayed")
    public IdPage checkForgotPasswordButtonText(){
        assertElementVisible(forgotPasswordButton);
        forgotPasswordButton.shouldHave(exactText("Забыли или не установили пароль?"));
        return this;
    }

    @Step("Entering %text in password field")
    public IdPage enterPassword(String text){
        assertElementVisible(passwordInput);
        passwordInput.sendKeys(text);
        return this;
    }

    @Step("Clicking continue button")
    public ProfilePage clickContinue(){
        assertElementVisible(continueButton);
        continueButton.click();
        return new ProfilePage();
    }
}
