package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.TestDataLoader;

public class HomePageTest extends BaseTest {
    HomePage homePage;
//    TestDataLoader testDataLoader;

    @BeforeClass
    public void initPageObjects() {
        homePage = new HomePage(driver);
    }

    @Test
    public void verifyHomePageTitle() {
        test = extent.createTest("Verify Home Page Title");
        homePage.loadMainURL();
        String expectedTitle = TestDataLoader.get("homepage.title");
        Assert.assertEquals(homePage.getPageTitle(), expectedTitle);
        test.info("Verified title: " + expectedTitle);
    }

    @Test
    public void verifyLogoIsDisplayed() {
        test = extent.createTest("Verify Logo is Displayed");
        homePage.loadMainURL();
        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo should be visible");
        test.info("Logo is displayed on homepage");
    }
}
