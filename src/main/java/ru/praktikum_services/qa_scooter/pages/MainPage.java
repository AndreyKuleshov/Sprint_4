package ru.praktikum_services.qa_scooter.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private final String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    private final String YANDEX_URL = "https://yandex.ru/";
    //questions header
    @FindBy(xpath = ".//div[text()='Вопросы о важном']")
    private WebElement questionsHeader;
    //first question
    @FindBy(id = "accordion__heading-0")
    private WebElement questionOne;
    //first answer
    @FindBy(id = "accordion__panel-0")
    private WebElement answerOne;
    //second question
    @FindBy(id = "accordion__heading-1")
    private WebElement questionTwo;
    //second answer
    @FindBy(id = "accordion__panel-1")
    private WebElement answerTwo;
    //third question
    @FindBy(id = "accordion__heading-2")
    private WebElement questionThree;
    //third answer
    @FindBy(id = "accordion__panel-2")
    private WebElement answerThree;
    //fourth question
    @FindBy(id = "accordion__heading-3")
    private WebElement questionFour;
    //fourth answer
    @FindBy(id = "accordion__panel-3")
    private WebElement answerFour;
    //fifth question
    @FindBy(id = "accordion__heading-4")
    private WebElement questionFive;
    //fifth answer
    @FindBy(id = "accordion__panel-4")
    private WebElement answerFive;
    //sixth question
    @FindBy(id = "accordion__heading-5")
    private WebElement questionSix;
    //sixth answer
    @FindBy(id = "accordion__panel-5")
    private WebElement answerSix;
    //seventh question
    @FindBy(id = "accordion__heading-6")
    private WebElement questionSeven;
    //seventh answer
    @FindBy(id = "accordion__panel-6")
    private WebElement answerSeven;
    //eighth question
    @FindBy(id = "accordion__heading-7")
    private WebElement questionEight;
    //eighth answer
    @FindBy(id = "accordion__panel-7")
    private WebElement answerEight;

    //Order scooter buttons
    @FindBy(xpath = ".//div[@class='Header_Header__214zg']//button[text()='Заказать']")
    private WebElement topPlaceOrderButton;
    @FindBy(xpath = ".//div[@class='Home_FinishButton__1_cWm']//button[text()='Заказать']")
    private WebElement bottomPlaceOrderButton;

    //Yandex button
    @FindBy(className = "Header_LogoYandex__3TSOI")
    private WebElement yandexButton;


    private final WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(MAIN_PAGE_URL);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public MainPage clickQuestion1() {
        scrollToElement(questionOne);
        questionOne.click();
        return this;
    }
    public boolean answer1IsVisible() {
        return answerOne.isDisplayed();
    }
    public MainPage clickQuestion2() {
        scrollToElement(questionTwo);
        questionTwo.click();
        return this;
    }
    public boolean answer2IsVisible() {
        return answerTwo.isDisplayed();
    }
    public MainPage clickQuestion3() {
        scrollToElement(questionThree);
        questionThree.click();
        return this;
    }
    public boolean answer3IsVisible() {
        return answerThree.isDisplayed();
    }
    public MainPage clickQuestion4() {
        scrollToElement(questionFour);
        questionFour.click();
        return this;
    }
    public boolean answer4IsVisible() {
        return answerFour.isDisplayed();
    }
    public MainPage clickQuestion5() {
        scrollToElement(questionFive);
        questionFive.click();
        return this;
    }
    public boolean answer5IsVisible() {
        return answerFive.isDisplayed();
    }
    public MainPage clickQuestion6() {
        scrollToElement(questionSix);
        questionSix.click();
        return this;
    }
    public boolean answer6IsVisible() {
        return answerSix.isDisplayed();
    }
    public MainPage clickQuestion7() {
        scrollToElement(questionSeven);
        questionSeven.click();
        return this;
    }
    public boolean answer7IsVisible() {
        return answerSeven.isDisplayed();
    }
    public MainPage clickQuestion8() {
        scrollToElement(questionEight);
        questionEight.click();
        return this;
    }
    public boolean answer8IsVisible() {
        return answerEight.isDisplayed();
    }
    public OrderPage clickTopOrderButton() {
        topPlaceOrderButton.click();
        return new OrderPage(driver);
    }
    public OrderPage clickBottomOrderButton() {
        scrollToElement(bottomPlaceOrderButton);
        bottomPlaceOrderButton.click();
        return new OrderPage(driver);
    }
    public String getMainPageUrl(){
        return MAIN_PAGE_URL;
    }
    public String getYandexPageUrl(){
        return YANDEX_URL;
    }
    public void clickYandexButton() {
        yandexButton.click();
    }
}
