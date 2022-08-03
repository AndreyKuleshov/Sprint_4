package ru.praktikum_services.qa_scooter;

import org.junit.Assert;
import org.junit.Test;
import ru.praktikum_services.qa_scooter.pages.MainPage;

import java.util.ArrayList;

public class HeaderLogoClickTest extends BaseChromeTest {
    MainPage page = new MainPage(driver);
    @Test
    public void clickScooterLogoReturnToMainPageTest(){
        page.clickTopOrderButton().clickScooterLogo();
        Assert.assertEquals("Urls don't match", driver.getCurrentUrl(), page.getMainPageUrl());
    }
    @Test
    public void clickYandexTest() {
        page.clickYandexButton();
        ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        Assert.assertEquals("Urls don't match", driver.getCurrentUrl(), page.getYandexPageUrl());
        driver.close();
        driver.switchTo().window(newTb.get(0));
    }
}
