package ru.praktikum_services.qa_scooter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.praktikum_services.qa_scooter.pages.MainPage;

public class QuestionsFirefoxTests {

    private static WebDriver driver;
    Locators locator = new Locators();

    @BeforeClass
    public static void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    @AfterClass
    public static void teardown() {
       driver.quit();
    }

    @Test
    public void firstQuestionTest() {
        MainPage mainpage = new MainPage(driver);
        mainpage.waitForLoadAndScrollToQuestions();
        mainpage.clickElement(locator.questionOne);
        Assert.assertTrue("The text didn't show up" ,driver.findElement(locator.answerOne).isDisplayed());
    }
    @Test
    public void secondQuestionTest() {
        MainPage mainpage = new MainPage(driver);
        mainpage.waitForLoadAndScrollToQuestions();
        mainpage.clickElement(locator.questionTwo);
        Assert.assertTrue("The text didn't show up" ,driver.findElement(locator.answerTwo).isDisplayed());
    }
    @Test
    public void thirdQuestionTest() {
        MainPage mainpage = new MainPage(driver);
        mainpage.waitForLoadAndScrollToQuestions();
        mainpage.clickElement(locator.questionThree);
        Assert.assertTrue("The text didn't show up" ,driver.findElement(locator.answerThree).isDisplayed());
    }
    @Test
    public void fourthQuestionTest() {
        MainPage mainpage = new MainPage(driver);
        mainpage.waitForLoadAndScrollToQuestions();
        mainpage.clickElement(locator.questionFour);
        Assert.assertTrue("The text didn't show up" ,driver.findElement(locator.answerFour).isDisplayed());
    }
    @Test
    public void fifthQuestionTest() {
        MainPage mainpage = new MainPage(driver);
        mainpage.waitForLoadAndScrollToQuestions();
        mainpage.clickElement(locator.questionFive);
        Assert.assertTrue("The text didn't show up" ,driver.findElement(locator.answerFive).isDisplayed());
    }
    @Test
    public void sixthQuestionTest() {
        MainPage mainpage = new MainPage(driver);
        mainpage.waitForLoadAndScrollToQuestions();
        mainpage.clickElement(locator.questionSix);
        Assert.assertTrue("The text didn't show up" ,driver.findElement(locator.answerSix).isDisplayed());
    }
    @Test
    public void seventhQuestionTest() {
        MainPage mainpage = new MainPage(driver);
        mainpage.waitForLoadAndScrollToQuestions();
        mainpage.clickElement(locator.questionSeven);
        Assert.assertTrue("The text didn't show up" ,driver.findElement(locator.answerSeven).isDisplayed());
    }
    @Test
    public void eighthQuestionTest() {
        MainPage mainpage = new MainPage(driver);
        mainpage.waitForLoadAndScrollToQuestions();
        mainpage.clickElement(locator.questionEight);
        Assert.assertTrue("The text didn't show up" ,driver.findElement(locator.answerEight).isDisplayed());
    }

}
