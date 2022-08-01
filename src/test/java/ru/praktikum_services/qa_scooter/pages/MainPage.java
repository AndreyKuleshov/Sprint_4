package ru.praktikum_services.qa_scooter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum_services.qa_scooter.MainPageLocators;

import java.time.Duration;

public class MainPage {
    MainPageLocators locator = new MainPageLocators();
    private final WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitForLoadAndScrollToQuestions() {
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(locator.questionsHeader));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(locator.questionsHeader));
    }
    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }
}
