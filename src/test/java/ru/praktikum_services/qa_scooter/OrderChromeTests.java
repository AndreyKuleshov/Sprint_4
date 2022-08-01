package ru.praktikum_services.qa_scooter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum_services.qa_scooter.pages.MainPage;
import ru.praktikum_services.qa_scooter.pages.OrderPage;

public class OrderChromeTests {
    private static WebDriver driver;
    Locators locator = new Locators();

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    @AfterClass
    public static void teardown() {
        driver.quit();
    }
    @After
    public void stop() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    public void topButtonOrderTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.waitUntilElementIsLoaded(locator.topOrderButton);
        mainPage.clickElement(locator.topOrderButton);
        OrderPage orderPage = new OrderPage(driver);
        orderPage.setName("Андрей");
        orderPage.setSurname("Кулешов");
        orderPage.setAddress("Питер");
    }
}
