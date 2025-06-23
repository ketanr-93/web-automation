package pages;

import locators.HomePageLocators;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void loadMainURL() {
        driver.get("https://automationexercise.com/");
    }

    public boolean isLogoDisplayed() {
        return driver.findElement(HomePageLocators.LOGO).isDisplayed();
    }
}
