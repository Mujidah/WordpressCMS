package ReusableMethods;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import pages.ReadPage;

public class LogoutSuccessfully {
    private WebDriver driver;

    public LogoutSuccessfully(WebDriver driver){
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
    
    public void logout() {
        ReadPage readPage = new ReadPage(driver);
        readPage.clickProfileImage();
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.verifyLogoutButtonIsDisplayed();
        profilePage.clickLogoutButton();
    }
}
