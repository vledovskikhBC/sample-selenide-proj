package vk.pageobjects.fragments;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import vk.pageobjects.pages.BasePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MessagesFragment extends BasePage {

    private final SelenideElement newChatButton = $("button[aria-label='Новый чат']");
    private final SelenideElement cancelButton = $("button[aria-label='Отмена']");
    private final SelenideElement createNewButton = $x("//*[@class=\"_im_start_new\"]");
    private final SelenideElement confirmCreatingButton = $x("//*[contains(@class, 'im-create--footer')]//button[contains(@class, 'FlatButton')]//*[contains(text(), 'Создать чат')]");
    private final SelenideElement cancelCreatingButton = $x("//*[contains(@class, 'im-create--footer')]//button[contains(@class, 'FlatButton')]//*[contains(text(), 'Отмена')]");
    private final SelenideElement settingsButton = $x("//a[contains(@class, '_im_creation_settings')]");

    private final SelenideElement chatNameField = $("[id='im_dialogs_creation_name']");
    private final SelenideElement nameOrSurnameField = $("[id='im_dialogs_creation']");

    private final ElementsCollection dialogs = $$x("//*[@class='_im_dialog_link']");
    //*[@class='_im_dialog_link'][contains(text(),"")]

//    public SelenideElement getCancelButton() {
//        return cancelButton;
//    }
//    public SelenideElement getChatNameField() {
//        return chatNameField;
//    }
//    public SelenideElement getNameOrSurnameField() {
//        return nameOrSurnameField;
//    }
//    public SelenideElement getNewChatButton() {
//        return newChatButton;
//    }
//    public SelenideElement getCreateNewChatButton() {
//        return createNewButton;
//    }
//    public SelenideElement getConfirmCreatingButton() {
//        return confirmCreatingButton;
//    }
//    public SelenideElement getCancelCreatingButton() {
//        return cancelCreatingButton;
//    }
//    public SelenideElement getSettingsButton() {
//        return settingsButton;
//    }

    @Step("Press new chat button")
    public MessagesFragment newChat(){
        newChatButton.shouldBe(Condition.visible);
        newChatButton.click();
        return this;
    }

    @Step("Entering name of the chat")
    public MessagesFragment enteringNameOfTheChat(String name){
        chatNameField.shouldBe(Condition.visible);
        chatNameField.setValue(name);
        System.out.println("looking for: " + name);
        return this;
    }

    @Step("Confirming creation")
    public MessagesFragment confirmingCreation() throws InterruptedException {
        confirmCreatingButton.shouldBe(Condition.visible);
        confirmCreatingButton.click();
        //Thread.sleep(3000);
        return this;
    }

    @Step("Finding chat recently created")
    public MessagesFragment findingChatInTheList(String name) throws InterruptedException {

        dialogs.should(CollectionCondition.itemWithText(name));
        return this;
    }
}
