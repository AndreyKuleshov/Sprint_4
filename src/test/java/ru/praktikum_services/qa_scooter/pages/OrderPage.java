package ru.praktikum_services.qa_scooter.pages;

import org.openqa.selenium.WebDriver;
import ru.praktikum_services.qa_scooter.Locators;

public class OrderPage {
    private final WebDriver driver;
    Locators locators = new Locators();

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setName(String name) {
        driver.findElement(locators.orderNameInput).sendKeys(name);
    }
    public void setSurname(String surname) {
        driver.findElement(locators.orderSurnameInput).sendKeys(surname);
    }
    public void setAddress(String address) {
        driver.findElement(locators.orderSurnameInput).sendKeys(address);
    }
}
