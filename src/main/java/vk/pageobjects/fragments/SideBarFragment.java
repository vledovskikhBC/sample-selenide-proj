package vk.pageobjects.fragments;

import com.codeborne.selenide.SelenideElement;
import vk.pageobjects.pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class SideBarFragment extends BasePage {

    private final SelenideElement myPageButton = $("li[id=\"l_pr\"]");
    private final SelenideElement newsButton = $("li[id=\"l_nwsf\"]");
    private final SelenideElement messengerButton = $("li[id=\"l_msg\"]");
    private final SelenideElement callsButton = $("li[id=\"l_ca\"]");
    private final SelenideElement friendsButton = $("li[id=\"l_fr\"]");
    private final SelenideElement groupsButton = $("li[id=\"l_gr\"]");
    private final SelenideElement photosButton = $("li[id=\"l_ph\"]");
    private final SelenideElement audiosButton = $("li[id=\"l_aud\"]");
    private final SelenideElement videoButton = $("li[id=\"l_vid\"]");
    private final SelenideElement shortsButton = $("li[id=\"l_svd\"]");
    private final SelenideElement appsButton = $("li[id=\"l_ap\"]");
    private final SelenideElement stickersButton = $("li[id=\"l_stickers\"]");
    private final SelenideElement marketButton = $("li[id=\"l_mk\"]");
    private final SelenideElement servicesButton = $("li[id=\"l_mini_apps\"]");
    private final SelenideElement vkPayButton = $("li[id=\"l_vkp\"]");
    private final SelenideElement bookmarksButton = $("li[id=\"l_fav\"]");
    private final SelenideElement filesButton = $("li[id=\"l_doc\"]");
    private final SelenideElement adsButton = $("li[id=\"l_ads\"]");

    public SelenideElement getMyPageButton() {
        return myPageButton;
    }

    public SelenideElement getNewsButton() {
        return newsButton;
    }

    public SelenideElement getMessengerButton() {
        return messengerButton;
    }

    public SelenideElement getCallsButton() {
        return callsButton;
    }

    public SelenideElement getFriendsButton() {
        return friendsButton;
    }

    public SelenideElement getGroupsButton() {
        return groupsButton;
    }

    public SelenideElement getPhotosButton() {
        return photosButton;
    }

    public SelenideElement getAudiosButton() {
        return audiosButton;
    }

    public SelenideElement getVideoButton() {
        return videoButton;
    }

    public SelenideElement getShortsButton() {
        return shortsButton;
    }

    public SelenideElement getAppsButton() {
        return appsButton;
    }

    public SelenideElement getStickersButton() {
        return stickersButton;
    }

    public SelenideElement getMarketButton() {
        return marketButton;
    }

    public SelenideElement getServicesButton() {
        return servicesButton;
    }

    public SelenideElement getVkPayButton() {
        return vkPayButton;
    }

    public SelenideElement getBookmarksButton() {
        return bookmarksButton;
    }

    public SelenideElement getFilesButton() {
        return filesButton;
    }

    public SelenideElement getAdsButton() {
        return adsButton;
    }
}
