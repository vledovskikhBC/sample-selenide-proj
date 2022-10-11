package vk.testng;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public abstract class BaseTestNGTest {
  private static final Logger log = LoggerFactory.getLogger(BaseTestNGTest.class);

  @BeforeSuite
  public void beforeSuite(){
    System.out.println("Before Suite");
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
  }

  @BeforeClass
  final void startTestClass() {
    System.out.println("Before Class");
    log.info("Start {} TestNG tests in {}", getClass().getName(), Configuration.browser = "chrome");
  }

  @BeforeMethod
  public void setUp() {
    System.out.println("Before Method");
    //Configuration.assertionMode = STRICT;
  }

  @AfterClass
  public void finishTestClass() {
    System.out.println("After Class");
    //log.info("Finished {} TestNG tests in {}", getClass().getName(), Configuration.browser);
  }

  @AfterMethod
  public void afterMethod() {
    Selenide.clearBrowserCookies();
    Selenide.clearBrowserLocalStorage();
  }

  @AfterSuite
  public void afterSuite(){
    System.out.println("After Suite");
  }
}
