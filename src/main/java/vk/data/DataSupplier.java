package vk.data;

import vk.pageobjects.pages.BasePage;
import vk.pageobjects.utils.StringUtils;

public class DataSupplier {

    private static final String LOGIN_PAGE_URL = "http://vk.ru";
    private static final String LOGIN_TELEPHONE = "+79905263065";
    private static final String LOGIN_EMAIL = "test@vk.com";
    private static final String INCORRECT_LOGIN_TEXT = "  asd ";
    private static final String PASSWORD_CORRECT = "Awwck9vVxnP6jDK";
    private static final String PASSWORD_INCORRECT = "http://vk.com";
    private static final String PASSWORD_EMPTY = "";
    private static final String ERROR_LOGIN_MESSAGE_EN = "Phone number or email address required";
    private static final String ERROR_LOGIN_MESSAGE_RU = "";
    private static String RANDOM_STR;

    public static String getLoginPageUrl(){
        return LOGIN_PAGE_URL;
    }

    public static String getCorrectLoginTelephone(){
        return LOGIN_TELEPHONE;
    }

    public static String getIncorrectLoginText(){
        return INCORRECT_LOGIN_TEXT;
    }

    public static String getCorrectPassword(){
        return PASSWORD_CORRECT;
    }

    public static String getIncorrectPassword(){
        return PASSWORD_INCORRECT;
    }

    public static String getPasswordEmpty(){
        return PASSWORD_EMPTY;
    }

    public static String getErrorLoginMessageEn(){
        return ERROR_LOGIN_MESSAGE_EN;
    }

    public static String getRandomStr() {
        return RANDOM_STR;
    }

    public static void setRandomStr(String randomStr) {
        RANDOM_STR = randomStr;
    }
}
