package ru.praktikum_services.qa_scooter;

import org.junit.Assert;
import org.junit.Test;
import ru.praktikum_services.qa_scooter.pages.MainPage;

public class QuestionsFirefoxTests extends BaseFirefoxTest {

    static MainPage mainPage = new MainPage(driver);

    @Test
    public void firstQuestionTest() {
        Assert.assertTrue(mainPage.clickQuestion1().answer1IsVisible());
    }
    @Test
    public void secondQuestionTest() {
        Assert.assertTrue(mainPage.clickQuestion2().answer2IsVisible());
    }
    @Test
    public void thirdQuestionTest() {
        Assert.assertTrue(mainPage.clickQuestion3().answer3IsVisible());
    }
    @Test
    public void fourthQuestionTest() {
        Assert.assertTrue(mainPage.clickQuestion4().answer4IsVisible());
    }
    @Test
    public void fifthQuestionTest() {
        Assert.assertTrue(mainPage.clickQuestion5().answer5IsVisible());
    }
    @Test
    public void sixthQuestionTest() {
        Assert.assertTrue(mainPage.clickQuestion6().answer6IsVisible());
    }
    @Test
    public void seventhQuestionTest() {
        Assert.assertTrue(mainPage.clickQuestion7().answer7IsVisible());
    }
    @Test
    public void eighthQuestionTest() {
        Assert.assertTrue(mainPage.clickQuestion8().answer8IsVisible());
    }
}
