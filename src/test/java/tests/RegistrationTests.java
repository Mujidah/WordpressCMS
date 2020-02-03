package tests;

import base.baseTests;
import ReusableMethods.LoginSuccessfully;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;

import java.io.IOException;
import java.util.Random;

public class RegistrationTests extends baseTests {

    @Test(priority = 1)
    public void testRegisterWithExistingEmail() throws IOException {
        navigateToHome();
        HomePage homePage = new HomePage(driver);
        homePage.clickGetStarted();
        RegistrationPage registerPage = new RegistrationPage(driver);
        registerPage.enterEmail("alabi.mujidah@gmail.com");
        registerPage.enterUsername("Mujidah");
        registerPage.verifyExistingEmailErrorIsDisplayed();
 
    }

    @Test(priority = 2)
    public void testRegisterWithExistingUsername() throws IOException {
        navigateToHome();
        HomePage homePage = new HomePage(driver);
        homePage.clickGetStarted();
        RegistrationPage registerPage = new RegistrationPage(driver);
        registerPage.enterUsername("Mujidah");
        registerPage.enterPassword("Password1");
        registerPage.verifyExistingUsernameErrorIsDisplayed();
 
    }
    
    @Test(priority = 3)
    public void testRegisterSuccessfully() throws IOException {
        navigateToHome();
        HomePage homePage = new HomePage(driver);
        homePage.clickGetStarted();
        RegistrationPage registerPage = new RegistrationPage(driver); 
        Random randomGenerator = new Random();  
        int randomInt = randomGenerator.nextInt(1000);  
        registerPage.enterEmail("alabi.mujidah"+ randomInt +"@gmail.com");
        registerPage.enterUsername("Mujidah" + randomInt);
        registerPage.enterPassword("Password1@");
        registerPage.verifyCreateButtonIsDisplayed();
        registerPage.clickCreateButton();
        registerPage.clickSiteType();
        registerPage.enterSiteTopic("Test Topic");
        registerPage.clickContinueButton();
        registerPage.enterSiteTitle("Test title");
        registerPage.clickContinueButton();
        registerPage.enterDomain("mjay");
        registerPage.selectFilter();
        registerPage.selectDomainOption();
        registerPage.selectSitePlan();
        registerPage.verifySitePlanIsDisplayed();
    }
}
