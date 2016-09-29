package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private final By logIn = By.xpath(".//*[@data-ng-show='btn_login']");
    private final By userName = By.className("person_name");
    private final By uName = By.id("email_username");
    private final By pass = By.id("password");
    private final By signIn = By.id("login");
    private final By logOut = By.xpath(".//*[@data-ng-click='logout()']");

    public void login() {
        /*System.setProperty("webdriver.chrome.driver", "drivers/geckodriver.exe");
        System.setProperty("selenide.browser", "firefox");*/
        open("http://192.168.240.71/home");
        $(logIn).click();
        $(uName).setValue("iharas");
        $(pass).setValue("Gf#z62F");
        $(signIn).click();
    }

    public void logot() {
        login();
        $(userName).click();
        $(logOut).click();
    }
}
