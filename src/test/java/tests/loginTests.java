package tests;

import base.baseTests;
import ReusableMethods.LoginSuccessfully;
import org.testng.annotations.Test;
import pages.EmployeesPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ReadPage;

import java.io.IOException;

public class loginTests extends baseTests{

    @Test(priority = 1)
    public void testLoginWithInvalidUsername() throws IOException {
        navigateToHome();
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("alabi.mujidah@gmal.com");
        loginPage.verifyContinueButtonIsPresent();
        loginPage.clickContinueButton();
        loginPage.verifyInvalidUsernameErrorMsgIsDisplayed();
    }
    
    @Test(priority = 2)
    public void testLoginWithInvalidPassword() throws IOException {
        navigateToHome();
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("alabi.mujidah@gmail.com");
        loginPage.clickContinueButton();
        loginPage.enterPassword("Fyzilone1");
        loginPage.verifyLoginButtonIsPresent();
        loginPage.clickLoginButton();
        loginPage.verifyInvalidPasswordErrorMsgIsDisplayed();
    }

    @Test(priority = 3)
    public void testLoginSuccessfully() throws IOException {
        navigateToHome();
        LoginSuccessfully loginSuccessfully = new LoginSuccessfully(driver);
        loginSuccessfully.login();
        ReadPage readPage = new ReadPage(driver);
        readPage.verifyProfileImageIsPresent();
        readPage.verifynewPostIsPresent();
    }
}
