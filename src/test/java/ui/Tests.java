package ui;

import com.codeborne.selenide.testng.TextReport;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;
import vk.data.DataSupplier;
import vk.pageobjects.pages.BasePage;
import vk.testng.BaseTestNGTest;
import vk.pageobjects.pages.LoginPage;

import static vk.data.DataSupplier.*;
import static vk.pageobjects.pages.BasePage.randomStrAlphabeticOfLength;


@Listeners(TextReport.class)
public class Tests extends BaseTestNGTest {

    @Test(description = "Login test negative")
    public void loginTestNegative(){
        LoginPage loginPage = new LoginPage();

        loginPage.openLoginPage()
                //.enterEmptyLogin()
                //checkMessageError
                //.enterIncorrectLogin()
                .enterLogin(getCorrectLoginTelephone())
                .clickLoginButton()
                .checkPasswordInfoTextDisplayed()
                .checkPasswordViewIconDisplayed()
                .checkVkLogoDisplayed()
                .enterPassword(getIncorrectPassword())
                .enterPassword(getPasswordEmpty());
    }

    @Test(description = "Login test positive")
    public void loginTestPositive(){
        LoginPage loginPage = new LoginPage();

        loginPage.openLoginPage()
                .enterLogin(getCorrectLoginTelephone())
                .clickLoginButton()
                .checkVkLogoDisplayed()
                .checkPasswordInfoTextDisplayed()
                .checkPasswordViewIconDisplayed()
                .checkForgotPasswordButtonText()
                .enterPassword(getCorrectPassword())
                .clickContinue();
    }

    @Test(description = "Create chat")
    public void createChat() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage()
                .enterLogin(getCorrectLoginTelephone())
                .clickLoginButton()
                .enterPassword(getCorrectPassword())
                .clickContinue()
                .openMessages()
                .newChat()
                .enteringNameOfTheChat(randomStrAlphabeticOfLength(7))
                .confirmingCreation()
                .findingChatInTheList(getRandomStr());
    }


}
