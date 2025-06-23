package locators;

import org.openqa.selenium.By;

public class SignUpPageLocators {
    public static final By SIGNUP_LOGIN_LINK = By.xpath("//a[contains(text(),'Signup / Login')]");
    public static final By NEW_USER_SIGNUP_TEXT = By.xpath("//h2[normalize-space()='New User Signup!']");
    public static final By EMAIL_ADDRESS_TEXT_FIELD = By.xpath("//input[@data-qa='login-email']");
    public static final By PASSWORD_TEXT_FIELD = By.xpath("//input[@placeholder='Password']");
    public static final By LOGIN_TO_YOUR_ACCOUNT_TEXT = By.xpath("//h2[normalize-space()='Login to your account']");
    // Add more locators here
}
