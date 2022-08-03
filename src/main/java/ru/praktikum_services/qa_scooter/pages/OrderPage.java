package ru.praktikum_services.qa_scooter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    //Name
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//input[contains(@placeholder,'Имя')]")
    private WebElement orderNameInput;
    //Surname
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//input[contains(@placeholder,'Фамилия')]")
    private WebElement orderSurnameInput;
    //Address
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//input[contains(@placeholder,'Адрес')]")
    private WebElement orderAddressInput;
    //Metro station select
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//input[@class='select-search__input']")
    private WebElement orderMetroInput;
    //Metro station element
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//div[@class='select-search__select']//*[text()='Сокол']")
    private WebElement orderMetroStationSokolSelect;
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//div[@class='select-search__select']//*[text()='Лихоборы']")
    private WebElement orderMetroStationLihoborySelect;
    //Phone
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//input[contains(@placeholder,'Телефон')]")
    private WebElement orderPhoneInput;
    //Phone
    @FindBy(xpath = ".//button[text()='Далее']")
    private WebElement orderNextButton;
    //Delivery date
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//input[contains(@placeholder,'Когда привезти')]")
    private WebElement orderDeliveryDateInput;
    //Rent length
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//div[@class='Dropdown-control']//span[@class='Dropdown-arrow']")
    private WebElement orderRentDropdown;
    //Rent length exact
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//div[@class='Dropdown-menu']/div[text()='двое суток']")
    private WebElement orderRentLengthTwoDays;
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//div[@class='Dropdown-menu']/div[text()='семеро суток']")
    private WebElement orderRentLengthSevenDays;
    //Scooter color
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//label[@for='black']/input")
    private WebElement orderScooterColourBlack;
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//label[@for='grey']/input")
    private WebElement orderScooterColourGrey;
    //Comment
    @FindBy(xpath = ".//div[@class='Order_Form__17u6u']//input[contains(@placeholder,'Комментарий')]")
    private WebElement orderCommentInput;
    //Order scooter button
    @FindBy(xpath = ".//div[@class='Order_Buttons__1xGrp']//button[text()='Заказать']")
    private WebElement orderScooterButton;
    //Yes button
    @FindBy(xpath = ".//div[@class='Order_Buttons__1xGrp']//button[text()='Да']")
    private WebElement orderConfirmButton;
    //Order confirmed header
    @FindBy(xpath = ".//div[(@class='Order_ModalHeader__3FDaJ') and (text()='Заказ оформлен')]")
    private WebElement orderConfirmedHeader;
    //Scooter logo
    @FindBy(xpath = ".//div[@class='Header_Logo__23yGT']/a[@class='Header_LogoScooter__3lsAR']")
    private WebElement scooterLogo;


    WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public OrderPage setName(String name) {
        orderNameInput.sendKeys(name);
        return this;
    }
    public OrderPage setSurname(String surname) {
        orderSurnameInput.sendKeys(surname);
        return this;
    }
    public OrderPage setAddress(String address) {
        orderAddressInput.sendKeys(address);
        return this;
    }
    public OrderPage setMetroStationSokol() {
        orderMetroInput.click();
        orderMetroStationSokolSelect.click();
        return this;
    }
    public OrderPage setMetroStationLihobory() {
        orderMetroInput.click();
        orderMetroStationSokolSelect.click();
        return this;
    }
    public OrderPage setPhone(String phone) {
        orderPhoneInput.sendKeys(phone);
        return this;
    }
    public OrderPage clickNextButton() {
        orderNextButton.click();
        return this;
    }
    public OrderPage setDeliveryDate(String date) {
        orderDeliveryDateInput.sendKeys(date);
        return this;
    }
    public OrderPage setOrderLengthTwoDays() {
        orderRentDropdown.click();
        orderRentLengthTwoDays.click();
        return this;
    }
    public OrderPage setOrderLengthSevenDays() {
        orderRentDropdown.click();
        orderRentLengthSevenDays.click();
        return this;
    }
    public OrderPage setScooterColourBlack() {
        orderScooterColourBlack.click();
        return this;
    }
    public OrderPage setScooterColourGrey() {
        orderScooterColourGrey.click();
        return this;
    }
    public OrderPage setComment(String comment) {
        orderCommentInput.sendKeys(comment);
        return this;
    }
    public OrderPage orderScooterButtonClick() {
        orderScooterButton.click();
        return this;
    }
    public OrderPage orderConfirmButtonClick() {
        orderConfirmButton.click();
        return this;
    }
    public boolean orderIsPlaced(){
        return orderConfirmedHeader.isDisplayed();
    }
    public void clickScooterLogo() {
        scooterLogo.click();
    }


}
