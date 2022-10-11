package vk.pageobjects.pages;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import vk.data.DataSupplier;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    private final SelenideElement loginInput = $x("//form[@class='VkIdForm__form']/input[@name='login']");
    private final SelenideElement loginButton = $x("//*[contains(@class, 'VkIdForm__signInButton')]");
    private String loginText;

    @Step("Opening login page")
    public LoginPage openLoginPage() {
        openUrl(DataSupplier.getLoginPageUrl());
        return this;
    }

    @Step("Entering credentials")
    public LoginPage enterLogin(String text) {
        //assertElementVisible(loginInput);
        loginText = text;
        loginInput.sendKeys(loginText);
        return this;
    }

    @Step("Clicking login button")
    public IdPage clickLoginButton(){
        IdPage idPage = new IdPage(loginText);
        //assertElementVisible(loginInput);
        loginButton.click();
        return idPage;
    }
}
