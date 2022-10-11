package vk.pageobjects.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import vk.data.DataSupplier;
import vk.pageobjects.utils.StringUtils;

import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage {

    public BasePage openUrl(String url){
        open(url);
        return this;
    }

    public void assertElementVisible(SelenideElement element){
        element.shouldBe(Condition.visible);
    }

    public static String randomStrAlphabeticOfLength(int length){
        DataSupplier.setRandomStr(StringUtils.generateRandomStrAlphabetic(length));
        return DataSupplier.getRandomStr();
    }

}
