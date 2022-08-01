package ru.praktikum_services.qa_scooter;

import org.openqa.selenium.By;

public class Locators {
    //questions header
    public By questionsHeader = By.xpath(".//div[text()='Вопросы о важном']");
    //first question
    public By questionOne = By.id("accordion__heading-0");
    //first answer
    public By answerOne = By.id("accordion__panel-0");
    //second question
    public By questionTwo = By.id("accordion__heading-1");
    //second answer
    public By answerTwo = By.id("accordion__panel-1");
    //third question
    public By questionThree = By.id("accordion__heading-2");
    //third answer
    public By answerThree = By.id("accordion__panel-2");
    //fourth question
    public By questionFour = By.id("accordion__heading-3");
    //fourth answer
    public By answerFour = By.id("accordion__panel-3");
    //fifth question
    public By questionFive = By.id("accordion__heading-4");
    //fifth answer
    public By answerFive = By.id("accordion__panel-4");
    //sixth question
    public By questionSix = By.id("accordion__heading-5");
    //sixth answer
    public By answerSix = By.id("accordion__panel-5");
    //seventh question
    public By questionSeven = By.id("accordion__heading-6");
    //seventh answer
    public By answerSeven = By.id("accordion__panel-6");
    //eighth question
    public By questionEight = By.id("accordion__heading-7");
    //eighth answer
    public By answerEight = By.id("accordion__panel-7");

    //Order button top
    public By topOrderButton = By.xpath(".//div[@class='Header_Header__214zg']//button[text()='Заказать']");

    //Name
    public By orderNameInput = By.xpath(".//div[@class='Order_Form__17u6u']//input[contains(@placeholder,'Имя')]");
    //Surname
    public By orderSurnameInput = By.xpath(".//div[@class='Order_Form__17u6u']//input[contains(@placeholder,'Фамилия')]");
    //Address
    public By orderAddressInput = By.xpath(".//div[@class='Order_Form__17u6u']//input[contains(@placeholder,'Адрес')]");

}
