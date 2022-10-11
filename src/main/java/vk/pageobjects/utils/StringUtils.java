package vk.pageobjects.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class StringUtils {
    public static String generateRandomStrAlphabetic(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }
}
