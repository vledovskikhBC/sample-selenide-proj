package vk.pageobjects.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import vk.pageobjects.fragments.LeftMenuFragment;
import vk.pageobjects.fragments.MessagesFragment;
import vk.pageobjects.fragments.SideBarFragment;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage extends BasePage {

    SelenideElement header = $("[id=\"page_header\"]");

    SideBarFragment sideBar = new SideBarFragment();

    @Step("Opening Messages")
    public MessagesFragment openMessages() {
        sideBar.getMessengerButton().click();
        return new MessagesFragment();
    }

}
