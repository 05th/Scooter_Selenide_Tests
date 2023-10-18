package pom;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class MainPage {

    private WebDriver driver;
    private String baseUrl = "https://qa-scooter.praktikum-services.ru/";
    private SelenideElement topOrderButton = $(byXpath(".//button[@class='Button_Button__ra12g']"));
    private SelenideElement lowerOrderButton = $(byXpath(".//button[contains(@class, 'Button_Middle__1CSJM')]"));
    private SelenideElement headerOfQuestions = $(byXpath(".//div[text()='Вопросы о важном']"));
    private SelenideElement cookieButton = $(byXpath("//*[@id='rcc-confirm-button']"));

    public MainPage (WebDriver driver) {
        this.driver = driver;
    }


}
