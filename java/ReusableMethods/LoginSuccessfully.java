package ReusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;
import pages.LoginPage;
import pages.ReadPage;

import java.io.IOException;

public class LoginSuccessfully {
    private WebDriver driver;

    public LoginSuccessfully(WebDriver driver){
        this.driver = driver;
    }

    public void login() {

        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("alabi.mujidah@gmail.com");
        loginPage.clickContinueButton();
        loginPage.enterPassword("Fyzilone1@");
        loginPage.clickLoginButton();
        ReadPage readPage = new ReadPage(driver);
        readPage.verifyProfileImageIsPresent();

    }
}
