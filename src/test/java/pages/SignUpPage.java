package pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import locators.SignUpPageLocators;
import org.testng.asserts.SoftAssert;
import locators.SignUpPageLocators;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void navigateToSignUpPage() {
        driver.findElement(SignUpPageLocators.SIGNUP_LOGIN_LINK).click();
    }

    public void loadMainURL() {
        driver.get("https://automationexercise.com/");
    }

    public void verifySignUpAndLoginElementsPresent(ExtentTest test)
    {
        SoftAssert softAssert = new SoftAssert();

        try {
            softAssert.assertTrue(driver.findElement(SignUpPageLocators.LOGIN_TO_YOUR_ACCOUNT_TEXT).isDisplayed(), "Login To Your Account Text is displayed");
            softAssert.assertTrue(driver.findElement(SignUpPageLocators.NEW_USER_SIGNUP_TEXT).isDisplayed(), "New User SignUp Text is displayed");
            softAssert.assertTrue(driver.findElement(SignUpPageLocators.EMAIL_ADDRESS_TEXT_FIELD).isDisplayed(), "Email Address Text Field is displayed");
            softAssert.assertTrue(driver.findElement(SignUpPageLocators.PASSWORD_TEXT_FIELD).isDisplayed(), "Password Text Field is displayed");

            softAssert.assertAll();
            test.pass("All expected elements were displayed");
        }catch (AssertionError ae)
        {
            test.fail("One or more soft assertions failed: " + ae.getMessage());
            throw ae; // Required so TestNG still marks test as failed
        } catch (Exception e) {
            throw e;
        }


    }

}
