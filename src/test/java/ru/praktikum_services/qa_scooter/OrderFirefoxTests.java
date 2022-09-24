package ru.praktikum_services.qa_scooter;

import org.junit.Assert;
import org.junit.Test;
import ru.praktikum_services.qa_scooter.pages.MainPage;

import static ru.praktikum_services.qa_scooter.TestData.*;

public class OrderFirefoxTests extends BaseFirefoxTest {
    MainPage page = new MainPage(driver);

    @Test
    public void topButtonOrderTest() {
        Assert.assertTrue(
                page.clickTopOrderButton()
                .setName(NAME1)
                .setSurname(SURNAME1)
                .setAddress(CITY1)
                .setMetroStationSokol()
                .setPhone(PHONE1)
                .clickNextButton()
                .setDeliveryDate(DELIVERY_DATE1)
                .setOrderLengthTwoDays()
                .setScooterColourBlack()
                .setComment(COMMENT1)
                .orderScooterButtonClick()
                .orderConfirmButtonClick()
                .orderIsPlaced());
    }
    @Test
    public void bottomButtonOrderTest() {
        Assert.assertTrue(
                page.clickBottomOrderButton()
                .setName(NAME2)
                .setSurname(SURNAME2)
                .setAddress(CITY2)
                .setMetroStationLihobory()
                .setPhone(PHONE2)
                .clickNextButton()
                .setDeliveryDate(DELIVERY_DATE2)
                .setOrderLengthSevenDays()
                .setScooterColourGrey()
                .setComment(COMMENT2)
                .orderScooterButtonClick()
                .orderConfirmButtonClick()
                .orderIsPlaced());
    }

}
