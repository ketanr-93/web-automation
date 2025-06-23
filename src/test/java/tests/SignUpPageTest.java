package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignUpPage;
import utils.TestDataLoader;

public class SignUpPageTest extends BaseTest {
    SignUpPage signUpPage;

    @BeforeClass
    public void initPageObjects() {
        signUpPage = new SignUpPage(driver);
    }

    @BeforeMethod
    public void navigateToMainURL() {
        driver.get(TestDataLoader.get("main.url"));
    }

    @Test(priority = 1)
    public void verifySignUpPageTitle() {
        test = extent.createTest("Verify Sign Up Page Title");
        signUpPage.navigateToSignUpPage();
        String expectedTitle = TestDataLoader.get("signuppage.title");
        Assert.assertEquals(signUpPage.getPageTitle(), expectedTitle);
        test.info("Verified title: " + expectedTitle);
    }

    @Test(priority = 2)
    public void verifySignUpAndLoginElementsPresent() {
        test = extent.createTest("Verify Sign Up and User Login related elements are visible on the page");
        signUpPage.navigateToSignUpPage();
        signUpPage.verifySignUpAndLoginElementsPresent(test);
    }



}
